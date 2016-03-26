
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Player</title>
    </head>
    <body>
        <h1>Add A New Player</h1>
        
        <form name="addForm" action="addPlayer" method="get">
            
            <label>Player Name:</label>
            <input type="text" name="name" value="" />
            <br>
            <label>Player Average:</label>
            <input type="text" name="average" value="" />
            <br>
            <label>Homeruns:</label>
            <input type="text" name="homeruns" value="" />
            <br>
            <label>Doubles:</label>
            <input type="text" name="doubles" value="" />
            <br>
            <label>Triples:</label>
            <input type="text" name="triples" value="" />
            <br>
            <label>Player Age:</label>
            <input type="text" name="age" value="" />
            <br>
            <input type="submit" name="submit" value="Submit"/>
        </form>
        
    </body>
</html>
