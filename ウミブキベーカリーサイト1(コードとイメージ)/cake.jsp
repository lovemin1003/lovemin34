<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "shophead.jsp"%>


<h3 style="text-align:center;"> ケーキ 購買</h3>


<%@ include file = "shopmid.jsp"%>

<div class="form-group">
ケーキは 最大３個まで　購買出来ます。<br> 値段：１８００円 <br>
チョコケーキ:<input type="number" class="form"  min="0" max="3" name="chococake"><br>
生クリームケーキ:<input type="number" class="form"  min="0" max="3" name="creamcake"><br>
苺ケーキ:<input type="number" class="form"  min="0" max="3" name="berrycake"><br>
チーズケーキ:<input type="number" class="form"  min="0" max="3" name="cheesecake"><br>
さつま芋ケーキ:<input type="number" class="form"  min="0" max="3" name="sweetpotatocake">

</div>

<%@ include file = "shopfoot.jsp"%>