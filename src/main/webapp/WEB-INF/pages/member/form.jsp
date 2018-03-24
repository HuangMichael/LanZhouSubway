<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form class="form-horizontal" id="form" method="post">
    <div class="form-group">
        <div class="col-md-12">
            <div class="form-group">
                <label for="cardNo" class="col-md-2 control-label">会员卡号</label>
                <div class="col-md-4">
                    <input class="form-control" id="id" name="id" v-model="member.id"   type="hidden"/>
                    <input class="form-control" id="cardNo" name="cardNo" v-model="member.cardNo" />
                </div>
                <label for="name" class="col-md-2 control-label">会员姓名</label>
                <div class="col-md-4">
                    <input class="form-control" id="name" name="name" v-model="member.name" />
                </div>
            </div>
            <div class="form-group">
                <label for="createTime" class="col-md-2 control-label">创建时间</label>
                <div class="col-md-4">
                    <input class="form-control" id="createTime" name="createTime" v-model="member.createTime"  required/>
                </div>
                <label for="enterDate" class="col-md-2 control-label">加入时间</label>
                <div class="col-md-4">
                    <input class="form-control" id="enterDate" name="enterDate" v-model="member.enterDate"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="memberType" class="col-md-2 control-label">会员类型</label>
                <div class="col-md-4">
                    <input class="form-control" id="memberType" name="memberType" v-model="member.memberType"  required/>
                </div>
            </div>
            <div class="form-group">
                <label for="sortNo" class="col-md-2 control-label">排序</label>
                <div class="col-md-4">
                    <input class="form-control" id="sortNo" name="sortNo" v-model="member.sortNo"/>
                </div>
            </div>
            <div class="form-group">
                <label for="status" class="col-md-2 control-label">状态</label>
                <div class="col-md-4">
                    <input class="form-control" id="status" name="status" v-model="member.status"  required/>
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