<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "shophead.jsp"%>


<h3 style="text-align:center;"> アンパン 購買</h3>


<%@ include file = "shopmid.jsp"%>

<div class="form-group">
アンパンは 最大１５個まで　購買出来ます。<br> 値段：１２０円<br>
アンパン:<input type="number" class="form"  min="0" max="15" name="beanbread"><br>

</div>

<%@ include file = "shopfoot.jsp"%>