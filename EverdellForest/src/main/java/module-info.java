module ovh.aquarius.everdellforest {
    requires javafx.controls;
    requires javafx.fxml;


    opens ovh.aquarius.everdellforest to javafx.fxml;
    exports ovh.aquarius.everdellforest;
    exports ovh.aquarius.everdellforest.views.home;
    exports ovh.aquarius.everdellforest.views.breedselection;
    opens ovh.aquarius.everdellforest.views.home to javafx.fxml;
    opens ovh.aquarius.everdellforest.views.breedselection to javafx.fxml;
}