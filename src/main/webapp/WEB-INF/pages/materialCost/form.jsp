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
                           v-model="materialCost.id"/>
                </div>
            </div>
            <div class="form-group">
                <label for="ecName" class="col-md-2 control-label">易耗品名称</label>
                <div class="col-md-4">
                    <input class="form-control" id="ecName" name="ecName"
                           v-model="materialCost.ecName"/>
                </div>
            </div>
            <div class="form-group">
                <label for="location" class="col-md-2 control-label">位置</label>
                <div class="col-md-4">
                    <input class="form-control" id="location" name="location"
                           v-model="materialCost.location"/>
                </div>
            </div>
            <div class="form-group">
                <label for="amount" class="col-md-2 control-label">数量</label>
                <div class="col-md-4">
                    <input class="form-control" id="amount" name="amount"
                           v-model="materialCost.amount"/>
                </div>
            </div>
            <div class="form-group">
                <label for="applicant" class="col-md-2 control-label">申请人</label>
                <div class="col-md-4">
                    <input class="form-control" id="applicant" name="applicant"
                           v-model="materialCost.applicant"/>
                </div>
            </div>
            <div class="form-group">
                <label for="applyDate" class="col-md-2 control-label">申请日期</label>
                <div class="col-md-4">
                    <input class="form-control" id="applyDate" name="applyDate"
                           v-model="materialCost.applyDate"/>
                </div>
            </div>
            <div class="form-group">
                <label for="authKey" class="col-md-2 control-label">授权码</label>
                <div class="col-md-4">
                    <input class="form-control" id="authKey" name="authKey"
                           v-model="materialCost.authKey"/>
                </div>
            </div>
            <div class="form-group">
                <label for="status" class="col-md-2 control-label">状态</label>
                <div class="col-md-4">
                    <input class="form-control" id="status" name="status"
                           v-model="materialCost.status"/>
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