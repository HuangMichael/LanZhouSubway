<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form class="form-horizontal" id="form" method="post">
    <div class="form-group">
        <div class="col-md-12">
                    <div class="form-group">
                <label for="id" class="col-md-2 control-label">���</label>
                <div class="col-md-4">
                    <input class="form-control" id="id" name="id"
                           v-model="budget.id"/>
                </div>
            </div>
            <div class="form-group">
                <label for="applyDate" class="col-md-2 control-label">��������</label>
                <div class="col-md-4">
                    <input class="form-control" id="applyDate" name="applyDate"
                           v-model="budget.applyDate"/>
                </div>
            </div>
            <div class="form-group">
                <label for="applicant" class="col-md-2 control-label"> ������</label>
                <div class="col-md-4">
                    <input class="form-control" id="applicant" name="applicant"
                           v-model="budget.applicant"/>
                </div>
            </div>
            <div class="form-group">
                <label for="applyDep" class="col-md-2 control-label">���벿��</label>
                <div class="col-md-4">
                    <input class="form-control" id="applyDep" name="applyDep"
                           v-model="budget.applyDep"/>
                </div>
            </div>
            <div class="form-group">
                <label for="accessoryName" class="col-md-2 control-label">�������</label>
                <div class="col-md-4">
                    <input class="form-control" id="accessoryName" name="accessoryName"
                           v-model="budget.accessoryName"/>
                </div>
            </div>
            <div class="form-group">
                <label for="amount" class="col-md-2 control-label">����</label>
                <div class="col-md-4">
                    <input class="form-control" id="amount" name="amount"
                           v-model="budget.amount"/>
                </div>
            </div>
            <div class="form-group">
                <label for="specifications" class="col-md-2 control-label">���</label>
                <div class="col-md-4">
                    <input class="form-control" id="specifications" name="specifications"
                           v-model="budget.specifications"/>
                </div>
            </div>
            <div class="form-group">
                <label for="approver" class="col-md-2 control-label">��׼��</label>
                <div class="col-md-4">
                    <input class="form-control" id="approver" name="approver"
                           v-model="budget.approver"/>
                </div>
            </div>
            <div class="form-group">
                <label for="handler" class="col-md-2 control-label">������</label>
                <div class="col-md-4">
                    <input class="form-control" id="handler" name="handler"
                           v-model="budget.handler"/>
                </div>
            </div>
            <div class="form-group">
                <label for="purpose" class="col-md-2 control-label">����ԭ��</label>
                <div class="col-md-4">
                    <input class="form-control" id="purpose" name="purpose"
                           v-model="budget.purpose"/>
                </div>
            </div>
            <div class="form-group">
                <label for="receiver" class="col-md-2 control-label">������</label>
                <div class="col-md-4">
                    <input class="form-control" id="receiver" name="receiver"
                           v-model="budget.receiver"/>
                </div>
            </div>
            <div class="form-group">
                <label for="eqClass_id" class="col-md-2 control-label">�豸����</label>
                <div class="col-md-4">
                    <input class="form-control" id="eqClass_id" name="eqClass_id"
                           v-model="budget.eqClass_id"/>
                </div>
            </div>
            <div class="form-group">
                <label for="locationId" class="col-md-2 control-label">�豸λ��</label>
                <div class="col-md-4">
                    <input class="form-control" id="locationId" name="locationId"
                           v-model="budget.locationId"/>
                </div>
            </div>
            <div class="form-group">
                <label for="status" class="col-md-2 control-label">״̬</label>
                <div class="col-md-4">
                    <input class="form-control" id="status" name="status"
                           v-model="budget.status"/>
                </div>
            </div>
            <div class="form-group">
                <label for="authKey" class="col-md-2 control-label">��Ȩ��</label>
                <div class="col-md-4">
                    <input class="form-control" id="authKey" name="authKey"
                           v-model="budget.authKey"/>
                </div>
            </div>
        </div>
    </div>
    <div class="modal-footer">
        <button type="button" class="btn btn-default"
                data-dismiss="modal">�ر�
        </button>
        <button id="saveBtn" name="saveBtn"
                class="btn btn-danger">����
        </button>
    </div>
    </div>
</form>