<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>
</body>
<script type="text/javascript">
	//스마트 기기에서 접속했을 때와 그렇지 ㅇ낳을 때 다른 웹 애플리케이션 실행 
	//네이버나 구글의 형식 

	//스마트 기기의 운영체제 배열을 생성 
	//안드로이드는 태블릿과 스마트폰을 구분하지 않음. 
	//iOS는 ipad와 다른 기기를 구분함.
	var smarts = [ "iphone", "ipod", "android" ]
	
	//배열을 순회 
	//javascript에서 반복문의 i는 값이 아니고 인덱스 
	var s =false;
	for(i in smarts){
		if(navigator.userAgent.toLowerCase().indexOf(smarts[i])>-1){
			s=true;
			break;
		}		
	}
	if(s==true){
		location.href="https://www.apple.com"
	}else{
		location.href="https://www.google.com"
	}
</script>
</html>
