package ovh.aquarius.everdellforest;

import javafx.application.Application;
import javafx.stage.Stage;
import ovh.aquarius.everdellforest.views.home.HomeStage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        HomeStage homeStage = new HomeStage();
        homeStage.load();
    }

    public static void main(String[] args) {
        launch();
    }
}