<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "shophead.jsp"%>


<h3 style="text-align:center;"> コロネ 購買</h3>


<%@ include file = "shopmid.jsp"%>
<div class="form-group">
コロネは　最大１５個まで　購買出来ます。<br> 値段：１２０円 <br>
チョココロネ:<input type="number" class="form"  min="0" max="15" name="chococorone"><br>
カボチャコロネ:<input type="number" class="form"  min="0" max="15" name="pumpkincorone"><br>
苺コロネ:<input type="number" class="form"  min="0" max="15" name="berrycorone"><br>

</div>

<%@ include file = "shopfoot.jsp"%>