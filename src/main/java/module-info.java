module mp3player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports pl.rkulig.mp3player.main to javafx.graphics;
    opens pl.rkulig.mp3player.controller to javafx.fxml;
}