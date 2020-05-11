<#import "/spring.ftl" as spring/>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>RegisterUser</title>
</head>
<body>
    <h2>Type your user here:</h2>
    <form name="user" action="" method="POST">
        Name: <@spring.formInput "userForm.name" "" "text"/>    <br/>
        Email: <@spring.formInput "userForm.email" "" "text"/>    <br/>
        <input type="submit" value="Create" />
    </form>

</body>
</html>