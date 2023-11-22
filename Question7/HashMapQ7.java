package Question7;

import java.util.HashMap;

public class HashMapQ7 {

    public static void main(String[] args) {
        HashMap<Integer,String> people= new HashMap<>();
        people.put(1,"Akash");
        people.put(2,"Akshay");
        people.put(3,"Parth");
        people.put(4,"Hitesh");
        people.put(5,"Rutvi");

        for(Integer i:people.keySet()){
            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }

}
