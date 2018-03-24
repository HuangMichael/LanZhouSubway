<%@ page contentType="text/html;charset=UTF-8" %>
<table id="unitListTable" class="table table-bordered table-hover table-striped"
       style="max-height: 300px;overflow: scroll">
    <thead>
    <tr>
        <th data-column-id="id" data-identifier="true" data-type="numeric" data-width="5%">序号</th>
        <th data-column-id="id" data-type="numeric" data-visible="false" data-width="10%">ID</th>
        <th data-column-id="name" data-width="25%">单位名称</th>
        <th data-column-id="contact" data-width="10%">联系人</th>
        <th data-column-id="telephone" data-width="10%">联系电话</th>
    </tr>
    </thead>
    <tbody>

    <template v-for="u in unitList">
        <tr>
            <td></td>
            <td>{{u.id}}</td>
            <td>{{u.name}}</td>
            <td>{{u.contact}}</td>
            <td>{{u.telephone}}</td>
        </tr>
    </template>
    </tbody>
</table>

<div class="modal-footer">
    <button type="button" class="btn btn-default" data-dismiss="modal">取消
    </button>
    <button type="button" id="selUnitBtn" name="selUnitBtn" class="btn btn-danger">确定
    </button>
</div>


<script type="text/javascript">
    $(function () {

        var unitList = findListByUrl("/unit/findAll");
        var unitVue = new Vue({
            el: "#unitListTable",
            data: {
                unitList: unitList
            }
        });
        $("#unitListTable").bootgrid({
            selection: true,
            multiSelect: true
        });


        $("#selUnitBtn").on("click", function () {
            var selected = $("#unitListTable").bootgrid("getSelectedRows");
            var classId = recordId;
            var unitId = selected.join(",");
            var url = "/eqClass/addUnit";
            var param = {
                classId: classId,
                unitId: unitId
            }
            $.post(url, param, function (data) {
                $("#eqClassModal").modal("hide");
                showMessage(data["result"], data["resultDesc"]);
            });
        });
    });
</script>

