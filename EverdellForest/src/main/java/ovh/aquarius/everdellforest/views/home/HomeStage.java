package ovh.aquarius.everdellforest.views.home;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ovh.aquarius.everdellforest.Main;

import java.io.IOException;

public class HomeStage extends Stage {

    public void load() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("home-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 810, 400);
        scene.getStylesheets().addAll(Main.class.getResource("home-style.css").toExternalForm());
        this.setTitle("EverdellForest");
        this.setScene(scene);
        this.show();
    }
}
