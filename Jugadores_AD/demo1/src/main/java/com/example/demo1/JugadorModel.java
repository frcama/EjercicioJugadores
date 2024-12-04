package com.example.demo1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JugadorModel {
    ArrayList<Jugador> listaJugador = new ArrayList<>();

    public ArrayList<Jugador> LeerXML(String path) throws SAXException, ParserConfigurationException, IOException {

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
        Document document = dbBuilder.parse(new File(path));

        Element raiz = document.getDocumentElement();
        System.out.println("Juagdores del  XML " + raiz.getNodeName() + ":");
        NodeList nodeList = document.getElementsByTagName("Jugador");

        for (int i=0;i<nodeList.getLength();i++){
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE){
                Element eElement = (Element) node;
                Jugador jugador = new Jugador(  );
                jugador.setId(Integer.parseInt(eElement.getAttribute("id")));
                jugador.setNombre(eElement.getElementsByTagName("nombre").item(0).getTextContent());
                jugador.setEquipo(eElement.getElementsByTagName("equipo").item(0).getTextContent());
                jugador.setAno(Integer.parseInt(eElement.getElementsByTagName("ano").item(0).getTextContent()));
                jugador.setPosicion(eElement.getElementsByTagName("posicion").item(0).getTextContent());
                listaJugador.add(jugador);
            }
        }

        return listaJugador;
    }


}
