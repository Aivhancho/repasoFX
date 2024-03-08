package com.example.repaso_fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class RepasoController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    private ChoiceBox<String> generocb;
    @FXML
    private TextArea textoFinal;
    @FXML
    private TextField nombre;
    @FXML
    private TextArea descripcion;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    String[] genero = {"Hombre", "Fémina", "Los dos", "No se sabe", "Aún por determinar", "Soy un género jajaj", "Prefiero no responder"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        generocb.getItems().addAll(genero);
    }

    public void onEnviarClick() {
        String genero = generocb.getValue();
        String nombreP = nombre.getText();
        String descrip = descripcion.getText();
        textoFinal.setText(descrip + "\n" + nombreP + "\n" + genero + "\n");
    }
}