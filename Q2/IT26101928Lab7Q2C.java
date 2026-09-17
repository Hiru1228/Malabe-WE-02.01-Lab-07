public class IT26101928Lab7Q2C {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) { // Outer loop for rows
            for (int j = 1; j <= i; j++) { // Inner loop for printing numbers
                System.out.print(i);
            }
            System.out.println(); // Move to next line
        }
    }
}