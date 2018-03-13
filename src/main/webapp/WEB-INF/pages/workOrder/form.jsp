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
                           v-model="workOrder.id"/>
                </div>
            </div>
            <div class="form-group">
                <label for="orderLine_no" class="col-md-2 control-label">�����к�</label>
                <div class="col-md-4">
                    <input class="form-control" id="orderLine_no" name="orderLine_no"
                           v-model="workOrder.orderLine_no"/>
                </div>
            </div>
            <div class="form-group">
                <label for="orderDesc" class="col-md-2 control-label">��������</label>
                <div class="col-md-4">
                    <input class="form-control" id="orderDesc" name="orderDesc"
                           v-model="workOrder.orderDesc"/>
                </div>
            </div>
            <div class="form-group">
                <label for="reporter" class="col-md-2 control-label">������</label>
                <div class="col-md-4">
                    <input class="form-control" id="reporter" name="reporter"
                           v-model="workOrder.reporter"/>
                </div>
            </div>
            <div class="form-group">
                <label for="reportType" class="col-md-2 control-label">���޷�ʽ</label>
                <div class="col-md-4">
                    <input class="form-control" id="reportType" name="reportType"
                           v-model="workOrder.reportType"/>
                </div>
            </div>
            <div class="form-group">
                <label for="reportTime" class="col-md-2 control-label">����ʱ��</label>
                <div class="col-md-4">
                    <input class="form-control" id="reportTime" name="reportTime"
                           v-model="workOrder.reportTime"/>
                </div>
            </div>
            <div class="form-group">
                <label for="creator" class="col-md-2 control-label">��¼��</label>
                <div class="col-md-4">
                    <input class="form-control" id="creator" name="creator"
                           v-model="workOrder.creator"/>
                </div>
            </div>
            <div class="form-group">
                <label for="deadline" class="col-md-2 control-label">ά������</label>
                <div class="col-md-4">
                    <input class="form-control" id="deadline" name="deadline"
                           v-model="workOrder.deadline"/>
                </div>
            </div>
            <div class="form-group">
                <label for="equipmentId" class="col-md-2 control-label">�豸</label>
                <div class="col-md-4">
                    <input class="form-control" id="equipmentId" name="equipmentId"
                           v-model="workOrder.equipmentId"/>
                </div>
            </div>
            <div class="form-group">
                <label for="unitId" class="col-md-2 control-label">ά�޵�λ</label>
                <div class="col-md-4">
                    <input class="form-control" id="unitId" name="unitId"
                           v-model="workOrder.unitId"/>
                </div>
            </div>
            <div class="form-group">
                <label for="expired" class="col-md-2 control-label">�Ƿ�����</label>
                <div class="col-md-4">
                    <input class="form-control" id="expired" name="expired"
                           v-model="workOrder.expired"/>
                </div>
            </div>
            <div class="form-group">
                <label for="status" class="col-md-2 control-label">״̬</label>
                <div class="col-md-4">
                    <input class="form-control" id="status" name="status"
                           v-model="workOrder.status"/>
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