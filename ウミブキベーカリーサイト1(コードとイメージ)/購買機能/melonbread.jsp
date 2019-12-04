
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "shophead.jsp"%>


<h3 style="text-align:center;"> メロンパン 購買</h3>


<%@ include file = "shopmid.jsp"%>
<div class="form-group">
メロンパンは　最大１５個まで　購買出来ます。<br> 値段：１５０円<br>
クリームあり:<input type="number" class="form"  min="0" max="15" name="creamplus"><br>
クリームなし:<input type="number" class="form"  min="0" max="15" name="creamless"><br>

</div>

<%@ include file = "shopfoot.jsp"%>