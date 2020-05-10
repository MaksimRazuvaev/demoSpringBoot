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
    <form method="post" action="/register">
        <label for="name">Name:</label><br>
        <input type="text" id="name" value=""><br>
        <label for="email">Email:</label><br>
        <input type="text" id="email" value=""><br><br>
        <input type="submit" value="Register">
    </form>

</body>
</html>