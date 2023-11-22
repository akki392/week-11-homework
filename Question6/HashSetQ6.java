package Question6;

import java.util.HashSet;

public class HashSetQ6 {

    public static void main(String[] args) {
        HashSet<Integer> numbers=new HashSet<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        for(int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) {
                System.out.println(i + " was found");
            } else {
                System.out.println(i + " was not found");
            }
        }
    }
}
