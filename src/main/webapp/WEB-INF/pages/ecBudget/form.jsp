<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form class="form-horizontal" id="form" method="post">
    <div class="form-group">
        <div class="col-md-12">
            <div class="form-group">
                <label for="amount" class="col-md-2 control-label">数量</label>
                <div class="col-md-4">
                    <input class="form-control" id="id" name="id" type="hidden" v-model="ecBudget.id"/>
                    <input class="form-control" id="amount" name="amount" v-model="ecBudget.amount"/>
                </div>

                <label for="applicant" class="col-md-2 control-label">申请人</label>
                <div class="col-md-4">
                    <input class="form-control" id="applicant" name="applicant" v-model="ecBudget.applicant"/>
                </div>
            </div>
            <div class="form-group">
                <label for="applyDate" class="col-md-2 control-label">申请日期</label>
                <div class="col-md-4">
                    <input class="form-control Wdate" id="applyDate" name="applyDate" v-model="ecBudget.applyDate"/>
                </div>

                <label for="auditDate" class="col-md-2 control-label">审核日期</label>
                <div class="col-md-4">
                    <input class="form-control Wdate" id="auditDate" name="auditDate" v-model="ecBudget.auditDate"/>
                </div>
            </div>
            <div class="form-group">
                <label for="auditor" class="col-md-2 control-label">审核人</label>
                <div class="col-md-4">
                    <input class="form-control" id="auditor" name="auditor" v-model="ecBudget.auditor"/>
                </div>

                <label for="authKey" class="col-md-2 control-label"></label>
                <div class="col-md-4">
                    <input class="form-control" id="authKey" name="authKey" v-model="ecBudget.authKey"/>
                </div>
            </div>
            <div class="form-group">
                <label for="confirmReason" class="col-md-2 control-label">确认原因</label>
                <div class="col-md-4">
                    <input class="form-control" id="confirmReason" name="confirmReason" v-model="ecBudget.confirmReason"/>
                </div>

                <label for="eCname" class="col-md-2 control-label">易耗品名称</label>
                <div class="col-md-4">
                    <input class="form-control" id="eCname" name="eCname" v-model="ecBudget.eCname"/>
                </div>
            </div>
            <div class="form-group">
                <label for="fixAdvice" class="col-md-2 control-label">维修建议</label>
                <div class="col-md-4">
                    <input class="form-control" id="fixAdvice" name="fixAdvice" v-model="ecBudget.fixAdvice"/>
                </div>

                <label for="leaderAdvice" class="col-md-2 control-label">领导意见</label>
                <div class="col-md-4">
                    <input class="form-control" id="leaderAdvice" name="leaderAdvice" v-model="ecBudget.leaderAdvice"/>
                </div>
            </div>
            <div class="form-group">
                <label for="permitted" class="col-md-2 control-label"></label>
                <div class="col-md-4">
                    <input class="form-control" id="permitted" name="permitted" v-model="ecBudget.permitted"/>
                </div>

                <label for="status" class="col-md-2 control-label">状态</label>
                <div class="col-md-4">
                    <input class="form-control" id="status" name="status" v-model="ecBudget.status"/>
                </div>
            </div>
            <div class="form-group">
                <label for="updateReason" class="col-md-2 control-label">更换原因</label>
                <div class="col-md-4">
                    <input class="form-control" id="updateReason" name="updateReason" v-model="ecBudget.updateReason"/>
                </div>

                <label for="locationId" class="col-md-2 control-label">所属位置</label>
                <div class="col-md-4">
                    <input class="form-control" id="locationId" name="location.id" v-model="ecBudget.location.id"/>
                </div>
            </div>
        </div>
    </div>
    <div class="modal-footer">
        <button type="button" class="btn btn-default"
                data-dismiss="modal">取消
        </button>
        <button id="saveBtn" name="saveBtn"
                class="btn btn-danger">保存
        </button>
    </div>
    </div>
</form>