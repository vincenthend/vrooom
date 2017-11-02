<?php
require_once("include/Common.php");
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
    printNavbar($_GET["id"], 1);
    ?>
    <div class="section">
        <div class="section-header">
            <div class="section-title">
                TRANSACTION HISTORY
            </div>
        </div>
        <div class="nav">
            <a href="history-orderhistory.php?id=<?php echo $_GET["id"] ?>">
                <div class="nav-item-transaction">MY PREVIOUS ORDERS</div>
            </a>
            <a href="history-driverhistory.php?id=<?php echo $_GET["id"] ?>">
                <div class="nav-item-transaction active">DRIVER HISTORY</div>
            </a>
        </div>
        <?php
        $results = getDriverHistory($_GET["id"]);
        if ($results) {
            $i = 1;
            while ($user_data = $results->fetch_assoc()) {
                echo '<div class="row" id="history- echo'. $i .'">'?>
                    <div><?php printProfile($user_data, "profilepic-big") ?></img></div>
                    <div class="history-label">
                    <?php
                    echo '
                    <div class="history-date-label">' . $user_data["date"] . '</div>
                    <div class="history-driver-name-label">' . $user_data["name"] . '</div>
                    <div class="history-other-data">' . $user_data["origin"] . ' &#8594 ' . $user_data["destination"] . '
                        <br>gave <span class="profile-rating">' . $user_data["order_rating"] . '</span> stars to this order
                        <br>and left comment :
                        <div class="history-comment">' . $user_data["comment"] . '</div>
                    </div>
                    </div>
                    <div>
                    <form method="post" action="history-hide.php">
                        <input type="hidden" name="id" value="'.$_GET["id"].'">
                        <input type="hidden" name="order_id" value="'.$user_data["order_id"].'">
                        <input type="hidden" name="type" value="driver">
                        <button class="button-red">HIDE</input>
                    </form>
                    </div>
                </div>';
				$i++;
            }
        } else {
            echo '<div class="section">No History Yet!</div>';
        }
        ?>
    </div>
</div>
<script src="js/hide.js"></script>
</body>
</html>