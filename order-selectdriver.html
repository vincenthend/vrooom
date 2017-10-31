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
    printNavbar($_GET["id"], 0);
    ?>
    <div class="section">
        <div class="section-header">
            <div class="section-title">
                MAKE AN ORDER
            </div>
        </div>
        <div class="section-step row">
            <div class="step">
                <div class="step-no">1</div>
                <div class="step-guide">Select Destination</div>
            </div>
            <div class="step active">
                <div class="step-no">2</div>
                <div class="step-guide">Select A Driver</div>
            </div>
            <div class="step">
                <div class="step-no">3</div>
                <div class="step-guide">Complete your order</div>
            </div>
        </div>

        <div class="section-select-driver">
            &ensp;PREFERRED DRIVERS :
            <?php
            if (isset($_POST["preferreddriver"]) && $_POST["preferreddriver"] != "") {
                $result = searchDriverbyUsername($_POST["preferreddriver"],$_GET["id"]);
                if ($result) {
                    $j = 1;
                    while ($driver_data = $result->fetch_assoc()) {

                        ?>
                        <form action="order-complete.php?id=<?php echo $_POST["userId"] ?>" method="post">
                            <div class="section-content">
                                <input type="hidden" name="origin" value="<?php echo $_POST["origin"]; ?>">
                                <input type="hidden" name="destination" value="<?php echo $_POST["destination"]; ?>">
                                <input type="hidden" name="userId" value="<?php echo $_POST["userId"]; ?>">
                                <input type="hidden" name="driverId" value="<?php echo $driver_data["id"]; ?>">

                                <div class="section-profilepic">
                                    <?php printProfile($driver_data, "profilepic-big") ?></div>
                                <div class="section-stacked">
                                    <div class="history-label align-left">
                                        <div class="driver-name-label">
                                            <?php echo $driver_data["name"] ?>
                                        </div>
                                        <div class="profile-rating"> &#9734
                                            <?php
                                            echo $driver_data["rating"];
                                            echo ' <span class="profile-votes">(' . $driver_data["votes"] . ' votes)</span>'
                                            ?>
                                        </div>
                                    </div>
                                    <div class="button-section align-right">
                                        <input type="submit" class="button-green" value="I choose you">
                                    </div>
                                </div>
                            </div>
                        </form>
                        <?php
                        $j++;
                    }
                } else {
                    echo '
                            <div class="section-no-results">
                            <br>No Results Found :(
                            <br><br> 
                            </div>
                            ';
                }
            } else {
                echo '
                        <div class="section-no-results">
                        <br>No Results Found :(
                        <br><br> 
                        </div>
                        ';
            }
            ?>
        </div>
        <br>
        <div class="section-select-driver">
            &ensp;OTHER DRIVERS :

            <?php
            if (isset($_POST["origin"]) && isset($_POST["destination"]) && $_POST["origin"] != "" && $_POST["destination"] != "") {
                $other_result = searchDriverbyLocation($_POST["origin"],$_GET["id"]);
                if ($other_result) {
                    $k = 1;
                    while ($driver_data = $other_result->fetch_assoc()) {
                        ?>
                        <form action="order-complete.php?id=<?php echo $_POST["userId"]; ?>" method="post">
                            <!-- NAMPILIN USER YANG BISA*/ -->
                            <div class="section-content">
                                <input type="hidden" name="origin" value="<?php echo $_POST["origin"]; ?>">
                                <input type="hidden" name="destination" value="<?php echo $_POST["destination"]; ?>">
                                <input type="hidden" name="userId" value="<?php echo $_POST["userId"]; ?>">
                                <input type="hidden" name="driverId" value="<?php echo $driver_data["id"]; ?>">
                                <div class="section-profilepic">
                                    <?php printProfile($driver_data, "profilepic-big") ?></div>
                                <div class="section-stacked">
                                    <div class="history-label align-left">
                                        <div class="driver-name-label">
                                            <?php echo $driver_data["name"] ?>
                                        </div>
                                        <div class="profile-rating"> &#9734
                                            <?php
                                            echo $driver_data["rating"];
                                            echo '<span class="profile-votes"> (' . $driver_data["votes"] . ' votes)</span>'
                                            ?>
                                        </div>
                                    </div>
                                    <div class="button-section align-right">
                                        <input type="submit" class="button-green" value="I choose you">
                                    </div>
                                </div>
                            </div>
                        </form>
                        <?php
                    }
                } else {
                    echo '<div class="section-no-results">
                            <br>No Results Found :(
                            <br><br> 
                            </div>';
                }
            } else {
                echo '<div class="section-no-results">
                        <br>No Results Found :(
                        <br><br> 
                        </div>';
            }
            ?>


        </div>
    </div>
</div>
</body>
</html>