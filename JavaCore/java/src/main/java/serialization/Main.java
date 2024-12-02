package serialization;

import jakarta.xml.bind.JAXBException;

import java.io.IOException;

class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, JAXBException {


        File.serializeBinary(Data.createPlayer());


        var p3 = File.deserializeBinary();
        System.out.println(p3 + " " + "BINARY");


        var p2 = File.deserializeJson();
        System.out.println(p2 + " " + "JSON");

        var p1 = File.deserializeXml(File.XML_FILEPATH, Player.class);
        System.out.println(p1 + " " + "XML");


    }
}
