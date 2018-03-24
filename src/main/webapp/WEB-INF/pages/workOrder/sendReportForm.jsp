<%@ page contentType="text/html;charset=UTF-8" %>
<form class="form-horizontal" id="sendReportForm" method="post">
    <div class="form-group">
        <div class="col-md-12">
            <div class="form-group">
                <label for="selUnit" class="col-md-2 control-label">维修单位</label>
                <div class="col-md-4">
                    <input class="form-control" id="id" name="id" type="hidden"/>
                    <select class="form-control" id="selUnit" name="selUnit">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                    </select>
                </div>
                <label for="selDeadline" class="col-md-2 control-label">维修时限</label>
                <div class="col-md-4">
                    <input class="form-control myDateBox" id="selDeadline" name="selDeadline"/>
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