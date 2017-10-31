<?php
require_once("include/SQLConnection.php");

if ($_SERVER['REQUEST_METHOD'] == "POST") {
    $id = $_POST["id"];
    $oldlocation = $_POST["oldlocation"];
    $newlocation = $_POST["newlocation"];

    $new = new SQLConnection();
    $new->runQuery("UPDATE preferred_loc set place='$newlocation' where id=$id and place='$oldlocation'");

    header("location: profile-editlocations.php?id=" . $id);
}
?>