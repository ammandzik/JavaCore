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

    public static <T> void serializeBinary(T o) throws FileNotFoundException, IOException {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(TXT_FILEPATH))) {

            oos.writeObject(o);

        }
    }

    public static <T> T deserializeBinary() throws FileNotFoundException, IOException, ClassNotFoundException {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(TXT_FILEPATH))) {

            T o = (T) ois.readObject();

            return o;

        }
    }

    public static <T> void serializeToJson(T o) throws FileNotFoundException, IOException {

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

    public static <T> T deserializeJson() throws FileNotFoundException, IOException, ClassNotFoundException {

        var gson = new GsonBuilder().create();

        var fr = new FileReader(JSON_FILEPATH);

        T object = (T) gson.fromJson(fr, Object.class);

        return object;


    }

    public static <T> void serializeToXml(T o) throws FileNotFoundException, IOException, JAXBException {

        xmlMapper.registerModule(new JavaTimeModule());
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
        xmlMapper.writeValue(new java.io.File(XML_FILEPATH), o);

        String xmlOutput = xmlMapper.writeValueAsString(o);


    }


    public static <T> T deserializeXml(String file, Class<T> obj) throws IOException {

        xmlMapper.registerModule(new JavaTimeModule());
        return xmlMapper.readValue(new java.io.File(XML_FILEPATH), obj);


    }
}
