<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "shophead.jsp"%>


<h3 style="text-align:center;"> コロッケ 購買</h3>


<%@ include file = "shopmid.jsp"%>

<div class="form-group">
コロッケは 最大１0個まで 購買出来ます。<br> 値段：１６０円 <br>
じゃが芋コロッケ:<input type="number" class="form"  min="0" max="10" name="potatokoroke"><br>
カレーコロッケ:<input type="number" class="form"  min="0" max="10" name="currykoroke"><br>
野菜コロッケ:<input type="number" class="form"  min="0" max="10" name="vegekoroke"><br>

</div>

<%@ include file = "shopfoot.jsp"%>