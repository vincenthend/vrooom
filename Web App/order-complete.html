<?php
require_once("include/Common.php");
require_once("include/User.php");
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    //search driver used
    $driver_data = getDriverbyId($_POST["driverId"]);
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
                MAKE AN ORDER
            </div>
        </div>
        <div class="section-step row">
            <div class="step">
                <div class="step-no">1</div>
                <div class="step-guide">Select Destination</div>
            </div>
            <div class="step">
                <div class="step-no">2</div>
                <div class="step-guide">Select A Driver</div>
            </div>
            <div class="step active">
                <div class="step-no">3</div>
                <div class="step-guide active">Complete your order</div>
            </div>
        </div>
        <div class="section-header">
            <div class="section-title">
                HOW WAS IT?
            </div>
        </div>
        <!-- form begins here -->
        <form action="order-saveorder.php" method="post">
            <!--filled variable-->
            <input type="hidden" name="origin" value="<?php echo $_POST["origin"]; ?>">
            <input type="hidden" name="destination" value="<?php echo $_POST["destination"]; ?>">
            <input type="hidden" name="driverId" value="<?php echo $_POST["driverId"]; ?>">
            <input type="hidden" name="userId" value="<?php echo $_POST["userId"] ?>">

            <div class="driver-review">
                <div class="driver-profile">
                    <div class="section-profilepic">
                        <?php printProfile($driver_data, "profilepic-big-round") ?>
                    </div>
                    <div class="driver-label">
                        <div class="driver-label-id">
                            <div class='driver-eval-username'>
                                <?php echo $driver_data['username'] ?>
                            </div>
                            <div class="driver-eval-name">
                                <?php echo $driver_data['name']; ?>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="input-grading">
                    <div class="driver-star-rating">
                        <div class="driver-rate">
                            <input type="radio" id="rating1" name="rating" value="1">
                            <label for="rating1"> ★ </label>
                            <input type="radio" id="rating2" name="rating" value="2">
                            <label for="rating2"> ★ </label>
                            <input type="radio" id="rating3" name="rating" value="3" checked>
                            <label for="rating3"> ★ </label>
                            <input type="radio" id="rating4" name="rating" value="4">
                            <label for="rating4"> ★ </label>
                            <input type="radio" id="rating5" name="rating" value="5">
                            <label for="rating5"> ★ </label>
                        </div>
                    </div>
                    <div class="driver-eval-comment">
                        <div class="field  wide">
                            <input type="text" name="comment" action="order-complete.php?id=<?php echo $_GET["id"] ?>"
                                   placeholder="Your comment...">
                        </div>
                        <div class="row align-right"><input type="submit" class="button-green" value="Complete Order">
                        </div>
                    </div>
                </div>
        </form>
    </div>
</body>
</html>