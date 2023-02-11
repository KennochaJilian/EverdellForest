package ovh.aquarius.everdellforest.views.home;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomeController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onPlayButton() {
        System.out.println("je joue ta mère");
    }
}