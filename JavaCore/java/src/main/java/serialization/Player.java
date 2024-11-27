package serialization;

import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
@XmlRootElement
class Player implements Serializable {

    private static int olympics_round = 10;

    private transient String phoneNumber;
    private String name;
    private String surname;
    private transient LocalDate dateOfBirth;
    private int age;
    private Category category;


}
