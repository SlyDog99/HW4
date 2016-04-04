
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    <body>
        <h1>Players</h1>
          <table id="t01"
        <tr>
    <th>PlayerName</th>
    <th>Average</th> 
    <th>HR</th>
    <th>Doubles</th>
    <th>Triples</th>
    <th>Age</th>
  </tr>
        <%= table %>
        
        <br><br>
        
        <a href ="add">Add A New Player</a>
    </body>
</html>
