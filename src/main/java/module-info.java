module main.annatelisovandahmadmassalhaproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens main.mainClasses to javafx.fxml;
    exports main.mainClasses;


    opens Controllers to javafx.fxml;
    exports Controllers;
}