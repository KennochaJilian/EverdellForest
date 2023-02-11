package ovh.aquarius.everdellforest.views.map;

import javafx.scene.control.Button;
import javafx.stage.Stage;
import ovh.aquarius.everdellforest.models.Game;
import ovh.aquarius.everdellforest.views.EverdellController;
import ovh.aquarius.everdellforest.views.breedselection.BreedSelectionStage;

import java.io.IOException;

public class MapController extends EverdellController {

    public Button save;
    public Button load;
    public Button newGame;
    public Button quit;

    public MapController(){
        super();
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
        quit.setOnAction(e -> {
            saveService.saveGame(Game.getInstance());
            closeStage();
        });
    }

    private void gotToBreedSelection() throws IOException {
        BreedSelectionStage stage = new BreedSelectionStage();
        stage.load();
        closeStage();
    }

    private void closeStage(){
        ((Stage) save.getScene().getWindow()).close();
    }

}
