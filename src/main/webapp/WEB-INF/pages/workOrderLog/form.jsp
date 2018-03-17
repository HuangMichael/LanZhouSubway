<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form class="form-horizontal" id="form" method="post">
    <div class="form-group">
        <div class="col-md-12">
                    <div class="form-group">
                <label for="id" class="col-md-2 control-label">序号</label>
                <div class="col-md-4">
                    <input class="form-control" id="id" name="id" v-model="workOrderLog.id" />
                </div>
            </div>
            <div class="form-group">
                <label for="content" class="col-md-2 control-label">内容</label>
                <div class="col-md-4">
                    <input class="form-control" id="content" name="content" v-model="workOrderLog.content"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="order_state" class="col-md-2 control-label">工单状态</label>
                <div class="col-md-4">
                    <input class="form-control" id="order_state" name="order_state" v-model="workOrderLog.order_state"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="order_state_time" class="col-md-2 control-label">工单状态时间</label>
                <div class="col-md-4">
                    <input class="form-control" id="order_state_time" name="order_state_time" v-model="workOrderLog.order_state_time"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="work_order_id" class="col-md-2 control-label">工单</label>
                <div class="col-md-4">
                    <input class="form-control" id="work_order_id" name="work_order_id" v-model="workOrderLog.work_order_id"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="creator" class="col-md-2 control-label">创建人</label>
                <div class="col-md-4">
                    <input class="form-control" id="creator" name="creator" v-model="workOrderLog.creator"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="sort_no" class="col-md-2 control-label">排序</label>
                <div class="col-md-4">
                    <input class="form-control" id="sort_no" name="sort_no" v-model="workOrderLog.sort_no"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="status" class="col-md-2 control-label">状态</label>
                <div class="col-md-4">
                    <input class="form-control" id="status" name="status" v-model="workOrderLog.status"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="auth_key" class="col-md-2 control-label">授权</label>
                <div class="col-md-4">
                    <input class="form-control" id="auth_key" name="auth_key" v-model="workOrderLog.auth_key"  required/>
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