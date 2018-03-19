<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form class="form-horizontal" id="form" method="post">
    <div class="form-group">
        <div class="col-md-12">
            <div class="form-group">
                <label for="applicant" class="col-md-2 control-label">申请人</label>
                <div class="col-md-4">
                    <input class="form-control" id="id" name="id" v-model="eqAppend.id" TYPE="hidden"/>
                    <input class="form-control" id="applicant" name="applicant" v-model="eqAppend.applicant" required/>
                </div>

                <label for="applyDate" class="col-md-2 control-label">申请日期</label>
                <div class="col-md-4">
                    <input class="form-control Wdate myDateBox" id="applyDate" name="applyDate"
                           v-model="eqAppend.applyDate"
                           required/>
                </div>
            </div>
            <div class="form-group">
                <label for="applyDep" class="col-md-2 control-label">申请部门</label>
                <div class="col-md-4">
                    <input class="form-control" id="applyDep" name="applyDep" v-model="eqAppend.applyDep" required/>
                </div>

                <label for="purpose" class="col-md-2 control-label">申请原因</label>
                <div class="col-md-4">
                    <input class="form-control" id="purpose" name="purpose" v-model="eqAppend.purpose" required/>
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