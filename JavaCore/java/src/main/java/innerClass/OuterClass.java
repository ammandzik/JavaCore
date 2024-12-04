package innerClass;

class OuterClass {

    private static String name = "Outer";
    private static int age = 7;


    public class InnerClass {

        final String y = OuterClass.name;
        int x = OuterClass.age;



    }
    public InnerClass instantiate(){
        return new InnerClass();
    }

    public static class StaticInner {

        String y = OuterClass.name;
        int x = OuterClass.age;

        String d = "Static XYZ";

    }

    public StaticInner instantiateStatic(){

        return new StaticInner();
    }
}
