<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "shophead.jsp"%>


<h3 style="text-align:center;"> チョコチップクッキー 購買</h3>


<%@ include file = "shopmid.jsp"%>
<div class="form-group">
チョコチップクッキーは　最大２０個まで　購買出来ます。（１個当たり１００ｇ） <br>値段：１８０円（１００ｇ当たり）<br>
チョコチップクッキー:<input type="number" class="form"  min="0" max="20" name="chocochip"><br>

</div>

<%@ include file = "shopfoot.jsp"%>