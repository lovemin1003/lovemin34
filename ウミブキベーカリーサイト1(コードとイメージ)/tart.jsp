<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "shophead.jsp"%>


<h3 style="text-align:center;"> タルト 購買</h3>


<%@ include file = "shopmid.jsp"%>

<div class="form-group">
タルトは　最大２５個まで　購買出来ます。 <br>値段：１５０円 <br>
チーズタルト:<input type="number" class="form"  min="0" max="25" name="cheesetart"><br>
エッグタルト:<input type="number" class="form"  min="0" max="25" name="eggtart"><br>
クルミタルト:<input type="number" class="form"  min="0" max="25" name="walnuttart"><br>

</div>

<%@ include file = "shopfoot.jsp"%>