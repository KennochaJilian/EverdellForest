package ovh.aquarius.everdellforest.views.breedselection;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ovh.aquarius.everdellforest.Main;

import java.io.IOException;

public class BreedSelectionStage extends Stage {

    public void load() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("bread-selection/bread-selection.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 810, 400);
        scene.getStylesheets().addAll(Main.class.getResource("bread-selection/bread-selection.css").toExternalForm());
        this.setTitle("EverdellForest");
        this.setScene(scene);
        this.show();
    }
}
