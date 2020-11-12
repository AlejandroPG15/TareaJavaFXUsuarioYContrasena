package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {

    Usuario usuario = new Usuario();

    @FXML
    private Label idLabelMostrar;

   @FXML
    public void onMostarEntered(MouseEvent event){
       idLabelMostrar.setText(usuario.contrasena.toString());
    }

}
