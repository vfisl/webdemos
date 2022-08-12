<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="register">
 Enter Name<input type="text" name="username"><br>Enter

 Enter City<input type="text" name="city"><br> choose language
 

  choose language  
  <select name="language">
 <option>Spring</option>
  <option>java</option>
<option>Node</option>
<option>Angualr</option>
 
  </select><br>
  Enter StudentId<input type="text" name="studentId"><br>
  Enter Hobby
  <input type ="checkbox" value="music" name="hobby">Music
  <input type ="checkbox" value="dance" name="hobby">dance
  <input type ="checkbox" value="sports" name="hobby">sports
  <input type ="checkbox" value="reading" name="hobby">reading
   <input type="submit" value="Register"><br>
  
  </form>
</body>
</html>