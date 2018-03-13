<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table id="userDataTable" class="table table-striped table-bordered table-hover">
    <thead>
    <tr>
        <th data-column-id="id" data-identifier="true" data-type="numeric" data-align="center" data-width="3%">序号</th>
        <th data-column-id="id" data-type="numeric" data-identifier="true" data-visible="false">ID</th>
        <th data-column-id="userName" data-sortable="true" data-width="5%">用户名</th>
        <th data-column-id="personName" data-sortable="true" data-width="5%">姓名</th>
        <th data-column-id="idCard" data-sortable="true" data-width="15%">身份证号</th>
        <th data-column-id="email" data-sortable="true" data-width="15%">电子邮箱</th>
        <th data-column-id="telephone" data-sortable="true" data-width="15%">联系电话</th>
        <th data-column-id="status" data-sortable="true" data-width="5%" data-converter="showStatus">状态</th>
        <th data-column-id="commands" data-sortable="true" data-width="5%" data-formatter="commands">编辑|删除</th>
    </tr>
    </thead>
</table>