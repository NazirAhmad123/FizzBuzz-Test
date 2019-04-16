

public class FizzBuzzTest {
    public static void main(String[] args) {
        final String EMPTY = "";
        for (int num = 1; num <= 100; num++) {
            String result = EMPTY;
            if (num % 3 == 0) result += "Fizz"; // divisible by 3, print Fizz
            if (num % 5 == 0) result += "Buzz"; // divisible by 5, print Buzz
            if (result == EMPTY) result += num; // divisible by 3 and by 5, print FizzBuzz
            System.out.println(result); 	// print the number
        }
    }
}
