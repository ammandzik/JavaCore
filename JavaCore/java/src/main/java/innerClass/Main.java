package innerClass;

import java.util.*;

class Main {

    public static void main(String[] args) {

        class LocalClass {

            @Override
            public String toString() {
                return "Argumenty metody: " + Arrays.toString(args);
            }


        }

        LocalClass localClass = new LocalClass();
        System.out.println(localClass);

        anonymous();
        outer();
        innerStatic();

        AnonymousClasses.Robot chris = new AnonymousClasses.Robot(new GreetingModule() {
            @Override
            public void sayHello() {

                System.out.println("Guten morgen!");

            }
        });

        chris.saySomething();

        int counter = 5;
        List<String> words = new ArrayList<>();
        words.add("Paulina");
        words.add("Chris");
        words.add("Jan");
        words.add("Malwina");
        words.add("Zoska");

        Collections.sort(words, new Comparator<String>() {

            @Override
            public int compare(String word, String word2) {
                return word.length() - word2.length();
            }
        });

        words.forEach(c -> System.out.println(c));





    }

    public static void outer() {

        OuterClass oc = new OuterClass();

        OuterClass.InnerClass innerClass = oc.instantiate();
        OuterClass.InnerClass innerClass2 = oc.new InnerClass();

        System.out.println(innerClass.x + " " + innerClass.y);
        System.out.println(innerClass2.x + " " + innerClass2.y);


    }

    public static void innerStatic() {
        OuterClass oc = new OuterClass();

        OuterClass.StaticInner si = oc.instantiateStatic();
        OuterClass.StaticInner staticInner = new OuterClass.StaticInner();

        System.out.println(staticInner.x + " " + staticInner.y + " " + staticInner.d);

    }

    public static void anonymous() {

        Anonymous a = new Anonymous();
        System.out.println(a.ta.hello());

        System.out.println(a.ta2.hello());
    }

}
