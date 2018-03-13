/**
 * Created by huangbin on 2018-3-1 09:46:42.

 */


$(function () {
    dataTableName = "#unitListTable";
    docName = "外委单位";
    mainObject = "unit";


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
        {"param": "name", "paramDesc": "单位名称"},
        {"param": "status", "paramDesc":"状态"}
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

    });


    $("#searchBtn").trigger("click");


    vdm = new Vue({
        el: formName,
        data: {
            "unit": null
        }
    });
    initSelect();

    validateForm.call(validateOptions);


});


/**
 * @param id
 */
function del(id) {

    var url = getMainObject() + "/delete/" + id;
    if (id) {
        bootbox.confirm({
            message: "确定删除该记录么？",
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
    vdm.$set("unit", object);
    $("#editModal").modal("show");
}


/**
 * �༭��¼
 */
function add() {
    vdm.$set("unit", null);
    $("#editModal").modal("show");
}


