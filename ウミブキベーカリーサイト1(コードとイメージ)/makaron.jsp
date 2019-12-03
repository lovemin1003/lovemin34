<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "shophead.jsp"%>


<h3 style="text-align:center;"> マカロン 購買</h3>


<%@ include file = "shopmid.jsp"%>
<div class="form-group">
マカロンは　最大２５個まで　購買出来ます。 <br>値段：１５０円 <br>
プレーン マカロン:<input type="number" class="form"  min="0" max="25" name="planemakaron"><br>
チョコ マカロン:<input type="number" class="form"  min="0" max="25" name="chocomakaron"><br>
苺 マカロン:<input type="number" class="form"  min="0" max="25" name="berrymakaron"><br>
チーズ マカロン:<input type="number" class="form"  min="0" max="25" name="cheesemakaron"><br>
抹茶 マカロン:<input type="number" class="form"  min="0" max="25" name="greenmakaron"><br>

</div>

<%@ include file = "shopfoot.jsp"%>