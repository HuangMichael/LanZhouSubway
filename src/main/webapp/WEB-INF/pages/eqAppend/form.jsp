<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form class="form-horizontal" id="form" method="post">
    <div class="form-group">
        <div class="col-md-12">
                    <div class="form-group">
                <label for="id" class="col-md-2 control-label">序号</label>
                <div class="col-md-4">
                    <input class="form-control" id="id" name="id" v-model="eqAppend.id" />
                </div>
            </div>
            <div class="form-group">
                <label for="applicant" class="col-md-2 control-label">申请人</label>
                <div class="col-md-4">
                    <input class="form-control" id="applicant" name="applicant" v-model="eqAppend.applicant"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="applyDate" class="col-md-2 control-label">申请日期</label>
                <div class="col-md-4">
                    <input class="form-control" id="applyDate" name="applyDate" v-model="eqAppend.applyDate"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="applyDep" class="col-md-2 control-label">申请部门</label>
                <div class="col-md-4">
                    <input class="form-control" id="applyDep" name="applyDep" v-model="eqAppend.applyDep"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="approver" class="col-md-2 control-label">批准人</label>
                <div class="col-md-4">
                    <input class="form-control" id="approver" name="approver" v-model="eqAppend.approver"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="handler" class="col-md-2 control-label">经办人</label>
                <div class="col-md-4">
                    <input class="form-control" id="handler" name="handler" v-model="eqAppend.handler"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="purpose" class="col-md-2 control-label">申请原因</label>
                <div class="col-md-4">
                    <input class="form-control" id="purpose" name="purpose" v-model="eqAppend.purpose"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="receiver" class="col-md-2 control-label">接收人</label>
                <div class="col-md-4">
                    <input class="form-control" id="receiver" name="receiver" v-model="eqAppend.receiver"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="equipmentId" class="col-md-2 control-label">设备</label>
                <div class="col-md-4">
                    <input class="form-control" id="equipmentId" name="equipmentId" v-model="eqAppend.equipmentId"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="authKey" class="col-md-2 control-label">授权码</label>
                <div class="col-md-4">
                    <input class="form-control" id="authKey" name="authKey" v-model="eqAppend.authKey"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="status" class="col-md-2 control-label">状态</label>
                <div class="col-md-4">
                    <input class="form-control" id="status" name="status" v-model="eqAppend.status"  required/>
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