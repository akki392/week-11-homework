package Question10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;

public class Q10 {

    public static void main(String[] args) {
            ArrayList<String> nameList= new ArrayList<>();
            nameList.add("Akash");
            nameList.add("Hitesh");
            nameList.add("Rutvi");
            nameList.add("Kinnari");
            ListIterator<String> listIterator=nameList.listIterator();

            for(String a : nameList) {
               if (a.equalsIgnoreCase("Akash")) {
                   System.out.println(a);
               }
           }
    }
}
