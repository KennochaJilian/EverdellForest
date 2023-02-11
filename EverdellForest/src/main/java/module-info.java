module ovh.aquarius.everdellforest {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    exports ovh.aquarius.everdellforest;
    exports ovh.aquarius.everdellforest.views.home;
    exports ovh.aquarius.everdellforest.views.breedselection;
    exports ovh.aquarius.everdellforest.views.map;
    exports ovh.aquarius.everdellforest.models.enums;

    opens ovh.aquarius.everdellforest to javafx.fxml;
    opens ovh.aquarius.everdellforest.views.home to javafx.fxml;
    opens ovh.aquarius.everdellforest.views.breedselection to javafx.fxml;
    opens ovh.aquarius.everdellforest.views.map to javafx.fxml;
    opens ovh.aquarius.everdellforest.models to com.google.gson;
    opens ovh.aquarius.everdellforest.models.enums to com.google.gson;

}