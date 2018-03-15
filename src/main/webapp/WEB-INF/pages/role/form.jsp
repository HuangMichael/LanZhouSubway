<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form class="form-horizontal" id="form" method="post">
    <div class="form-group">
        <div class="col-md-12">
            <div class="form-group">
                <label for="roleName" class="col-md-2 control-label">角色名称</label>
                <div class="col-md-4">
                    <input class="form-control" id="id" name="id" v-model="role.id" hidden/>
                    <input class="form-control" id="roleName" name="roleName" v-model="role.roleName"/>
                </div>

                <label for="roleDesc" class="col-md-2 control-label">角色描述</label>
                <div class="col-md-4">
                    <input class="form-control" id="roleDesc" name="roleDesc" v-model="role.roleDesc"/>
                </div>
            </div>
            <div class="form-group">
                <label for="sortNo" class="col-md-2 control-label">排序</label>
                <div class="col-md-4">
                    <input class="form-control" id="sortNo" name="sortNo" v-model="role.sortNo" required/>
                </div>
                <label for="status" class="col-md-2 control-label">状态</label>
                <div class="col-md-4">
                    <input class="form-control" id="status" name="status" v-model="role.status"/>
                </div>
            </div>
        </div>
    </div>
    <div class="modal-footer">
        <button type="button" class="btn btn-default"
                data-dismiss="modal">关闭
        </button>
        <button id="saveBtn" name="saveBtn"
                class="btn btn-danger">保存
        </button>
    </div>
    </div>
</form>