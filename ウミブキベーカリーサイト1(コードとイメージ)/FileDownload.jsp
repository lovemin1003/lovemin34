<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String filename = request.getParameter("filename");
	String folder = request.getServletContext().getRealPath("/Storage");
	
	File file = new File(folder,filename);
	
	filename = "attachment;filename=" + new String(URLEncoder.encode(filename, "UTF-8")).replace("//+", " ");
	response.setHeader("Content-Disposition", filename);
	response.setHeader("Content-Length", file.length()+"");

	out.clear();
	
	out = pageContext.pushBody();
	
	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
	BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());
	
	byte[] b = new byte[(int)file.length()];
	bis.read(b, 0, b.length);
	bos.write(b);
	
	bis.close();
	bos.close();
%>

<script>
	history.back();
</script>