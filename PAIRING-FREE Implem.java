<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./css/bootstrap.min.css">
<link rel="sytlesheet" href="./css/mystyle.css">
<title>Insert title here</title>
</head>
<body
	style="background-image: url('./images/blue.jpg'); background-repeat: no-repeat;">
	<div class="container">
		<nav class="navbar navbar-expand-lg"> <a class="navbar-brand"
			href="#"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
			<div class="navbar-nav">
				<a class="nav-item nav-link active" href="#">Home <span
					class="sr-only"></span></a> 
					<a class="nav-item nav-link" href="#">Group Member</a> 
					<a class="nav-item nav-link" href="groupmanager.html">Group Manger</a>
					 <a class="nav-item nav-link" href="publicver.jsp">Public Verifier</a>
</div>
                             </div>
		</nav>
		<br>
		<h3>
			<br> Certificateless Public Integrity Checking Of Group Shared
			Data On Cloud Storage
		</h3>
		<br>
	</div>
	<div style="margin-top: 100px:">
		<div class="container">
			<div class="row">
				<div class="col-sm"></div>
				<div class="col-sm" style="border-style: solid;">
					<h1>LOGIN</h1>

					<form action="Login" method="post">
						
						
						<label class="myfont" style="margin-bottom: 10px;">Enter
							User Name</label><br /> 
							<input type="text" name="username" /><br />
						<br> 
			<label style="margin-bottom: 10px;">Enter  Password</label><br /> 
			<input type="password" style="margin-bottom: 10px;" name="password" /><br /> 
							
					<input type="submit" " value="Login" style="margin-top: 10px;"
							class="btn btn-success" /><br />
						<div style="margin-top: 15px;">
							<a href="Register1.jsp">Register</a>
					</form>

				</div>
			</div>
			<div class="col-sm"></div>
		</div>
	</div>
	</div>
	<div></div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./css/bootstrap.min.css">
<link rel="sytlesheet" href="./css/mystyle.css">
<title>Insert title here</title>
</head>
<body
	style="background-image: url('./images/blue.jpg'); background-repeat: no-repeat;">
	<div class="container">
		<nav class="navbar navbar-expand-lg"> <a class="navbar-brand"
			href="#"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
			<div class="navbar-nav">
				<a class="nav-item nav-link active" href="#">Home <span
				class="sr-only"></span></a> <a class="nav-item nav-link" href="#">Group
				Member</a> <a class="nav-item nav-link" href="groupmanager.html">Group
				Manger</a> <a class="nav-item nav-link" href="#">Public Verifier</a> <a
					class="nav-item nav-link" href="#">Cloud</a> <a
					class="nav-item nav-link" href="#">Logout</a>

			</div>
		</div>
		</nav>
		<br>
		<h3>
			<br> Certificateless Public Integrity Checking Of Group Shared
			Data On Cloud Storage
		</h3>
	</div>
	<div style="margin-top: 100px:">
		<div class="container">
			<div class="row">
				<div class="col-sm"></div>
				<div class="col-sm" style="border-style: solid;">
					<h1>LOGIN</h1>
					<% String message=(String)request.getAttribute("message");

if(message==null){%>

					<% }else{%>

					<p style="color: red;"><%=message %></p>
					<%} %>
					<form action="Login" method="post">
						<label class="myfont" style="margin-bottom: 10px;">Enter
				User Name</label><br /> <input type="text" name="username" /><br />
						<br> <label style="margin-bottom: 10px;">Enter
							Password</label><br /> <input type="password"
				style="margin-bottom: 10px;" name="password" /><br /> <input
						type="submit" value="Login" style="margin-top: 10px;"
							class="btn btn-success" /><br />
						<div style="margin-top: 15px;">
							<a href="register.html">Register</a>
					</form>

				</div>
			</div>
			<div class="col-sm"></div>
		</div>
	</div>
	</div>
	<div></div>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="./css/bootstrap.min.css">
<link rel="sytlesheet" href="./css/mystyle.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body
	style="background-image: url('./images/bg.jpg'); background-repeat: no-repeat;">
	<div class="container">
		<nav class="navbar navbar-expand-lg navbar-light bg-info"> <a
			class="navbar-brand" href="#"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
			<div class="navbar-nav">
				<a class="nav-item nav-link active" href="#">Home <span
					class="sr-only"></span></a> <a class="nav-item nav-link"
					href="creategroup.jsp">CREATE GROUP</a> <a
					class="nav-item nav-link" href="viewgroupmembers.jsp">view
				Group members</a> <a class="nav-item nav-link" href="#">view files</a>

				<a class="nav-item nav-link" href="index.jsp">Logout</a></div>
		</div>
                                     </nav>
		<br>
		<h3>
			<br> Certificateless Public Integrity Checking Of Group Shared
			Data On Cloud Storage
		</h3>
	</div>
	<div style="margin-top: 100px:">
		<div class="container">
			<div class="row">
				Welcome Manager
				<div class="col-sm"></div>
				<div class="col-sm"></div>
			</div>
			<div class="col-sm"></div>
		</div>
	</div>
	</div>
	<div></div>
</body>
</html>

<%@page import="com.model.UserFiles"%>
<%@page import="java.util.List"%>
<%@page import="com.database.DatabaseImplementation"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="./common/usernavigation.jsp" />
	<%
int userid=(Integer)session.getAttribute("userid");
DatabaseImplementation di=new DatabaseImplementation();
List<UserFiles> files=di.userFiles(userid);
%>
	<div class="container">
		<table class="table">
			<tr>
				<td>User Id</td>
				<td>File Name</td>
				<td>Download</td>
			</tr>
			<%
for(UserFiles uf: files){%>
			<tr>
				<td><%=uf.getUserid() %></td>
				<td><%=uf.getFileName() %></td>
				<td><a href="Download.jsp?fileName=<%=uf.getFileName()%>">Download</a></td>
			</tr>
			<% }%>

		</table>
	</div>
</body>
</html>
 
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.database.DatabaseImplementation"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="./css/bootstrap.min.css">
<link rel="sytlesheet" href="./css/mystyle.css">
<title>Insert title here</title>
<style>
h1 {
	text-align: center;
}
</style>
</head>
<body
	style="background-image: url('./images/blue.jpg'); background-repeat: no-repeat;">

	<div class="container">
		<nav class="navbar navbar-expand-lg navbar-light bg-info"> <a
			class="navbar-brand" href="#"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
			<div class="navbar-nav">
				<a class="nav-item nav-link active" href="#">Home <span
					class="sr-only"></span></a> <a class="nav-item nav-link" href="#">Admin</a>
				<a class="nav-item nav-link" href="#">User</a>

			</div>
		</div>
		</nav>
		<h3 style="padding: 30px;">Certificateless Public Integrity
			Checking Of Group Shared Data On Cloud Storage</h3>
	</div>

	<h1 style>REGISTER</h1>
	<div class="container">
		<div class="row" style="border-style: solid;">
			<div class="col-3"></div>
			<div class="col-3">

				<form action="register" method="post">                                                               <label class="myfont" style="margin-bottom: 10px;">Enter                                                                                          Name</label><br /> <input type="text" name="name1" /><br /> <label
				class="myfont" style="margin-bottom: 10px;">Enter DOB </label><br />
	<input type="date" name="date" /><br /> <label class="myfont"
	style="margin-bottom: 10px;">Enter Email</label><br />                                                                                   <input type="email" name="email" /><br /> <label class="myfont"
style="margin-bottom: 10px;">Enter Password</label><br />
 <input type="password" name="password" /><br /> <label>Select
			Gender</label><br /> <input type="radio" name="gender" value="male">
					Male<br> <input type="radio" name="gender" value="female">
					Female<br>
			</div>
			<div class="col-sm">
				<h1></h1>
				<label class="myfont" style="margin-bottom: 10px;">Enter Phone Number</label><br /> <input type="text" name="pnumber" /><br /> <label
class="myfont" style="margin-bottom: 10px;">Enter Adress</label><br />
<input type="text" name="adress" /><br /> <label for="cars">Choose a Group :</label> <select name="group">
					<%
DatabaseImplementation di=new DatabaseImplementation();
List<String> al=di.groups();
for(String s: al){%>
					<option value=<%=s %>><%=s %></option>
					<%}
%>
				</select> <input type="submit" " value="Register" style="margin-top: 10px;"
					class="btn btn-success" /><br />

				</form>
			</div>
		</div>
	</div>

</body>
</html>
 
<%@page import="com.model.UserFiles"%>
<%@page import="java.util.List"%>
<%@page import="com.database.DatabaseImplementation"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="./common/usernavigation.jsp" />
	<%
int userid=(Integer)session.getAttribute("userid");
DatabaseImplementation di=new DatabaseImplementation();
List<UserFiles> files=di.userReq(userid);
%>
	<div class="container">
		<table class="table">
			<tr>
				<td>User Id</td>
				<td>File Name</td>
				<td>Status</td>
			</tr>
	<%
for(UserFiles uf: files){%>
			<tr>
				<td><%=uf.getUserid() %></td>
				<td><%=uf.getFileName() %></td>
				<td><a href="#"=<%=uf.getFileName()%>"><%=uf.getStatus() %></a></td>
			</tr>
			<% }%>

		</table>
                            </div>
              </body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="./common/usernavigation.jsp" />
	<div class="container">
		<%
/* session.setAttribute("userid",um.getUserid()); 
session.setAttribute("userid",um.getName());  */
int userid=(Integer)session.getAttribute("userid");
%>
		welcome
		<%=(String)session.getAttribute("userName") %>
		<% String message=(String)request.getAttribute("message");

if(message==null){%>


		<% }else{%>

		<p style="color: red;"><%=message %></p>
		<%} %>
		<form action="uploadfile" method="post" enctype="multipart/form-data">

			<label>Enter File Name</label> <input type="text" name="fileName" />
			<input type="file" name="file"> <input type="hidden"
				value="<%=userid%>" name="userid" /> <input type="submit"
				value="submit" />
		</form>
	</div>

</body>
</html>

















<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./css/bootstrap.min.css">
<link rel="sytlesheet" href="./css/mystyle.css">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="./common/usernavigation.jsp" />
	<div style="margin-top: 100px:">
		<div class="container">
			<div class="row">
				<%
     String name= (String)session.getAttribute("userName");
     %>
				<h3 style="color: red; text-align: center;">
					Welcome
					<%=name %></h3>
				<div class="col-sm"></div>
				<div class="col-sm"></div>
			</div>
			<div class="col-sm"></div>
		</div>
	</div>
	</div>
	<div></div>
</body>
</html> 
