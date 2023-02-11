package ovh.aquarius.everdellforest.models;

import ovh.aquarius.everdellforest.models.enums.Breed;



public class Player {
    private static Player instance = null;
    String name = "Sariel";
    Breed breed;

    private Player(Breed breed){
        this.breed = breed;
    }

    public static Player getInstance(Breed breed){
        if(instance == null){
            if(breed == null){
                throw new RuntimeException("Aucune race n'a été seléctionnée");
            }
            instance = new Player(breed);
        }
        return instance;
    }

}
