package ovh.aquarius.everdellforest.services;

import ovh.aquarius.everdellforest.models.Game;

public class SaveGameService {
    private static SaveGameService instance;
    private static FileService fileService;
    private static final String SAVE_DIRECTORY_PATH = "saves";

    private SaveGameService(){
        fileService = FileService.getInstance();
    }

    public static SaveGameService getInstance(){
        if(instance == null){
            instance = new SaveGameService();
        }
        return instance;
    }
    public void saveGame(Game game){
        String gameFileName = game.getId().toString() + "_game.json";
        fileService.saveToFile(game.exportToJson(), SAVE_DIRECTORY_PATH, gameFileName);
    }



}


