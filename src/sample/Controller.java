package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private PasswordField idTextContrasena;

    @FXML
    private Label idLabelMostrar;

   @FXML
    public void onMostarEntered(MouseEvent event){
       idLabelMostrar.setText(idTextContrasena.getText());
    }

    @FXML
    public void onMostarExited(MouseEvent event){
        idLabelMostrar.setText("Mostrar Contraseña");
    }

}
