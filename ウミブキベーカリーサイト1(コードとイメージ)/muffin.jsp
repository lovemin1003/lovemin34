<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "shophead.jsp"%>


<h3 style="text-align:center;"> マフィン 購買</h3>


<%@ include file = "shopmid.jsp"%>
<div class="form-group">
マフィンは　最大１０個まで　購買出来ます。<br> 値段：１５０円 <br>
チョコ マフィン:<input type="number" class="form"  min="0" max="10" name="chocomuffin"><br>
プレーン マフィン:<input type="number" class="form"  min="0" max="10" name="planemuffin"><br>
蜂蜜 マフィン:<input type="number" class="form"  min="0" max="10" name="honeymuffin"><br>

</div>

<%@ include file = "shopfoot.jsp"%>