package ovh.aquarius.everdellforest.views.map;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ovh.aquarius.everdellforest.Main;
import ovh.aquarius.everdellforest.models.Game;

import java.io.IOException;

public class MapStage extends Stage {
    public void load() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("map/map-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 810, 400);
        scene.getStylesheets().addAll(Main.class.getResource("map/map.css").toExternalForm());
        this.setTitle("EverdellForest-Game");
        this.setScene(scene);
        this.show();
        Game game = Game.getInstance();
        System.out.println(game.exportToJson());
    }
}
