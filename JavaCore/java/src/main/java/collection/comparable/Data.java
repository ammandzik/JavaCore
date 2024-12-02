package collection.comparable;

class Data {

    public static Student createStudent1(){

        var s1 = Student.builder()
                .age(33)
                .name("Aneta")
                .points(199)
                .build();

        return s1;


    }
    public static Student createStudent2(){

        var s2 = Student.builder()
                .age(25)
                .name("Malwina")
                .points(250)
                .build();

        return s2;


    }
}
