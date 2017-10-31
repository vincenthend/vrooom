<!-- <?php
require_once("include/User.php");

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $user_details = logIn($_POST["username"], $_POST["password"]);
    if ($user_details) {
        if ($user_details["isDriver"]) {
            header("location:profile.php?id=" . $user_details["id"]);
        } else {
            header("location:order-selectdestination.php?id=" . $user_details["id"]);
        }
    } else {
        echo "<script>alert('Username atau Password salah')</script>";
    }
}
?> -->

<!DOCTYPE HTML>
<html>
<head>
    <title>NGEEENG! - A Solution for Your Transportation</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>

<div class="container green-box">
    <div class="title">
        <span>LOGIN</span>
    </div>
    <div class="row">
        <form class="form-center login-form" method="post" action="login.php">
            <div class="input-set">
                <div class="label">Username</div>
                <div class="field"><input type="text" name="username" placeholder="Username"></div>
            </div>
            <div class="input-set">
                <div class="label">Password</div>
                <div class="field"><input type="password" name="password" placeholder="Password"></div>
            </div>
            <div class="login-button-set input-set">
                <div class="register-section"><a href="signup.php">Don't have an account?</a></div>
                <div class="button-section"><input class="button-green" type="submit" VALUE="Log In"></div>
            </div>
        </form>
    </div>
</div>
</body>
</html>