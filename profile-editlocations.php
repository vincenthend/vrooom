<?php
require_once("include/SQLConnection.php");
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
    <div class="section">
        <div class="section-header">
            <div class="section-title">
                EDIT PREFERRED LOCATIONS
            </div>
        </div>
        <div class="row">
            <div class="section-table">
                <table class="location-table">
                    <tr>
                        <th> No
                        <th> Location
                        <th> Actions
                    </tr>
                    <?php
                    $conn = new SQLConnection();
                    $id = $_GET["id"];
                    $user_data = $conn->runQuery("SELECT * FROM preferred_loc WHERE id=$id order by sequence asc");
                    $i = 1;
                    if ($user_data) {
                        while ($ind_result = $user_data->fetch_assoc()) {
                            echo '<tr>';
                            echo '<td> ' . $i . ' </td>';
                            echo '<td id="location-' . $i . '">
                                <form name="location-form-' . $i . '" method="post">
                                    <input type="hidden" name="id" value="' . $_GET["id"] . '">
                                    <input type="hidden" name="oldlocation" id="location-oldvalue-' . $i . '" value="' . $ind_result["place"] . '">
                                    <input type="hidden" name="newlocation" id="location-newvalue-' . $i . '" value="' . $ind_result["place"] . '">
                                </form>
                                <div id="location-value-' . $i . '">'
                                . $ind_result["place"] .
                                '</div>
                                </td>';
                            echo '<td class="section-actions-column">
                                <div class="section-edit-button-set">
                                <div class="actions-save" id="location-save-' . $i . '" onclick="saveloc(' . $i . ')">&#10004;</div>
                                <div class="actions-edit" id="location-edit-' . $i . '" onclick="editloc(' . $i . ')">&#x270E;</div>
                                <div class="actions-delete" onclick="deleteloc(' . $i . ')">&#10060;</div>                                
                                </div>
                                </td>';
                            echo '</tr>';
                            $i++;
                        }
                    }
                    ?>
                </table>
            </div>
        </div>
        <div class="section-subheader">
            <div class="section-title">
                ADD NEW LOCATION
            </div>
        </div>
        <form action="profile-addloc.php" class="edit" method="post">
            <div class="input-set">
                <input type="hidden" name="id" value=<?php echo $_GET["id"] ?>>
                <div class="field"><input type="text" name="newlocation"></div>
                <input type="submit" value="ADD" class="button-green" name="button">
            </div>
        </form>
        <div class="button-red">
            <a href="profile.php?id=<?php echo $id ?>">
                <button type="button" class="button-red">BACK</button>
            </a>
        </div>
    </div>
</div>
<script src="js/updateloc.js"></script>
</body>
</html>