<html>
<head>
    <title>Person List</title>
    <link rel="stylesheet"
          type="text/css"
          />
</head>
<body>
<h3>Person List</h3>
<#--<a href="addPerson">Add Person</a>-->
<br><br>
<div>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>EMAIL</th>
        </tr>
        <#list persons as person>
            <tr>
                <td>${person.getId()}</td>
                <td>${person.getName()}</td>
                <td>${person.getEmail()}</td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>
