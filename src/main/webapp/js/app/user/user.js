var object = null;
formName = "#detailForm";
$.ajaxSettings.async = false;
var validationConfig = {
    message: '该值无效 ',
    fields: {
        userName: {
            message: '用户名号无效',
            validators: {
                notEmpty: {
                    message: '用户名!'
                },
                stringLength: {
                    min: 3,
                    max: 20,
                    message: '用户名长度为3到20个字符'
                }
            }
        }
    }
};

$(function () {
    dataTableName = '#userDataTable';
    docName = "用户信息";
    mainObject = "user";
    //初始化从数据库获取列表数据
    searchModel = [{"param": "userName", "paramDesc": "用户名"}];
    locs = [];

    var person_location = "/commonData/findActivePerson";
    $.getJSON(person_location, function (data) {
        persons = data;
    });

    var recordId = null;
    // initBootGridMenu(dataTableName, null);


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
                return "<button type='button' class='btn btn-xs btn-default command-edit' data-row-id='" + row.id + "' onclick='edit(" + row.id + ")'><span class='fa fa-pencil'></span></button> " +
                    "<button type='button' class='btn btn-xs btn-default command-delete' data-row-id='" + row.id + "' onclick='del(" + row.id + ")'><span class='fa fa-trash-o'></span></button>";
            }
        },
        converters: {
            showStatus: {
                to: function (value) {
                    return (value) ? "有效" : "无效";
                }
            }

        }
    }).on("loaded.rs.jquery.bootgrid", function () {
        /* Executes after data is loaded and rendered */
        grid.find(".command-edit").on("click", function (e) {
            edit($(this).data("row-id"));
        }).end().find(".command-delete").on("click", function (e) {
            del($(this).data("row-id"));
        }).end().find(".command-upload").on("click", function (e) {
            recordId = $(this).data("row-id");
            showUpload();
        });
    });


    // initSelect.call();
    //初始化查询所有的
    validateForm.call(validationConfig);
    vdm = new Vue({
        el: formName,
        data: {
            user: null
        }
    });
});






