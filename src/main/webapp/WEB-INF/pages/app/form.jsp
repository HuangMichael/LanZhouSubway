<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form class="form-horizontal" id="form" method="post">
    <div class="form-group">
        <div class="col-md-12">
            <div class="form-group">
                <label for="name" class="col-md-2 control-label">应用名称</label>
                <div class="col-md-4">
                    <input class="form-control" id="id" name="id" v-model="app.id" type="hidden"/>
                    <input class="form-control" id="name" name="name" v-model="app.name"/>
                </div>
                <label for="appDesc" class="col-md-2 control-label">应用描述</label>
                <div class="col-md-4">
                    <input class="form-control" id="appDesc" name="appDesc" v-model="app.appDesc"/>
                </div>
            </div>

            <div class="form-group">
                <label for="status" class="col-md-2 control-label">数据表</label>
                <div class="col-md-4">
                    <select class="form-control" id="tableConfig.id" v-model="app.tableConfig.id">
                        <template v-for="config in tableConfigs">
                            <option :value="option.id" v-if="config.id == app.tableConfig.id" selected>
                                {{config.tableName}}{{config.tableDesc}}
                            </option>
                            <option :value="option.id" v-else>
                                {{config.tableName}}{{config.tableDesc}}
                            </option>
                        </template>
                    </select>
                </div>
            </div>


            <div class="form-group">
                <label for="sortNo" class="col-md-2 control-label">排序</label>
                <div class="col-md-4">
                    <input class="form-control" id="sortNo" name="sortNo" v-model="app.sortNo"/>
                </div>
                <label for="status" class="col-md-2 control-label">状态</label>
                <div class="col-md-4">
                    <select class="form-control" id="status" v-model="app.status">
                        <option value="1" selected>有效</option>
                        <option value="0">无效</option>
                    </select>
                </div>
            </div>
        </div>
    </div>
    <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">取消
        </button>
        <button id="saveBtn" name="saveBtn" class="btn btn-danger">保存
        </button>
    </div>
</form>