<?php
require_once("include/FileUpload.php");
require_once("include/User.php");

if ($_SERVER['REQUEST_METHOD'] == "POST") {
    $id = $_POST["id"];
    $name = $_POST["name"];
    $phone = $_POST["phone"];

    if (isset($_POST["status"])) {
        $isDriver = 1;
    } else {
        $isDriver = 0;
    }
    var_dump($_FILES["profpic"]);
    if (isset($_FILES["profpic"]) && $_FILES["profpic"]['error'] == UPLOAD_ERR_OK) {
        $res = getUserbyId($id);
        $profpic = fileUpload($_FILES, "profpic", $res["username"]);
    } else {
        $profpic = null;
    }

    $connection = new SQLConnection();
    if ($profpic == null) {
        $connection->runQuery("UPDATE user set name='$name', phone='$phone', isDriver=$isDriver where id='$id'");
    } else {
        $connection->runQuery("UPDATE user set name='$name', phone='$phone', profilePic='$profpic', isDriver=$isDriver where id='$id'");
    }

    header("location:profile.php?id=" . $id);
}
?>