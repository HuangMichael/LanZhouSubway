<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form class="form-horizontal" id="form" method="post">
    <div class="form-group">
        <div class="col-md-12">
            <div class="form-group">
                <label for="applyDate" class="col-md-2 control-label">申请日期</label>
                <div class="col-md-4">
                    <input class="form-control" id="id" name="id" type="hidden"
                           v-model="budget.id"/>
                    <input class="form-control" id="applyDate" name="applyDate" v-model="budget.applyDate"/>
                </div>

                <label for="applicant" class="col-md-2 control-label">申请人</label>
                <div class="col-md-4">
                    <input class="form-control" id="applicant" name="applicant"
                           v-model="budget.applicant"/>
                </div>
            </div>
            <div class="form-group">
                <label for="applyDep" class="col-md-2 control-label">申请部门</label>
                <div class="col-md-4">
                    <input class="form-control" id="applyDep" name="applyDep"
                           v-model="budget.applyDep"/>
                </div>

                <label for="accessoryName" class="col-md-2 control-label">配件名称</label>
                <div class="col-md-4">
                    <input class="form-control" id="accessoryName" name="accessoryName"
                           v-model="budget.accessoryName"/>
                </div>
            </div>
            <div class="form-group">
                <label for="amount" class="col-md-2 control-label">数量</label>
                <div class="col-md-4">
                    <input class="form-control" id="amount" name="amount"
                           v-model="budget.amount"/>
                </div>

                <label for="specifications" class="col-md-2 control-label">规格</label>
                <div class="col-md-4">
                    <input class="form-control" id="specifications" name="specifications"
                           v-model="budget.specifications"/>
                </div>
            </div>
            <div class="form-group">
                <label for="approver" class="col-md-2 control-label">批准人</label>
                <div class="col-md-4">
                    <input class="form-control" id="approver" name="approver"
                           v-model="budget.approver"/>
                </div>

                <label for="handler" class="col-md-2 control-label">经办人</label>
                <div class="col-md-4">
                    <input class="form-control" id="handler" name="handler"
                           v-model="budget.handler"/>
                </div>
            </div>
            <div class="form-group">
                <label for="purpose" class="col-md-2 control-label">申请原因</label>
                <div class="col-md-4">
                    <input class="form-control" id="purpose" name="purpose"
                           v-model="budget.purpose"/>
                </div>

                <label for="receiver" class="col-md-2 control-label">接收人</label>
                <div class="col-md-4">
                    <input class="form-control" id="receiver" name="receiver"
                           v-model="budget.receiver"/>
                </div>
            </div>
            <div class="form-group">
                <label for="eqClass_id" class="col-md-2 control-label">设备分类</label>
                <div class="col-md-4">
                    <input class="form-control" id="eqClass_id" name="eqClass_id"
                           v-model="budget.eqClass_id"/>
                </div>

                <label for="locationId" class="col-md-2 control-label">设备位置</label>
                <div class="col-md-4">
                    <input class="form-control" id="locationId" name="locationId"
                           v-model="budget.locationId"/>
                </div>
            </div>
            <div class="form-group">
                <label for="status" class="col-md-2 control-label">状态</label>
                <div class="col-md-4">
                    <input class="form-control" id="status" name="status"
                           v-model="budget.status"/>
                </div>
            </div>
        </div>
    </div>
    <div class="modal-footer">
        <button type="button" class="btn btn-default"
                data-dismiss="modal">取消
        </button>
        <button id="saveBtn" name="saveBtn" class="btn btn-danger">保存
        </button>
    </div>
    </div>
</form>