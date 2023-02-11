package ovh.aquarius.everdellforest.views;

import ovh.aquarius.everdellforest.services.GameService;
import ovh.aquarius.everdellforest.services.SaveGameService;

public abstract class EverdellController {
    protected GameService gameService;
    protected SaveGameService saveService;

    public EverdellController(){
        System.out.println("je suis appelé");
        gameService = GameService.getInstance();
        saveService = SaveGameService.getInstance();
    }
}
