<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form class="form-horizontal" id="form" method="post">
    <div class="form-group">
        <div class="col-md-12">
                    <div class="form-group">
                <label for="id" class="col-md-2 control-label">序号</label>
                <div class="col-md-4">
                    <input class="form-control" id="id" name="id" v-model="eqClass.id"/>
                </div>
            </div>
            <div class="form-group">
                <label for="class_name" class="col-md-2 control-label">分类名称</label>
                <div class="col-md-4">
                    <input class="form-control" id="class_name" name="class_name" v-model="eqClass.class_name"/>
                </div>
            </div>
            <div class="form-group">
                <label for="class_level" class="col-md-2 control-label">分类级别</label>
                <div class="col-md-4">
                    <input class="form-control" id="class_level" name="class_level" v-model="eqClass.class_level"/>
                </div>
            </div>
            <div class="form-group">
                <label for="has_child" class="col-md-2 control-label">是否有子分类</label>
                <div class="col-md-4">
                    <input class="form-control" id="has_child" name="has_child" v-model="eqClass.has_child"/>
                </div>
            </div>
            <div class="form-group">
                <label for="limit_hours" class="col-md-2 control-label">维修时限</label>
                <div class="col-md-4">
                    <input class="form-control" id="limit_hours" name="limit_hours" v-model="eqClass.limit_hours"/>
                </div>
            </div>
            <div class="form-group">
                <label for="parent_id" class="col-md-2 control-label">上级分类</label>
                <div class="col-md-4">
                    <input class="form-control" id="parent_id" name="parent_id" v-model="eqClass.parent_id"/>
                </div>
            </div>
            <div class="form-group">
                <label for="sort_no" class="col-md-2 control-label">排序</label>
                <div class="col-md-4">
                    <input class="form-control" id="sort_no" name="sort_no" v-model="eqClass.sort_no"/>
                </div>
            </div>
            <div class="form-group">
                <label for="status" class="col-md-2 control-label">状态</label>
                <div class="col-md-4">
                    <input class="form-control" id="status" name="status" v-model="eqClass.status"/>
                </div>
            </div>
        </div>
    </div>
    <div class="modal-footer">
        <button type="button" class="btn btn-default"
                data-dismiss="modal">关闭
        </button>
        <button type="button" id="saveBtn" name="saveBtn"
                class="btn btn-danger">保存
        </button>
    </div>
    </div>
</form>