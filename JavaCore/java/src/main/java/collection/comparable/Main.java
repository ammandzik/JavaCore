package collection.comparable;



class Main {

    public static void main(String[] args) {

        Student s1 = Data.createStudent1();

        System.out.println(s1.compareTo(Data.createStudent2()));

        System.out.println(s1.compare(Data.createStudent2(), s1));

    }




}
