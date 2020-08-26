//Write a program that prints the numbers from 1 to 100 and for multiples of '3' print "Fizz"
//instead of the number and for the multiples of '5' print "Buzz".

import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {

    public void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    // 1 to N
    public List<String> fizzBuzz(int n) {
        List<String> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            if (i % 3 == 0) {
                sb.append("Fizz");
            }
            if (i % 5 == 0) {
                sb.append("Buzz");
            }
            if (sb.length() == 0) {
                sb.append(i);
            }
            list.add(sb.toString());
        }
        return list;
    }
}
