/**
 * Created by huangbin on 2018-3-1 09:46:42.

 */


$(function () {


    dataTableName = "#workOrderListTable";
    docName = "报修单信息";
    mainObject = "workOrder";


    var searchVue = new Vue({
        el: "#searchBox"
    });


    searchModel = [
        {"param": "orderDesc", "paramDesc": "工单描述"},
        {"param": "orderState", "paramDesc": "工单状态"},
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
        converters: {
            showOrderState: {
                to: showOrderState
            },
            showStatus: {
                to: showStatus
            },
            reportType: {
                to: showReportType
            }
        }
    })


    $("#searchBtn").trigger("click");


    vdm = new Vue({
        el: formName,
        data: {
            "workOrder": null
        }
    });
    initSelect();


});


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




