package ovh.aquarius.everdellforest.models;

import com.google.gson.Gson;

import java.util.UUID;

public class Game {
    private static Game instance = null;

    int nbTent = 0;
    int nbSawmill = 0;
    int nbStorehouse = 0;
    int nbPit = 0;
    int forumLevel = 1;
    int nbSettlers = 5;
    int nbWood = 0;
    int nbIron = 0;
    int nbMeat = 0;
    int nbFruit = 0;
    int gameSpeed = 1;
    UUID id;
    Player player;

    private Game(Player player){

        this.player = player;
        this.id = UUID.randomUUID();
    }

    public static Game getInstance(){
        Player player = Player.getInstance(null);
        if(player == null){
            throw new RuntimeException("Player is null");
        }
        if(instance == null){
            instance = new Game(player);
        }
        return instance;
    }
    public static void resetGame(){
        instance = null;
    }

    public String exportToJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public UUID getId() {
        return id;
    }

}
