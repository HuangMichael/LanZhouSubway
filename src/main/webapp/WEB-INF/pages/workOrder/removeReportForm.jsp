<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form class="form-horizontal" id="removeReportForm" method="post">
    <div class="form-group">
        <div class="col-md-12">
            <div class="form-group">
                <label for="reason" class="col-md-2 control-label">移除原因</label>
                <div class="col-md-10">
                    <input class="form-control" id="id" name="id" type="hidden"/>
                    <textarea class="form-control" id="reason" name="reason"  required/>
                </div>
            </div>
        </div>
    </div>
    <div class="modal-footer">
        <button type="button" class="btn btn-default"
                data-dismiss="modal"> 取消
        </button>
        <button id="removeReportBtn" name="removeReportBtn" class="btn btn-danger">移除
        </button>
    </div>
</form>