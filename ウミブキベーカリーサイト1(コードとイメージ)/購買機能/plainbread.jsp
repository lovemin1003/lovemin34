<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "shophead.jsp"%>


<h3 style="text-align:center;"> 食パン 購買</h3>


<%@ include file = "shopmid.jsp"%>
<div class="form-group">
食パンは　最大１０個まで　購買出来ます。<br> 値段：２８０円
<br>
基本の食パン:<input type="number" class="form"  min="0" max="10" name="normalplain"><br>
栗食パン:<input type="number" class="form"  min="0" max="10" name="nutplain"><br>
チョコ食パン:<input type="number" class="form"  min="0" max="10" name="chocoplain"><br>
ミルク食パン:<input type="number" class="form"  min="0" max="10" name="milkplain"><br>
コーン食パン:<input type="number" class="form"  min="0" max="10" name="cornplain">
</div>

<%@ include file = "shopfoot.jsp"%>