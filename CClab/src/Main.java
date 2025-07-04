public class Main {
    public static void main(String[] args) {
        // Example: Find odd numbers from 1 to 20
        int start = 1;
        int end = 20;

        System.out.println("Odd numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {  // i is odd if remainder is not 0 when divided by 2
                System.out.print(i + " ");
            }
        }
    }
}
