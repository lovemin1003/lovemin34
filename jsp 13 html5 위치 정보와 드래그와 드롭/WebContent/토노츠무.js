var 토노삐=0;
var 츠무츠무=0;
var k=9999;


	
	for(var i=1; i<=k; i++)
	{
	 var z=Math.floor(Math.random() * 10);//자바 스크립트에서 난수 만들기
	 if (z % 2==0)
		 {
		 토노삐+=1;
		 }
	 else
		 {
		 츠무츠무+=1;
		 }
	 document.writeln("토노삐:"+토노삐+""+"<br>");
	 
	 document.writeln("츠무츠무:"+츠무츠무+"승"+"<br>");
	 postMessage(k);//누가 이기든 바로 웹페이지로 전달한다.
	}
