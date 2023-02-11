package ovh.aquarius.everdellforest.services;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import ovh.aquarius.everdellforest.models.Game;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SaveGameService {
    private static SaveGameService instance;
    private final FileService fileService;
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
    public List<Game> getAll(){
        List<Game> games = new ArrayList<>();
        List<File> gamesFiles = this.fileService.getAllFilesFromADirectory(SAVE_DIRECTORY_PATH);
        gamesFiles.forEach(file -> {
            Gson gson = new Gson();
            try {
                Game game = gson.fromJson(new FileReader(file), Game.class );
               games.add(game);
            } catch (JsonSyntaxException | JsonIOException | IOException e) {
                e.printStackTrace();
            }
        });
        return games;
    }



}


