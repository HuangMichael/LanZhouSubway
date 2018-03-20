<%@ page contentType="text/html;charset=UTF-8" %>
<select class="form-control" id="location" onchange="search()">
    <template v-for="l in locations">
        <option value="{l.locName}">{{l.locDesc}}</option>
    </template>
</select>

<script type="text/javascript">

    var locations = findListByUrl("location/findMyLocations");
    console.log("locations-------------" + JSON.stringify(locations));
    new Vue({
        el: "#location",
        data: locations
    });

</script>