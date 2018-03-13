/**
 * Created by huangbin on 2018-3-1 09:46:42.

 */


$(function () {
    dataTableName = "#equipmentListTable";
    docName = "设备信息";
    mainObject = "equipment";


    var searchVue = new Vue({
        el: "#searchBox"
    });


    var validateOptions = {
        message: ' ',
        fields: {
            "description": {
                message: '设备描述无效',
                validators: {
                    notEmpty: {
                        message: '设备描述不能为空'
                    }
                }
            },
            "status": {
                message: '状态不能为空',
                validators: {
                    notEmpty: {
                        message: '状态不能为空'
                    }
                }
            },
        }
    };


    searchModel = [
        {"param": "description", "paramDesc": "设备描述"},
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

            "reportFix": function (column, row) {
                return "<button type='button' class='btn btn-xs btn-default command-wrench' data-row-id='" + row.id + "' onclick='reportFix(" + row.id + ")'><span class='fa fa-wrench'></span></button> "
            }
            ,

            "commands": function (column, row) {
                return "<button type='button' class='btn btn-xs btn-default command-edit' data-row-id='" + row.id + "' onclick='edit(" + row.id + ")'><span class='fa fa-pencil'></span></button> " +
                    "<button type='button' class='btn btn-xs btn-default command-delete' data-row-id='" + row.id + "' onclick='del(" + row.id + ")'><span class='fa fa-trash-o'></span></button>";
            }
        },
        converters: {
            showStatus: {
                to: showStatus
            },
            showYes: {
                to: showYes
            }
        }
    });


    $("#searchBtn").trigger("click");


    vdm = new Vue({
        el: formName,
        data: {
            "equipment": null
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
 * �༭��¼
 */
function edit(id) {
    var object = findByIdAndObjectName(id, mainObject);
    vdm.$set("equipment", object);
    $("#editModal").modal("show");
}


/**
 * �༭��¼
 */
function add() {
    vdm.$set("equipment", null);
    $("#editModal").modal("show");
}

function reportFix(id) {
    $("#reportFixModal").modal("show");
}
