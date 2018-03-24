<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form class="form-horizontal" id="form" method="post">
    <div class="form-group">
        <div class="col-md-12">
            <div class="form-group">
                <label for="planCode" class="col-md-2 control-label">计划编号</label>
                <div class="col-md-4">
                    <input class="form-control" id="id" name="id" v-model="preMaintPlan.id" type="hidden"/>
                    <input class="form-control" id="planCode" name="planCode" v-model="preMaintPlan.planCode"/>
                </div>

                <label for="planDesc" class="col-md-2 control-label">计划名称</label>
                <div class="col-md-4">
                    <input class="form-control" id="planDesc" name="planDesc" v-model="preMaintPlan.planDesc"/>
                </div>
            </div>
            <div class="form-group">
                <label for="exeState" class="col-md-2 control-label">执行状态</label>
                <div class="col-md-4">
                    <input class="form-control" id="exeState" name="exeState" v-model="preMaintPlan.exeState"/>
                </div>
                <label for="cron" class="col-md-2 control-label">周期表达式</label>
                <div class="col-md-4">
                    <input class="form-control" id="cron" name="cron" v-model="preMaintPlan.cron"/>
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