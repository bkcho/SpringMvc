<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<%-- 전체적인 구조
Client 가  http://localhost:8888/basic/ 으로 서버에 접속한다.
Web.xml 마지막이 <url-pattern> "/" 로 끝나면 (servlet-mapping 에 맵핑된  DispatcherServlet 으로 보내라고 명시됨)
DispatcherServlet -> servlet-context.xml( <context:component-scan> 에 있는 패키지로 이동하여 @Controller를 찾는다.)
HomeController.java( @RequestMapping 에노테이션을 보면 "/" 로 들어오는  value값은 모두 아래함수가 처리한다.
아래함수를 모두 처리한 후   리턴값으로 view에 보내질 파일명을 입력  --%>


</body>
</html>
