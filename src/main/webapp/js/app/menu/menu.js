/**
 * Created by Administrator on 2016/9/27.
 */

$(function () {
    //先查询出所有的模块
    var userId = "";
    $.ajaxSettings.async = false;
    $.getJSON("/getCurrentUser", function (data) {
        userId = data.id;
    });
    var modules = getAllModules(1);
    var html = '';
    var moduleId = null;
    var apps = [];
    for (var x in modules) {
        if (modules[x]["resourceName"]) {
            html += '<li class="has-sub">';
            html += '   <a><i class="' + modules[x]["iconClass"] + '"></i> <span class="basicMenu-text">' + modules[x]["resourceName"] + '</span><span class="arrow"></span></a>';
            html += '     <ul class="sub" id="sub' + moduleId + '">';
            moduleId = modules[x]["id"];
            apps = getAppByModule(1, moduleId);
            for (var i in apps) {
                if (apps[i]["resourceName"]) {
                    html += '       <li><a ' + apps[i]["resourceUrl"] + '><span class="sub-basicMenu-text">' + apps[i]["resourceName"] + '</span></a></li>';
                }
            }
            html += '     </ul>';
            html += '</li>';
        }
    }
    $("#menuL1").append(html);
    $(".sub-basicMenu-text").parent().on("click", function () {
        $(this).css("cursor", "hand");
        var url = $(this).data("url");
        if (url) {

            $("#main-content").slideDown(function () {
                $("#main-content").load(url, function () {
                    $(this).removeData("url");

                });
            });

        }
    });
})


/**
 *
 * @returns {Array} 查询所有的一级模块
 */
function getAllModules(userId) {
    var modules = [];
    $.ajaxSettings.async = false;
    var url = "authority/loadModule/" + userId;
    $.getJSON(url, function (data) {
        modules = data;
    });
    return modules;
}

/**
 *
 * @returns {Array} 查询所有的一级模块
 */
function getAppByModule(userId, moduleId) {
    var modules = [];
    $.ajaxSettings.async = false;
    var url = "authority/loadApp/" + moduleId + "/" + userId;
    $.getJSON(url, function (data) {
        modules = data;
    });
    return modules;
}