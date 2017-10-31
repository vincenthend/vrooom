<?php
require_once("include/Common.php");
require_once("include/User.php");
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
            <a href="history-orderhistory.php?id=<?php echo $_GET["id"] ?>"><div class="nav-item-transaction active">MY PREVIOUS ORDERS</div></a>
            <a href="history-driverhistory.php?id=<?php echo $_GET["id"] ?>"><div class="nav-item-transaction">DRIVER HISTORY</div></a>
        </div>
        <?php
        $results = getOrderHistory($_GET["id"]);
        if ($results) {
            $j = 1;
            while ($driver_data = $results->fetch_assoc()) {
                echo '<div class="row" id="history-'.$j.'">' ?>
                    <div><?php printProfile($driver_data, "profilepic-big") ?></img></div>
                    <div class="history-label">
                    <?php
                    echo '
                    <div class="history-date-label">' . $driver_data["date"] . '</div>
                    <div class="history-driver-name-label">' . $driver_data["name"] . '</div>
                    <div class="history-other-data">' . $driver_data["origin"] . ' &#8594 ' . $driver_data["destination"] . '
                        <br>You rated : <span class="profile-rating">';
                        for($i=0; $i < $driver_data["order_rating"]; $i++){
                            echo '&#9734';
                        }
                    echo '('.$driver_data["order_rating"].')</span>';
                    echo '
                    <br>You commented :
                    <div class="history-comment">' . $driver_data["comment"] . '</div>
                    </div>
                    </div>
                    <div>
                        <form method="post" action="history-hide.php">
                            <input type="hidden" name="id" value="'.$_GET["id"].'">
                            <input type="hidden" name="order_id" value="'.$driver_data["order_id"].'">
                            <input type="hidden" name="type" value="user">
                            <button class="button-red">HIDE</input>
                        </form>
                    </div>
                    </div>
                </div>
            ';
			$j++;
            }
        }
        else{
            echo '<div class="section">No Order Yet!</div>';
        }
        ?>
    </div>
</div>
<script src="js/hide.js"></script>
</body>
</html>