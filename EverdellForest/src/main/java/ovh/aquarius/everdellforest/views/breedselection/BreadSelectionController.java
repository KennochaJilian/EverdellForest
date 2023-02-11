package ovh.aquarius.everdellforest.views.breedselection;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import ovh.aquarius.everdellforest.models.Game;
import ovh.aquarius.everdellforest.services.GameService;
import ovh.aquarius.everdellforest.services.SaveGameService;

public class BreadSelectionController {
    GameService gameService;
    SaveGameService saveService;

    @FXML
    private Button mouse;
    @FXML
    private Button squirell;

    public BreadSelectionController(){
        gameService = GameService.getInstance();
        saveService = SaveGameService.getInstance();
    }
    public void initialize() {
        mouse.setOnAction(e -> handleBreedSelect("Mouse"));
        squirell.setOnAction(e -> handleBreedSelect("Squirell"));
    }
    @FXML
    public void handleBreedSelect(String breedSelected) {
        gameService.initGame(breedSelected);
        saveService.saveGame(Game.getInstance());
    }
}
