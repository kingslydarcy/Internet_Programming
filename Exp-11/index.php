<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</head>
<?php
$name=false;
$mail=false;
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "testdb";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 


// check if the form has been submitted
if ($_SERVER["REQUEST_METHOD"] == "POST") {

    // validate name
    if (empty($_POST["name"])) {
        $nameErr = "Name is required";
    } else {
        $name = test_input($_POST["name"]);
        // check if name only contains letters and whitespace
        if (!preg_match("/^[a-zA-Z ]*$/", $name)) {
            $nameErr = "Only letters and white space allowed";
        } else {
            $name=true;
        }
    }

    // validate email
    if (empty($_POST["email"])) {
        $emailErr = "Email is required";
    } else {
        $email = test_input($_POST["email"]);
        // check if email address is well-formed
        if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
            $emailErr = "Invalid email format";
        } else {
            $email=true;
        }
    }
}

// helper function to sanitize data
function test_input($data)
{
    $data = trim($data);
    $data = stripslashes($data);
    $data = htmlspecialchars($data);
    return $data;
}


if($name && $email) {
    $uname= $_POST["name"];
    $umail= $_POST["email"];
    $ucv= $_POST["cv"];
    $sql="INSERT INTO `job_applications` (`Name`, `Email`, `CV`)
VALUES ( '$uname', '$umail', '$ucv')";

    if ($conn->query($sql) === true) {?>
        <main class="container">
        <div class="bg-light mt-3 rounded p-5">
         <h1>record created successfully</h1>
        </div>
       </main><?php
    } else {?>
<body>
<div class="d-flex justify-content-center align-items-center mt-5">
        <form method="post" action='index.php'>
            <div class="form-group row mb-3">
                <label for="username" class="col-sm-4 col-form-label">Name</label>
                <div class="col-md-8">
                    <input type="text" class="form-control" id="username" placeholder="" name="name">
                </div>
            </div>
            <div class="form-group row mb-3">
                <label for="usermail" class="col-sm-4 col-form-label">Email</label>
                <div class="col-md-8">
                    <input type="email" class="form-control" id="usermail" placeholder="name@example.com" name="email">
                </div>
            </div>
            <div class="form-group row mb-3">
                <label for="usercv" class="col-sm-4 col-form-label">CV</label>
                <div class="col-md-8">
                    <input type="file" class="form-control" id="usercv" placeholder="" name="cv">
                </div>
            </div>
            <div class="d-grid gap-2">
                <button class="btn btn-primary" type="submit" >Submit</button>
            </div>
</form>
</div>
</body>
</html><?php
    }
}
?>
