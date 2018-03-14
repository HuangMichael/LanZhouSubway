<%@ page contentType="text/html;charset=UTF-8" %>
<table id="unitListTable" class="table table-bordered table-hover table-striped">
    <thead>
    <tr>
        <th data-column-id="id" data-type="numeric" data-identifier="true" data-visible="false" data-width="10%">ID</th>
        <th data-column-id="id" data-width="5%">序号</th>
        <th data-column-id="name" data-width="10%">单位名称</th>
        <th data-column-id="unitDesc" data-width="10%">单位描述</th>
        <th data-column-id="contact" data-width="10%">联系人</th>
        <th data-column-id="telephone" data-width="10%">联系电话</th>
        <th data-column-id="commands" data-formatter="commands" data-sortable="false" data-width="10%">编辑|删除</th>
    </tr>
    </thead>
    <tbody>

    <template v-for="u in unitList">
        <tr>
            <td>{{u.id}}</td>
            <td>{{u.name}}</td>
            <td>{{u.unitDesc}}</td>
            <td>{{u.contact}}</td>
            <td>{{u.telephone}}</td>
            <td></td>
        </tr>
    </template>
    </tbody>
</table>


<script type="text/javascript">
    $(function () {

        var unitList = findListByUrl("/unit/findAll");
        var unitVue = new Vue({
            el: "#unitListTable",
            data: {
                unitList: unitList
            }
        });
    })

</script>

