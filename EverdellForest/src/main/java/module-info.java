module ovh.aquarius.everdellforest {
    requires javafx.controls;
    requires javafx.fxml;


    opens ovh.aquarius.everdellforest to javafx.fxml;
    exports ovh.aquarius.everdellforest;
}