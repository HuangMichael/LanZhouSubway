/**
 * Created by huangbin on 2018-3-1 09:46:42.

 */


$(function () {


    dataTableName = "#eqClassListTable";
    docName = "设备分类";
    mainObject = "eqClass";


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
            "eqClass": null
        }
    });
    initSelect();

    validateForm.call(validateOptions);
});

