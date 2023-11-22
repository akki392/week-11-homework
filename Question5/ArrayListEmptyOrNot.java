package Question5;

import java.util.ArrayList;

public class ArrayListEmptyOrNot {

    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>();
        boolean ans= array.isEmpty();
        if(ans==true)
        {
            System.out.println("1st Array list is empty");
        }
        else {
            System.out.println("1stArray list is not empty");
        }
        array.add("Metropolitan");
        array.add("Jubilee");
        array.add("Central");
        array.add("Piccadilly");
        ans=array.isEmpty();
        if (ans==true){
            System.out.println("2nd  array is empty");

        }
        else
            System.out.println("2nd array list is not empty");
    }
}
