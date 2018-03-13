/**
 * Created by huangbin on 2018-3-1 09:46:42.

 */


$(function () {


    dataTableName = "#locationListTable";
    docName = "位置信息";
    mainObject = "location";
    formName = "#form";


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


    var searchVue = new Vue({
        el: "#searchBox"
    });

    searchModel = [
        {"param": "locName", "paramDesc": "位置名称"},
        {"param": "status", "paramDesc": "状态"}
    ];


    initSelect();


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
                return "<button type='button' class='btn btn-xs btn-default command-upload' data-row-id='" + row.id + "'><span class='fa fa-upload'></span></button> "
            },
            "commands": function (column, row) {
                return "<button type='button' class='btn btn-xs btn-default command-edit' data-row-id='" + row.id + "' onclick='edit(" + row.id + ")'><span class='fa fa-pencil'></span></button> " +
                    "<button type='button' class='btn btn-xs btn-default command-delete' data-row-id='" + row.id + "' onclick='del(" + row.id + ")'><span class='fa fa-trash-o'></span></button>";
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
            location: null
        }
    });


    validateForm.call(validateOptions);


});


/**
 * ɾ����¼
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
                                showMessageBox("info", "记录删除成功!");
                                $(dataTableName).bootgrid("reload");
                            }
                        },
                        error: function (msg) {
                            showMessageBox("danger", "记录删除失败!");
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
    vdm.$set("location", object);
    $("#editModal").modal("show");
}


function save() {
    var object = getFormDataAsJSON(formName);
    var location = JSON.parse(object);
    var url = "/location/save";
    var obj = {
        location: location
    }
    $.post(url, obj, function (data) {
        if (data.result) {
            $("#editModal").modal("hide");
            $(dataTableName).bootgrid("reload");
            showMessageBox("info", data["resultDesc"]);
        } else {
            showMessageBox("danger", data["resultDesc"]);
        }
    })
}

