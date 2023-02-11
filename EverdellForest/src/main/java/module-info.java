module ovh.aquarius.everdellforest {
    requires javafx.controls;
    requires javafx.fxml;


    opens ovh.aquarius.everdellforest to javafx.fxml;
    exports ovh.aquarius.everdellforest;
    exports ovh.aquarius.everdellforest.views.home;
    opens ovh.aquarius.everdellforest.views.home to javafx.fxml;
}