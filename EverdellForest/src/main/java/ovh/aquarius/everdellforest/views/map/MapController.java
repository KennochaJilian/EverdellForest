package ovh.aquarius.everdellforest.views.map;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ovh.aquarius.everdellforest.models.Game;
import ovh.aquarius.everdellforest.views.EverdellController;
import ovh.aquarius.everdellforest.views.breedSelection.BreedSelectionStage;
import ovh.aquarius.everdellforest.views.loadGamesModal.LoadGamesModalStage;

import java.io.IOException;

public class MapController extends EverdellController {

    public Button save;
    public Button load;
    public Button newGame;
    public Button quit;
    public TextField timeSpeedField;

    private final Game game;

    public MapController(){
        super();
        this.game = Game.getInstance();
    }

    public void initialize() {
        save.setOnAction(e -> {
            saveService.saveGame(Game.getInstance());
        });
        newGame.setOnAction(e -> {
            try {
                Game.resetGame();
                gotToBreedSelection();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        load.setOnAction(e -> {
            openGamesPopup();
        });
        quit.setOnAction(e -> {
            saveService.saveGame(Game.getInstance());
            closeStage();
        });
        manageTimeSpeedField();

    }

    private void gotToBreedSelection() throws IOException {
        BreedSelectionStage stage = new BreedSelectionStage();
        stage.load();
        closeStage();
    }

    private void openGamesPopup(){
        LoadGamesModalStage stage = new LoadGamesModalStage();
        stage.load();
    }

    private void manageTimeSpeedField(){
        timeSpeedField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                timeSpeedField.setText(newValue.replaceAll("[^\\d]", ""));
            }
            int value = Integer.parseInt(timeSpeedField.getText());
            this.game.setGameSpeed(value);
        });
    }

    private void closeStage(){
        ((Stage) save.getScene().getWindow()).close();
    }

}
