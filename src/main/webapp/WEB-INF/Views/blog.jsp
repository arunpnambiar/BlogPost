<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
</head>

<body>
		${Bloglist}
	<center>
		<h2>Add Blog</h2>
		<form action="addBlog" method="post">
			<br />Blog Name:<input type="text" name="blogName"> <br />
			Description:<input type="text" name="blogDescription"> <br />
			<input type="submit" value="Submit">
		</form>
	</center>
</body>
</html>