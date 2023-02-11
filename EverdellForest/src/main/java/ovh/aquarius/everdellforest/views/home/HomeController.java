package ovh.aquarius.everdellforest.views.home;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import ovh.aquarius.everdellforest.views.breedselection.BreedSelectionStage;

import java.io.IOException;

public class HomeController {
    @FXML
    private Button playButton;

    @FXML
    protected void onPlayButton() throws IOException {
        BreedSelectionStage selectionStage = new BreedSelectionStage();
        selectionStage.load();
        closeStage();
    }
    private void closeStage(){
        ((Stage) playButton.getScene().getWindow()).close();
    }
}