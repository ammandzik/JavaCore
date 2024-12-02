package collection.list;

import java.util.*;

class Lists {

    public static List<Integer> arrayList = new ArrayList<>();
    public static List<String> linkedList = new LinkedList<>();

    public static void arrayList() {

        arrayList.add(456);
        arrayList.add(456);
        arrayList.add(777);
        arrayList.add(83);
        arrayList.add(21);


        arrayList.remove(3);

        System.out.println(arrayList);
        arrayList.clear();

        System.out.println(arrayList.isEmpty());
        System.out.println("***ArrayList***");


    }

    public static void linkedList() {


        linkedList.add("AAAB");
        linkedList.add("CAF");
        linkedList.add("CAF");
        linkedList.add("CAF");
        linkedList.add("DAAA");
        linkedList.add("PRFDSA");
        linkedList.add("CFDD");

        System.out.println(linkedList);

        System.out.println(linkedList.reversed());
        linkedList.sort(Comparator.naturalOrder());

        System.out.println(linkedList.get(5));
        linkedList.remove(5);
        System.out.println(linkedList);


        Iterator it = linkedList.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }


    }


}
