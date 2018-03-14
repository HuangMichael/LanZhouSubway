/**
* Created by huangbin on 2018-3-1 09:46:42.

*/


$(function () {


//导出必须配置的两个量
dataTableName = "#${subDirName}ListTable";
docName = "${comment}";
mainObject = "${subDirName}";
formName = "#form";


var searchVue = new Vue({
el: "#searchBox"
});


var validateOptions = {
message: '该值无效 ',
fields: {
"locName": {
message: '位置名称无效',
validators: {
notEmpty: {
message: '位置名称不能为空!'
}
}
},

"locName": {
message: '位置名称无效',
validators: {
notEmpty: {
message: '位置名称不能为空!'
}
}
},
"locDesc": {
message: '位置描述无效',
validators: {
notEmpty: {
message: '位置描述不能为空!'
}
}
},
"locLevel": {
message: '位置级别无效',
validators: {
notEmpty: {
message: '位置级别不能为空!'
}
}
},
"status": {
message: '状态无效',
validators: {
notEmpty: {
message: '状态不能为空!'
}
}
},
}
};


searchModel = [
{"param": "locName", "paramDesc": "名称"},
{"param": "status", "paramDesc": "状态"}
];


var grid = $(dataTableName).bootgrid({
selection: true,
ajax: true,
post: function () {
return {
id: "b0df282a-0d67-40e5-8558-c9e93b7befed"
};
},
url: "/" + mainObject + "/data",
formatters: {
"commands": function (column, row) {
return edit_del_btn;
}
},
converters: {
showStatus: {
to: showStatus
}
}
})


$("#searchBtn").trigger("click");


vdm = new Vue({
el: formName,
data: {
"${subDirName}": null
}
});
initSelect();

validateForm.call(validateOptions);


});


/**
* 删除记录
* @param id
*/
function del(id) {

var url = getMainObject() + "/delete/" + id;
if (id) {
bootbox.confirm({
message: "确定删除该记录么",
buttons: {
confirm: {
label: '确定',
className: 'btn-success'
},
cancel: {
label: '取消',
className: 'btn-danger'
}
},
callback: function (result) {
if (result) {
$.ajax({
type: "GET",
url: url,
success: function (msg) {
if (msg) {
showMessage(msg.result, msg["resultDesc"]);
$(dataTableName).bootgrid("reload");
}
},
error: function (msg) {
showMessage(msg.result, msg["resultDesc"]);
}
});
}
}
});
}
}


/**
* 编辑记录
*/
function edit(id) {
var object = findByIdAndObjectName(id, mainObject);
vdm.$set("${subDirName}", object);
$("#editModal").modal("show");
}


/**
* 编辑记录
*/
function add() {
vdm.$set("${subDirName}", null);
$("#editModal").modal("show");
}


