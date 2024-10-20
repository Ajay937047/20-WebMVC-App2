<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
    <title>File Upload</title>
</head>
<body>
 <form method="post" enctype="multipart/form-data" action="/webapp/upload">
    <input type="file" name="file" />
    <button type="submit">Upload</button>
</form>
</body>
</html>