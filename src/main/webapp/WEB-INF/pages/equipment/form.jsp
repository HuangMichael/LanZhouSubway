<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form class="form-horizontal" id="form" method="post">
    <div class="form-group">
        <div class="col-md-12">
                    <div class="form-group">
                <label for="id" class="col-md-2 control-label">���</label>
                <div class="col-md-4">
                    <input class="form-control" id="id" name="id"
                           v-model="equipment.id"/>
                </div>
            </div>
            <div class="form-group">
                <label for="eqCode" class="col-md-2 control-label">�豸���</label>
                <div class="col-md-4">
                    <input class="form-control" id="eqCode" name="eqCode"
                           v-model="equipment.eqCode"/>
                </div>
            </div>
            <div class="form-group">
                <label for="eamNo" class="col-md-2 control-label">�ʲ����</label>
                <div class="col-md-4">
                    <input class="form-control" id="eamNo" name="eamNo"
                           v-model="equipment.eamNo"/>
                </div>
            </div>
            <div class="form-group">
                <label for="description" class="col-md-2 control-label">����</label>
                <div class="col-md-4">
                    <input class="form-control" id="description" name="description"
                           v-model="equipment.description"/>
                </div>
            </div>
            <div class="form-group">
                <label for="eqModel" class="col-md-2 control-label">�豸�ͺ�</label>
                <div class="col-md-4">
                    <input class="form-control" id="eqModel" name="eqModel"
                           v-model="equipment.eqModel"/>
                </div>
            </div>
            <div class="form-group">
                <label for="expectedYear" class="col-md-2 control-label">Ԥ������</label>
                <div class="col-md-4">
                    <input class="form-control" id="expectedYear" name="expectedYear"
                           v-model="equipment.expectedYear"/>
                </div>
            </div>
            <div class="form-group">
                <label for="maintainer" class="col-md-2 control-label">ά����Ա</label>
                <div class="col-md-4">
                    <input class="form-control" id="maintainer" name="maintainer"
                           v-model="equipment.maintainer"/>
                </div>
            </div>
            <div class="form-group">
                <label for="manageLevel" class="col-md-2 control-label">����ȼ�</label>
                <div class="col-md-4">
                    <input class="form-control" id="manageLevel" name="manageLevel"
                           v-model="equipment.manageLevel"/>
                </div>
            </div>
            <div class="form-group">
                <label for="manager" class="col-md-2 control-label">������Ա</label>
                <div class="col-md-4">
                    <input class="form-control" id="manager" name="manager"
                           v-model="equipment.manager"/>
                </div>
            </div>
            <div class="form-group">
                <label for="netValue" class="col-md-2 control-label">��ֵ</label>
                <div class="col-md-4">
                    <input class="form-control" id="netValue" name="netValue"
                           v-model="equipment.netValue"/>
                </div>
            </div>
            <div class="form-group">
                <label for="originalValue" class="col-md-2 control-label">ԭֵ</label>
                <div class="col-md-4">
                    <input class="form-control" id="originalValue" name="originalValue"
                           v-model="equipment.originalValue"/>
                </div>
            </div>
            <div class="form-group">
                <label for="productDate" class="col-md-2 control-label">��������</label>
                <div class="col-md-4">
                    <input class="form-control" id="productDate" name="productDate"
                           v-model="equipment.productDate"/>
                </div>
            </div>
            <div class="form-group">
                <label for="productFactory" class="col-md-2 control-label">��������</label>
                <div class="col-md-4">
                    <input class="form-control" id="productFactory" name="productFactory"
                           v-model="equipment.productFactory"/>
                </div>
            </div>
            <div class="form-group">
                <label for="purchaseDate" class="col-md-2 control-label">��������</label>
                <div class="col-md-4">
                    <input class="form-control" id="purchaseDate" name="purchaseDate"
                           v-model="equipment.purchaseDate"/>
                </div>
            </div>
            <div class="form-group">
                <label for="purchasePrice" class="col-md-2 control-label">���ü۸�</label>
                <div class="col-md-4">
                    <input class="form-control" id="purchasePrice" name="purchasePrice"
                           v-model="equipment.purchasePrice"/>
                </div>
            </div>
            <div class="form-group">
                <label for="runDate" class="col-md-2 control-label">��������</label>
                <div class="col-md-4">
                    <input class="form-control" id="runDate" name="runDate"
                           v-model="equipment.runDate"/>
                </div>
            </div>
            <div class="form-group">
                <label for="setupDate" class="col-md-2 control-label">��װ����</label>
                <div class="col-md-4">
                    <input class="form-control" id="setupDate" name="setupDate"
                           v-model="equipment.setupDate"/>
                </div>
            </div>
            <div class="form-group">
                <label for="warrantyPeriod" class="col-md-2 control-label">��������</label>
                <div class="col-md-4">
                    <input class="form-control" id="warrantyPeriod" name="warrantyPeriod"
                           v-model="equipment.warrantyPeriod"/>
                </div>
            </div>
            <div class="form-group">
                <label for="eq_class_id" class="col-md-2 control-label">�豸����</label>
                <div class="col-md-4">
                    <input class="form-control" id="eq_class_id" name="eq_class_id"
                           v-model="equipment.eq_class_id"/>
                </div>
            </div>
            <div class="form-group">
                <label for="location_id" class="col-md-2 control-label">����λ��</label>
                <div class="col-md-4">
                    <input class="form-control" id="location_id" name="location_id"
                           v-model="equipment.location_id"/>
                </div>
            </div>
            <div class="form-group">
                <label for="authKey" class="col-md-2 control-label">��Ȩ��</label>
                <div class="col-md-4">
                    <input class="form-control" id="authKey" name="authKey"
                           v-model="equipment.authKey"/>
                </div>
            </div>
        </div>
    </div>
    <div class="modal-footer">
        <button type="button" class="btn btn-default"
                data-dismiss="modal">�ر�
        </button>
        <button id="saveBtn" name="saveBtn"
                class="btn btn-danger">����
        </button>
    </div>
    </div>
</form>