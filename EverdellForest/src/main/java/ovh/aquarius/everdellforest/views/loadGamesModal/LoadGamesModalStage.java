package ovh.aquarius.everdellforest.views.loadGamesModal;

import javafx.scene.control.ChoiceDialog;
import javafx.stage.Stage;
import ovh.aquarius.everdellforest.models.Game;
import ovh.aquarius.everdellforest.services.SaveGameService;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class LoadGamesModalStage extends Stage {
    private SaveGameService saveGameService;

    public LoadGamesModalStage(){
        this.saveGameService = SaveGameService.getInstance();
    }


    public void load(){
        List<Game> games = saveGameService.getAll();
        List<String> gamesIds = games.stream()
                .map(game -> game.getId().toString()).toList();
        String firstId = gamesIds.get(1);

        ChoiceDialog<String> dialog = new ChoiceDialog<>(firstId, gamesIds);
        dialog.setTitle("Choisir une partie");

        Optional<String> result = dialog.showAndWait();
        result.ifPresent(gameId -> {
            Optional<Game> game = games.stream().filter(g -> Objects.equals(g.getId().toString(), gameId)).findFirst();
            game.ifPresent(Game::setInstance);
        });

    }
}
