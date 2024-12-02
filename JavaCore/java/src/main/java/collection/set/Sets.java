package collection.set;

import java.util.*;

class Sets {

    static Set<String> test = Set.of("Al", "BC", "CF", "XD", "KA", "BF", "UF");
    static Set<Integer> test2 = Set.of(1, 77, 565, 3, 44);


    public static void hashSet() {

        Set<Integer> set = new HashSet<>();
        Set<String> names = new HashSet<>();
        names.add("PAA");
        names.add("YEE");
        names.add("DEE");
        names.add(null);
        names.addAll(test);

        names.forEach(n -> System.out.print(n + " "));
        System.out.println();


        set.add(311);
        set.add(788);
        set.add(299);
        set.add(7288);
        set.add(null);
        set.addAll(test2);
        for (int i = 24; i > 0; i--) {
            set.add(i + 4);
        }

        set.forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println("*****HashSet*****");

    }

    public static void linkedHashSet() {

        Set<Integer> set = new LinkedHashSet<>();
        Set<String> names = new LinkedHashSet<>();

        names.add("PAA");
        names.add("YEE");
        names.add("DEE");
        names.add("XDF");
        names.add(null);
        names.addAll(test);

        names.forEach(n -> System.out.print(n + " "));
        System.out.println();


        set.add(784);
        set.add(999);
        set.add(299);
        set.add(7288);
        set.add(null);
        set.addAll(test2);
        for (int i = 24; i > 0; i--) {
            set.add(i + 4);
        }

        set.forEach(n -> System.out.print(n + " "));
        System.out.println("");
        System.out.println("*****linkedHashSet*****");


    }

    public static void treeSet() {

        SortedSet<Integer> set = new TreeSet<>();
        SortedSet<String> stringSet = new TreeSet<>();

        stringSet.add("PAA");
        stringSet.add("YEE");
        stringSet.add("DEE");
        stringSet.add("XDF");
        stringSet.addAll(test);

        System.out.println(stringSet);

        set.add(784);
        set.add(999);
        set.add(299);
        set.add(7288);
        set.addAll(test2);
        for (int i = 24; i > 0; i--) {
            set.add(i + 4);
        }

        System.out.println(set);
        System.out.println(set.reversed());
        System.out.println("*****TreeSet*****");

        System.out.println(set.tailSet(15));


    }
}
