<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form class="form-horizontal" id="form" method="post">
    <div class="form-group">
        <div class="col-md-12">
                    <div class="form-group">
                <label for="id" class="col-md-2 control-label">序号</label>
                <div class="col-md-4">
                    <input class="form-control" id="id" name="id" v-model="preMaint.id" />
                </div>
            </div>
            <div class="form-group">
                <label for="pmCode" class="col-md-2 control-label">编号</label>
                <div class="col-md-4">
                    <input class="form-control" id="pmCode" name="pmCode" v-model="preMaint.pmCode"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="createBy" class="col-md-2 control-label">创建人</label>
                <div class="col-md-4">
                    <input class="form-control" id="createBy" name="createBy" v-model="preMaint.createBy"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="createTime" class="col-md-2 control-label">创建时间</label>
                <div class="col-md-4">
                    <input class="form-control" id="createTime" name="createTime" v-model="preMaint.createTime"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="description" class="col-md-2 control-label">描述</label>
                <div class="col-md-4">
                    <input class="form-control" id="description" name="description" v-model="preMaint.description"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="equipmentId" class="col-md-2 control-label">设备</label>
                <div class="col-md-4">
                    <input class="form-control" id="equipmentId" name="equipmentId" v-model="preMaint.equipmentId"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="unitId" class="col-md-2 control-label">外委单位</label>
                <div class="col-md-4">
                    <input class="form-control" id="unitId" name="unitId" v-model="preMaint.unitId"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="status" class="col-md-2 control-label">状态</label>
                <div class="col-md-4">
                    <input class="form-control" id="status" name="status" v-model="preMaint.status"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="authKey" class="col-md-2 control-label">授权码</label>
                <div class="col-md-4">
                    <input class="form-control" id="authKey" name="authKey" v-model="preMaint.authKey"  required/>
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