public class Program11Factorial {
    /**
     * Calculates the factorial of 10
     * @param args
     */
    public static void main(String[] args) {
        int number = 1;
        for (int counter = 1; counter <= 10; counter++) {
            number *= counter;
        }
        System.out.println(number);
    }
}
