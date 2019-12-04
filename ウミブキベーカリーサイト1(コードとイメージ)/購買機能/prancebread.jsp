<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "shophead.jsp"%>


<h3 style="text-align:center;"> クロワッサン 購買</h3>


<%@ include file = "shopmid.jsp"%>

<div class="form-group">
クロワッサンは　最大１２個まで　購買出来ます。<br> 値段：１４０円 <br>
基本のクロワッサン:<input type="number" class="form"  min="0" max="12" name="croissant"><br>
チョコクロワッサン:<input type="number" class="form"  min="0" max="12" name="chococroissant"><br>
アーモンドクロワッサン:<input type="number" class="form"  min="0" max="12" name="almondcroissant"><br>

</div>

<%@ include file = "shopfoot.jsp"%>