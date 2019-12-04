<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "shophead.jsp"%>

<h3 style="text-align:center;" >二種類以上　購買</h3>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>

<%@ include file = "shopmid.jsp"%>


<div class="form-group">
<h4>二種類以上　購買する場合　最大　７０００円まで　購買出来ます。</h4>

<br>
<br>

<script>

$(document).ready(function() { 
	$(".식빵1").click(function() {
		$("#식빵2").show();
		
    });
});
</script>
<input id="a"  class="식빵1 btn btn-primary form" style="width:260px;background-color: #2FF00F;" type="button" value="様々な食べ方がある　食パン"></input>
<fieldset id="식빵2" style="display:none">
食パンは　最大１０個まで　購買出来ます。<br> 値段：２８０円
<br>
基本の食パン:<input type="number" class="form"  min="0" max="10" name="normalplain"><br>
栗食パン:<input type="number" class="form"  min="0" max="10" name="nutplain"><br>
チョコ食パン:<input type="number" class="form"  min="0" max="10" name="chocoplain"><br>
ミルク食パン:<input type="number" class="form"  min="0" max="10" name="milkplain"><br>
コーン食パン:<input type="number" class="form"  min="0" max="10" name="cornplain">

</fieldset>



<script>
$(document).ready(function() { 
	$(".케이크1").click(function() {
		$("#케이크2").show();
    });
});
</script>
<input id="a" class="케이크1 btn btn-primary form" style="width:260px;background-color: white; color: black;" type="button" value="愛おしい人と共に！ ケーキ"></input>
<fieldset id="케이크2" style="display:none">
ケーキは　最大３個まで　購買出来ます。<br> 値段：１８００円 <br>
チョコケーキ:<input type="number" class="form"  min="0" max="3" name="chococake"><br>
生クリームケーキ:<input type="number" class="form"  min="0" max="3" name="creamcake"><br>
苺ケーキ:<input type="number" class="form"  min="0" max="3" name="berrycake"><br>
チーズケーキ:<input type="number" class="form"  min="0" max="3" name="cheesecake"><br>
さつま芋ケーキ:<input type="number" class="form"  min="0" max="3" name="sweetpotatocake">
</fieldset>

<script>
$(document).ready(function() { 
	$(".메론빵1").click(function() {
		$("#메론빵2").show();
    });
});
</script>
<input id="a" class="메론빵1 btn btn-primary form" style="width:260px;background-color: yellowgreen;" type="button" value="本物のメロンが入った メロンパン"></input>
<fieldset id="메론빵2" style="display:none">
メロンパンは　最大１５個まで　購買出来ます。<br> 値段：１５０円<br>
クリームあり:<input type="number" class="form"  min="0" max="15" name="creamplus"><br>
クリームなし:<input type="number" class="form"  min="0" max="15" name="creamless"><br>
</fieldset>

<script>
$(document).ready(function() { 
	$(".소라빵1").click(function() {
		$("#소라빵2").show();
    });
});
</script>
<input id="a" class="소라빵1 btn btn-primary form" style="width:260px;background-color: #FF8C80; color: black;" type="button" value="常連さんの 人気メニュー コロネ"></input>
<fieldset id="소라빵2" style="display:none">
コロネは　最大１５個まで　購買出来ます。<br> 値段：１２０円 <br>
チョココロネ:<input type="number" class="form"  min="0" max="15" name="chococorone"><br>
カボチャコロネ:<input type="number" class="form"  min="0" max="15" name="pumpkincorone"><br>
苺コロネ:<input type="number" class="form"  min="0" max="15" name="berrycorone"><br>

</fieldset>


<script>
$(document).ready(function() { 
	$(".단팥빵1").click(function() {
		$("#단팥빵2").show();
    });
});
</script>
<input id="a" class="단팥빵1 btn btn-primary form" style="width:260px;background-color: orange;" type="button" value="うちの看板メニュー アンパン"></input>
<fieldset id="단팥빵2" style="display:none">
アンパンは 最大１５個まで　購買出来ます。<br> 値段：１２０円<br>
アンパン:<input type="number" class="form"  min="0" max="15" name="beanbread"><br>
</fieldset>

<script>
$(document).ready(function() { 
	$(".머핀1").click(function() {
		$("#머핀2").show();
    });
});
</script>
<input id="a" class="머핀1 btn btn-primary form" style="width:260px;background-color: #259A0A;" type="button" value="食事でもおやつでも マフィン"></input>
<fieldset id="머핀2" style="display:none">
マフィンは　最大１０個まで　購買出来ます。<br> 値段：１５０円 <br>
チョコ マフィン:<input type="number" class="form"  min="0" max="10" name="chocomuffin"><br>
プレーン マフィン:<input type="number" class="form"  min="0" max="10" name="planemuffin"><br>
蜂蜜 マフィン:<input type="number" class="form"  min="0" max="10" name="honeymuffin"><br>
</fieldset>

<script>
$(document).ready(function() { 
	$(".코로케1").click(function() {
		$("#코로케2").show();
    });
});
</script>
<input id="a" class="코로케1 btn btn-primary form" style="width:260px;background-color: yellow; color:black;" type="button" value="揚げ物のアイドル コロッケ"></input>
<fieldset id="코로케2" style="display:none">
コロッケは 最大１0個まで 購買出来ます。<br> 値段：１６０円 <br>
じゃが芋コロッケ:<input type="number" class="form"  min="0" max="10" name="potatokoroke"><br>
カレーコロッケ:<input type="number" class="form"  min="0" max="10" name="currykoroke"><br>
野菜コロッケ:<input type="number" class="form"  min="0" max="10" name="vegekoroke"><br>
</fieldset>

<script>
$(document).ready(function() { 
	$(".크루아상1").click(function() {
		$("#크루아상2").show();
    });
});
</script>
<input id="a" class="크루아상1 btn btn-primary form" style="width:260px;background-color: blue;" type="button" value="バターの幸せ クロワッサン"></input>
<fieldset id="크루아상2" style="display:none">
クロワッサンは　最大１２個まで　購買出来ます。<br> 値段：１４０円 <br>
基本のクロワッサン:<input type="number" class="form"  min="0" max="12" name="croissant"><br>
チョコクロワッサン:<input type="number" class="form"  min="0" max="12" name="chococroissant"><br>
アーモンドクロワッサン:<input type="number" class="form"  min="0" max="12" name="almondcroissant"><br>
</fieldset>

<script>
$(document).ready(function() { 
	$(".샌드위치1").click(function() {
		$("#샌드위치2").show();
    });
});
</script>
<input id="a" class="샌드위치1 btn btn-primary form" style="width:260px;background-color: #7F00FF;" type="button" value="忙しい人のために！ サンドイッチ"></input>
<fieldset id="샌드위치2" style="display:none">
サンドイッチは　最大５個まで　購買出来ます。 <br>値段：５５０円 <br>
野菜サンドイッチ:<input type="number" class="form"  min="0" max="5" name="vegesandwich"><br>
チキンサンドイッチ:<input type="number" class="form"  min="0" max="5" name="chickensandwich"><br>
ビーフサンドイッチ:<input type="number" class="form"  min="0" max="5" name="beefsandwich"><br>
ハムサンドイッチ:<input type="number" class="form"  min="0" max="5" name="hamsandwich"><br>
卵サンドイッチ:<input type="number" class="form"  min="0" max="5" name="eggsandwich"><br>
</fieldset>

<script>
$(document).ready(function() { 
	$(".슈크림빵1").click(function() {
		$("#슈크림빵2").show();
    });
});
</script>
<input id="a" class="슈크림빵1 btn btn-primary form" style="width:260px;background-color: #EEEE82; color:black;" type="button" value="ソフトな味 シュークリームパン"></input>
<fieldset id="슈크림빵2" style="display:none">
シュークリームパンは　最大１５個まで　購買出来ます。<br> 値段：１２０円 <br>
シュークリームパン:<input type="number" class="form"  min="0" max="15" name="choucream"><br>
</fieldset>

<script>
$(document).ready(function() { 
	$(".타르트1").click(function() {
		$("#타르트2").show();
    });
});
</script>
<input id="a" class="타르트1 btn btn-primary form" style="width:260px;background-color: cyan; color:black;" type="button" value="パイ上のアート タルト"></input>
<fieldset id="타르트2" style="display:none">
タルトは　最大２５個まで　購買出来ます。 <br>値段：１５０円 <br>
チーズタルト:<input type="number" class="form"  min="0" max="25" name="cheesetart"><br>
エッグタルト:<input type="number" class="form"  min="0" max="25" name="eggtart"><br>
クルミタルト:<input type="number" class="form"  min="0" max="25" name="walnuttart"><br>
</fieldset>

<script>
$(document).ready(function() { 
	$(".마카롱1").click(function() {
		$("#마카롱2").show();
    });
});
</script>
<input id="a" class="마카롱1 btn btn-primary form" style="width:260px;background-color: pink;" type="button" value="一口の幸せ マカロン"></input>
<fieldset id="마카롱2" style="display:none">
マカロンは　最大２５個まで　購買出来ます。 <br>値段：１５０円 <br>
プレーン マカロン:<input type="number" class="form"  min="0" max="25" name="planemakaron"><br>
チョコ マカロン:<input type="number" class="form"  min="0" max="25" name="chocomakaron"><br>
苺 マカロン:<input type="number" class="form"  min="0" max="25" name="berrymakaron"><br>
チーズ マカロン:<input type="number" class="form"  min="0" max="25" name="cheesemakaron"><br>
抹茶 マカロン:<input type="number" class="form"  min="0" max="25" name="greenmakaron"><br>

</fieldset>

<script>
$(document).ready(function() { 
	$(".다쿠아즈1").click(function() {
		$("#다쿠아즈2").show();
    });
});
</script>
<input id="a" class="다쿠아즈1 btn btn-primary form" style="width:260px;background-color: #A52A0A;" type="button" value="花よりダックワース"></input>
<fieldset id="다쿠아즈2" style="display:none">
ダックワースは　最大20個まで　購買出来ます。<br>（１個当たり１００ｇ） <br>値段：１６０円（１００ｇ当たり） <br>
ダックワース:<input type="number" class="form"  min="0" max="20" name="dacquoise"><br>

</fieldset>

<script>
$(document).ready(function() { 
	$(".초코칩쿠키1").click(function() {
		$("#초코칩쿠키2").show();
    });
});
</script>
<input id="a" class="초코칩쿠키1 btn btn-primary form" style="width:260px;background-color: #800000;" type="button" value="クッキー王 チョコチップクッキー"></input>
<fieldset id="초코칩쿠키2" style="display:none">
チョコチップクッキーは　最大２０個まで　購買出来ます。<br>（１個当たり１００ｇ） <br>値段：１８０円（１００ｇ当たり）<br>
チョコチップクッキー:<input type="number" class="form"  min="0" max="20" name="chocochip"><br>

</fieldset>

<script>
$(document).ready(function() { 
	$(".사브레1").click(function() {
		$("#사브레2").show();
    });
});
</script>
<input id="a" class="사브레1 btn btn-primary form" style="width:260px;background-color: #905020;" type="button" value="カリカリで甘いな サブレ"></input>
<fieldset id="사브레2" style="display:none">
サブレは　最大２０個まで　購買出来ます。<br>（１個当たり１００ｇ）<br> 値段：１８０円（１００ｇ当たり） <br>
基本のサブレ:<input type="number" class="form"  min="0" max="20" name="sabre"><br>
チョコサブレ:<input type="number" class="form"  min="0" max="20" name="chocosabre"><br>
</fieldset>

<script>
$(document).ready(function() { 
	$(".진저브레드1").click(function() {
		$("#진저브레드2").show();
    });
});
</script>
<input id="a" class="진저브레드1 btn btn-primary form" style="width:260px;background-color: #809040;" type="button" value="可愛い ジンジャーブレッド"></input>
<fieldset id="진저브레드2" style="display:none">
ジンジャーブは　最大３0個まで　購買出来ます。<br> 値段：１００円<br>
ジンジャーブレッド:<input type="number" class="form"  min="0" max="30" name="gingerbread"><br>

</fieldset>

</div>

<%@ include file = "shopfoot.jsp"%>
