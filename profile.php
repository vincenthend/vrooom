<?php
require_once("include/User.php");
require_once("include/Common.php");
updateDriverRating($_GET["id"]);
$userdata = getUserbyId($_GET["id"]);

if ($userdata["isDriver"]) {
    $driverdata = getDriverbyId($_GET["id"]);
    $locationdata = getLocationbyID($_GET["id"]);
} else {
    $driverdata = false;
}
?>

<!DOCTYPE HTML>
<html>
<head>
    <title>NGEEENG! - A Solution for Your Transportation</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
<div class="container">
    <?php
    printHeader($_GET["id"]);
    printNavbar($_GET["id"], 2);
    ?>
    <div class="section">
        <div class="section-header">
            <div class="section-title">
                MY PROFILE
            </div>
            <div class="section-edit-button">
                <a href="profile-editprofile.php?id=<?php echo $_GET["id"] ?>">&#x270E;</a>
            </div>
        </div>
        <div class="section-profile">
            <div><?php printProfile($userdata, "profilepic-big-round") ?></div>
            <div class="profile-username"><?php echo "@" . $userdata["username"] ?></div>
            <div class="profile-name"><?php echo $userdata["name"] ?></div>
            <div class="profile-status">
					<span class="profile-type">
						<?php
                        if ($userdata["isDriver"]) {
                            echo "Driver";
                        } else {
                            echo "Non-Driver";
                        }
                        ?>
					</span>
                |
                <?php
                if ($driverdata) {
                    echo "<span class=\"profile-rating\">  &#9734 " . round($driverdata['rating'],2) . " (" . $driverdata['votes'] . " votes)</span>";
                }
                ?>
            </div>
            <div class="profile-email"> &#x2709;<?php echo $userdata["email"] ?></div>
            <div class="profile-phone">&#x260F;<?php echo $userdata["phone"] ?></div>
        </div>
        <?php
        if ($userdata["isDriver"] != false) {
            echo '<div class="section-subheader">
                       <div class="section-title">Preferred Locations</div>
                            <div class="section-edit-button">
                                <a href="profile-editlocations.php?id=' . $_GET["id"] . '">&#x270E;</a>
                            </div>
                  </div>';

            if ($locationdata) {
                echo '<div class="section-location">';
                $count = $locationdata->num_rows;
                while ($location = $locationdata->fetch_assoc()) {
                    echo "<ul><li>" . $location['place'] . "</li>";
                }
                for($i = 0; $i < $count; $i++){
                    echo "</ul>";
                }
                echo '</div>';
            } else {
                echo "No Preferred Location Yet";
            }
        }
        ?>
    </div>
</div>
</body>
</html>