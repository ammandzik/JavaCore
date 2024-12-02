package map;

import java.util.*;

class Maps {

    public static void hashMap() {

        Map<Integer, String> map = new HashMap();

        map.put(1,"Aneta");
        map.put(23,"Daniel");
        map.put(344,"Mirek");
        map.put(3434, "Agnieszka");
        map.put(5, "Marek");
        map.put(6, "Marek");
        map.put(null, null);

        System.out.println(map);

        System.out.println(map.get(4));

        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.containsKey(6));
        System.out.println(map.containsValue("Marek"));

        System.out.println(map.remove(6));
        System.out.println(map.replace(4,"Agnieszka", "Halina"));
        System.out.println(map.size());

        for(Map.Entry<Integer, String> entrySet : map.entrySet()){
            System.out.println(entrySet);
        }

        for(String value : map.values()){
            System.out.print(value +  ", ");
        }

        for(Integer key : map.keySet()){
            System.out.println(key + ", ");
        }

        System.out.println("***HashMap***");

    }

    public static void linkedHashMap() {

        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(1,"Sławek");
        map.put(2,"Daniel");
        map.put(33,"Mirek");
        map.put(4, "Agnieszka");
        map.put(5, "Marek");
        map.put(null, null);

        System.out.println(map);

        System.out.println(map.get(3));

        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.containsKey(8));
        System.out.println(map.containsValue("Marek"));


        for(Map.Entry<Integer, String> entrySet : map.entrySet()){
            System.out.println(entrySet);
        }

        for(String value : map.values()){
            System.out.print(value +  ", ");
        }

        for(Integer key : map.keySet()){
            System.out.println(key + ", ");
        }


    }

    public static void treeMap() {

        SortedMap<Integer, String> map = new TreeMap<>();

        map.put(1,"Sławek");
        map.put(2,"Daniel");
        map.put(37,"Mirek");
        map.put(4, "Agnieszka");
        map.put(5, "Marek");


        System.out.println(map);
        System.out.println(map.reversed());

        System.out.println(map.tailMap(3));
        System.out.println(map.headMap(3));
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());

        map.clear();
        System.out.println(map);




    }
}
