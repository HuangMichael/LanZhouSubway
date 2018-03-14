<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form class="form-horizontal" id="form" method="post">
    <div class="form-group">
        <div class="col-md-12">
                    <div class="form-group">
                <label for="id" class="col-md-2 control-label">序号</label>
                <div class="col-md-4">
                    <input class="form-control" id="id" name="id"
                           v-model="woMaterialCost.id"/>
                </div>
            </div>
            <div class="form-group">
                <label for="matName" class="col-md-2 control-label">物料名称</label>
                <div class="col-md-4">
                    <input class="form-control" id="matName" name="matName"
                           v-model="woMaterialCost.matName"/>
                </div>
            </div>
            <div class="form-group">
                <label for="matPrice" class="col-md-2 control-label">单价</label>
                <div class="col-md-4">
                    <input class="form-control" id="matPrice" name="matPrice"
                           v-model="woMaterialCost.matPrice"/>
                </div>
            </div>
            <div class="form-group">
                <label for="matAmount" class="col-md-2 control-label">数量</label>
                <div class="col-md-4">
                    <input class="form-control" id="matAmount" name="matAmount"
                           v-model="woMaterialCost.matAmount"/>
                </div>
            </div>
            <div class="form-group">
                <label for="matModel" class="col-md-2 control-label">型号</label>
                <div class="col-md-4">
                    <input class="form-control" id="matModel" name="matModel"
                           v-model="woMaterialCost.matModel"/>
                </div>
            </div>
            <div class="form-group">
                <label for="workOrder_id" class="col-md-2 control-label">工单</label>
                <div class="col-md-4">
                    <input class="form-control" id="workOrder_id" name="workOrder_id"
                           v-model="woMaterialCost.workOrder_id"/>
                </div>
            </div>
            <div class="form-group">
                <label for="authKey" class="col-md-2 control-label">授权码</label>
                <div class="col-md-4">
                    <input class="form-control" id="authKey" name="authKey"
                           v-model="woMaterialCost.authKey"/>
                </div>
            </div>
            <div class="form-group">
                <label for="status" class="col-md-2 control-label">状态</label>
                <div class="col-md-4">
                    <input class="form-control" id="status" name="status"
                           v-model="woMaterialCost.status"/>
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