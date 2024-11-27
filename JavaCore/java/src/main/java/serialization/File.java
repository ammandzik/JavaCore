package serialization;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.gson.GsonBuilder;
import jakarta.xml.bind.JAXBException;
import lombok.AllArgsConstructor;

import java.io.*;

@AllArgsConstructor
class File {

    final static String JSON_FILEPATH = "serialization.json";
    final static String TXT_FILEPATH = "serialization.txt";
    final static String XML_FILEPATH = "serialization.xml";
    final static XmlMapper xmlMapper = new XmlMapper();

    public static void serializeBinary(Object o) throws FileNotFoundException, IOException {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(TXT_FILEPATH))) {

            oos.writeObject(o);

        }
    }

    public static Object deserializeBinary() throws FileNotFoundException, IOException, ClassNotFoundException {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(TXT_FILEPATH))) {

            Object o = (Object) ois.readObject();

            return o;

        }
    }

    public static void serializeToJson(Object o) throws FileNotFoundException, IOException {

        var gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        var jsonObject = gson.toJson(o);

        try {

            var fw = new FileWriter(JSON_FILEPATH, true);
            var bw = new BufferedWriter(fw);

            bw.write(jsonObject);
            bw.newLine();
            bw.close();

        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }

    public static Object deserializeJson() throws FileNotFoundException, IOException, ClassNotFoundException {

        var gson = new GsonBuilder().create();

        var fr = new FileReader(JSON_FILEPATH);

        Object object = gson.fromJson(fr, Object.class);

        return object;


    }

    public static void serializeToXml(Object o) throws FileNotFoundException, IOException, JAXBException {

        xmlMapper.registerModule(new JavaTimeModule());
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
        xmlMapper.writeValue(new java.io.File(XML_FILEPATH), o);

        String xmlOutput = xmlMapper.writeValueAsString(o);


    }


    public static <T> T deserializeXml(String file, Class<T> obj) throws IOException {

        return xmlMapper.readValue(XML_FILEPATH, obj);


    }
}
