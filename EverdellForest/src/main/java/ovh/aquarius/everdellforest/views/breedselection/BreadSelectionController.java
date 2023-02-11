package ovh.aquarius.everdellforest.views.breedselection;

import javafx.fxml.FXML;
import ovh.aquarius.everdellforest.services.GameService;

public class BreadSelectionController {
    GameService gameService;
    public BreadSelectionController(){
        gameService = GameService.getInstance();
    }
    @FXML
    protected void onSelectMouse() {
        gameService.initGame("Mouse");

    }
    @FXML
    protected void onSelectSquirell() {
        gameService.initGame("Squirell");
    }
}
