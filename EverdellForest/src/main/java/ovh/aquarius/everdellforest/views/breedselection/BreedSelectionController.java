package ovh.aquarius.everdellforest.views.breedselection;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import ovh.aquarius.everdellforest.models.Game;
import ovh.aquarius.everdellforest.views.EverdellController;
import ovh.aquarius.everdellforest.views.map.MapStage;

import java.io.IOException;

public class BreedSelectionController extends EverdellController {
    @FXML
    private Button mouse;
    @FXML
    private Button squirell;

    public BreedSelectionController(){
        super();
    }

    public void initialize() {
        mouse.setOnAction(e -> {
            try {
                handleBreedSelect("Mouse");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        squirell.setOnAction(e -> {
            try {
                handleBreedSelect("Squirell");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
    @FXML
    public void handleBreedSelect(String breedSelected) throws IOException {
        try{
            gameService.initGame(breedSelected);
            saveService.saveGame(Game.getInstance());
        } catch (Exception e)
        {
            System.out.println("Game not initialized");
        }
        MapStage map = new MapStage();
        map.load();
        closeStage();

    }

    private void closeStage(){
        ((Stage) mouse.getScene().getWindow()).close();
    }
}
