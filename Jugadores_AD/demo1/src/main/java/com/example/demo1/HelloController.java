package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

    public class HelloController implements Initializable {
    @FXML
    private TextField id;
    @FXML
    private TextField posicion;
    @FXML
    private TextField ano;
    @FXML
    private Button siguiente;
    @FXML
    private TextField equipo;
    @FXML
    private TextField nombre;
    @FXML
    private Button previo;

        JugadorModel fm = new JugadorModel();
        List<Jugador> Jugadores = new ArrayList<>();

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
            try {
                Jugadores = fm.LeerXML("Jugador.xml");
                for (Jugador j : Jugadores){
                    System.out.println(j.getNombre() + "" + j.getEquipo());
                }

            } catch (SAXException e) {
                throw new RuntimeException(e);
            } catch (ParserConfigurationException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }



}