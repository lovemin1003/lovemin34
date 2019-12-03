<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "shophead.jsp"%>


<h3 style="text-align:center;"> サンドイッチ 購買</h3>


<%@ include file = "shopmid.jsp"%>

<div class="form-group">
サンドイッチは　最大５個まで　購買出来ます。 <br>値段：５５０円 <br>
野菜サンドイッチ:<input type="number" class="form"  min="0" max="5" name="vegesandwich"><br>
チキンサンドイッチ:<input type="number" class="form"  min="0" max="5" name="chickensandwich"><br>
ビーフサンドイッチ:<input type="number" class="form"  min="0" max="5" name="beefsandwich"><br>
ハムサンドイッチ:<input type="number" class="form"  min="0" max="5" name="hamsandwich"><br>
卵サンドイッチ:<input type="number" class="form"  min="0" max="5" name="eggsandwich"><br>

</div>

<%@ include file = "shopfoot.jsp"%>