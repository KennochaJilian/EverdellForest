package ovh.aquarius.everdellforest.services;

import ovh.aquarius.everdellforest.models.Game;
import ovh.aquarius.everdellforest.models.Player;
import ovh.aquarius.everdellforest.models.enums.Breed;

public class GameService {
    private static GameService instance;

    public static GameService getInstance(){
        if(instance == null){
            instance = new GameService();
        }
        return instance;
    }

    public void initGame(String breedSelected){
        Player.getInstance(getBreedSelected(breedSelected));
        Game newGame = Game.getInstance();
        System.out.println("Game initialisée");
        System.out.println(newGame);
    }
    private Breed getBreedSelected(String breedSelected){
        Breed breed = null;
        switch (breedSelected) {
            case "Squirell" -> breed = Breed.Squirell;
            case "Mouse" -> breed = Breed.Mouse;
            default -> System.out.println("No breed corresponding");
        }
        return breed;
    }


}
