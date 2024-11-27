package serialization;

import java.time.LocalDate;

class Data {
    static Player createPlayer(){
        return Player.builder()
                .name("Pawel")
                .surname("Terra")
                .age(20)
                .dateOfBirth(LocalDate.of(2004, 01,02))
                .phoneNumber("786-555-445")
                .category(Category.GAMES)
                .build();
    }


}
