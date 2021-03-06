<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form class="form-horizontal" id="form" method="post">
    <div class="form-group">
        <div class="col-md-12">
            <div class="form-group">
                <label for="name" class="col-md-2 control-label">单位名称</label>
                <div class="col-md-4">
                    <input class="form-control" id="id" name="id" v-model="unit.id" type="hidden"/>
                    <input class="form-control" id="name" name="name" v-model="unit.name"/>
                </div>

                <label for="unitDesc" class="col-md-2 control-label">单位描述</label>
                <div class="col-md-4">
                    <input class="form-control" id="unitDesc" name="unitDesc" v-model="unit.unitDesc"/>
                </div>
            </div>
            <div class="form-group">
                <label for="contact" class="col-md-2 control-label">联系人</label>
                <div class="col-md-4">
                    <input class="form-control" id="contact" name="contact" v-model="unit.contact"/>
                </div>

                <label for="telephone" class="col-md-2 control-label">联系方式</label>
                <div class="col-md-4">
                    <input class="form-control" id="telephone" name="telephone" v-model="unit.telephone"/>
                </div>
            </div>
            <div class="form-group">
                <label for="workDays" class="col-md-2 control-label">工作制</label>
                <div class="col-md-4">
                    <input class="form-control" id="workDays" name="workDays" v-model="unit.workDays"/>
                </div>
                <label for="sortNo" class="col-md-2 control-label">排序</label>
                <div class="col-md-4">
                    <input class="form-control" id="sortNo" name="sortNo" v-model="unit.sortNo"/>
                </div>
            </div>
            <div class="form-group">
                <label for="isOut" class="col-md-2 control-label">是否外单位</label>
                <div class="col-md-4">
                    <select class="form-control" id="isOut" name="isOut" v-model="unit.isOut">
                        <option value="1" selected>是</option>
                        <option value="0">否</option>
                    </select>
                </div>
                <label for="status" class="col-md-2 control-label">状态</label>
                <div class="col-md-4">
                    <select class="form-control" id="status" name="status" v-model="unit.status">
                        <option value="1" selected>有效</option>
                        <option value="0">无效</option>
                    </select>
                </div>
            </div>
        </div>
    </div>
    <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">取消
        </button>
        <button id="saveBtn" name="saveBtn" class="btn btn-danger">保存
        </button>
    </div>
    </div>
</form>