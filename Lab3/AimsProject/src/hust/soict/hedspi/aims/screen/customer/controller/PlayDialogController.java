package hust.soict.hedspi.aims.screen.customer.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class PlayDialogController {

    @FXML
    private Label lblPlayingTitle;

    public void setPlayingTitle(String title) {
        lblPlayingTitle.setText(title);
    }

    @FXML
    void closeDialog(ActionEvent event) {
        Stage stage = (Stage) lblPlayingTitle.getScene().getWindow();
//                getScene().getWindow(); Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
}
