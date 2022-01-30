public class Program11NestedLoops {
    /**
     * Create a simple multiplication table using nested loops
     * @param args
     */
    public static void main(String[] args) {
        for (int lineNumber = 1; lineNumber < 11; lineNumber++ ) {
            for (int multiplier = 1; multiplier < 11; multiplier++) {
                System.out.print((lineNumber * multiplier) + " ");
            }
            System.out.println();
        }
    }
}
