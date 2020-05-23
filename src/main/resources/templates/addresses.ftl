<html>
<head>
    <title>Address List</title>
    <link rel="stylesheet"
          type="text/css"
    />
</head>
<body>
<h3>Address List</h3>
<#--<a href="addPerson">Add Person</a>-->
<br><br>
<div>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>CITY</th>
            <th>STREET</th>
            <th>HOME NUMBER</th>
        </tr>
        <#list address as a>
            <tr>
                <td>${a.getId()}</td>
                <td>${a.getCity()}</td>
                <td>${a.getStreet()}</td>
                <td>${a.getHomeNumber()}</td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>
