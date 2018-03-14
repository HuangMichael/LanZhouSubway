<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form class="form-horizontal" id="form" method="post">
    <div class="form-group">
        <div class="col-md-12">
            <div class="form-group">
                <label for="locationId" class="col-md-2 control-label">所属位置</label>
                <div class="col-md-4">
                    <input class="form-control" id="locationId" name="location.id" v-model="ecBudget.location.id"/>
                </div>
                <label for="updateReason" class="col-md-2 control-label">更换原因</label>
                <div class="col-md-4">
                    <input class="form-control" id="updateReason" name="updateReason" v-model="ecBudget.updateReason"/>
                </div>
            </div>
            <div class="form-group">
                <label for="ecName" class="col-md-2 control-label">易耗品名称</label>
                <div class="col-md-4">
                    <input class="form-control" id="ecName" name="ecName" v-model="ecBudget.ecName"/>
                </div>
                <label for="amount" class="col-md-2 control-label">数量</label>
                <div class="col-md-4">
                    <input class="form-control" id="id" name="id" type="hidden" v-model="ecBudget.id"/>
                    <input class="form-control" id="amount" name="amount" v-model="ecBudget.amount"/>
                </div>
            </div>
            <div class="form-group">
                <label for="applicant" class="col-md-2 control-label">申请人</label>
                <div class="col-md-4">
                    <input class="form-control" id="applicant" name="applicant" v-model="ecBudget.applicant"/>
                </div>
                <label for="applyDate" class="col-md-2 control-label">申请日期</label>
                <div class="col-md-4">
                    <input class="form-control Wdate" id="applyDate" name="applyDate" v-model="ecBudget.applyDate"/>
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