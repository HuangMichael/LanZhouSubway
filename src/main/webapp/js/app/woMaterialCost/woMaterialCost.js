/**
* Created by huangbin on 2018-3-1 09:46:42.

*/


$(function () {


//�����������õ�������
dataTableName = "#woMaterialCostListTable";
docName = "������������";
mainObject = "woMaterialCost";
formName = "#form";


var searchVue = new Vue({
el: "#searchBox"
});



var validateOptions = {
message: '��ֵ��Ч ',
fields: {
"locName": {
message: 'λ��������Ч',
validators: {
notEmpty: {
message: 'λ�����Ʋ���Ϊ��!'
}
}
},

"locName": {
message: 'λ��������Ч',
validators: {
notEmpty: {
message: 'λ�����Ʋ���Ϊ��!'
}
}
},
"locDesc": {
message: 'λ��������Ч',
validators: {
notEmpty: {
message: 'λ����������Ϊ��!'
}
}
},
"locLevel": {
message: 'λ�ü�����Ч',
validators: {
notEmpty: {
message: 'λ�ü�����Ϊ��!'
}
}
},
"status": {
message: '״̬��Ч',
validators: {
notEmpty: {
message: '״̬����Ϊ��!'
}
}
},
}
};


searchModel = [
{"param": "locName", "paramDesc": "����"},
{"param": "status", "paramDesc": "״̬"}
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
"upload": function (column, row) {
return "
<button type='button' class='btn btn-xs btn-default command-upload' data-row-id='" + row.id + "'><span
        class='fa fa-upload'></span></button> "
},
"commands": function (column, row) {
return "
<button type='button' class='btn btn-xs btn-default command-edit' data-row-id='" + row.id + "'
        onclick='edit(" + row.id + ")'><span class='fa fa-pencil'></span></button> " +
"
<button type='button' class='btn btn-xs btn-default command-delete' data-row-id='" + row.id + "'
        onclick='del(" + row.id + ")'><span class='fa fa-trash-o'></span></button>";
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
"woMaterialCost": null
}
});
initSelect();

validateForm.call(validateOptions);


});


/**
* ɾ����¼
* @param id
*/
function del(id) {

var url = getMainObject() + "/delete/" + id;
if (id) {
bootbox.confirm({
message: "ȷ��ɾ���ü�¼ô",
buttons: {
confirm: {
label: 'ȷ��',
className: 'btn-success'
},
cancel: {
label: 'ȡ��',
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
* �༭��¼
*/
function edit(id) {
var object = findByIdAndObjectName(id, mainObject);
vdm.$set("woMaterialCost", object);
$("#editModal").modal("show");
}


/**
* �༭��¼
*/
function add() {
vdm.$set("woMaterialCost", null);
$("#editModal").modal("show");
}


