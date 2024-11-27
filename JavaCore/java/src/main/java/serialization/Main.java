package serialization;

import java.io.IOException;

class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File.deserializeXml(File.XML_FILEPATH, Player.class);


    }
}
