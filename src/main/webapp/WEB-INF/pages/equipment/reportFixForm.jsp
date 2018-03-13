<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form class="form-horizontal" id="form" method="post">
    <div class="form-group">
        <div class="col-md-12">
            <div class="form-group">
                <label for="id" class="col-md-2 control-label"></label>
                <div class="col-md-4">
                    <input class="form-control" id="id" name="id" v-model="equipment.id"/>
                </div>

                <label for="reporter" class="col-md-2 control-label">报修人</label>
                <div class="col-md-4">
                    <input class="form-control" id="reporter" name="reporter"/>
                </div>
            </div>
            <div class="form-group">
                <label for="orderDesc" class="col-md-2 control-label">故障描述</label>
                <div class="col-md-4">
                    <input class="form-control" id="orderDesc" name="orderDesc"/>
                </div>

                <label for="creater" class="col-md-2 control-label">录入人</label>
                <div class="col-md-4">
                    <input class="form-control" id="creater" name="creater"/>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default"
                        data-dismiss="modal"> 取消
                </button>
                <button id="saveBtn" name="saveBtn"
                        class="btn btn-danger">报修
                </button>
            </div>
        </div>
</form>