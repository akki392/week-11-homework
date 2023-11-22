package Question9;

import java.util.ArrayList;
import java.util.Iterator;

public class Q9 {

    public static void main(String[] args) {
        ArrayList<String> groupnames = new ArrayList<>();
        groupnames.add("Code1");
        groupnames.add("Agile");
        groupnames.add("Restassured");
        groupnames.add("Selenium");
        groupnames.add("Java");
        groupnames.add("Code2");
        Iterator<String> a  = groupnames.iterator();
        for(String name : groupnames) {
            {
                System.out.println(name);
            }
        }

    }
}
