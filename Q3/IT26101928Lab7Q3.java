import java.util.Scanner;

public class IT26101928Lab7Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalBill;
        double discount;
        double amountToBePaid;
        char paymentMode;

        for (int customer = 1; customer <= 5; customer++) {

            System.out.println("Customer " + customer);

            System.out.print("Enter total bill amount: ");
            totalBill = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            paymentMode = input.next().charAt(0);

            if (paymentMode == 'C' || paymentMode == 'c') {

                discount = totalBill * 0.05;
                amountToBePaid = totalBill - discount;

                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + amountToBePaid);

            } else if (paymentMode == 'O' || paymentMode == 'o') {

                amountToBePaid = totalBill;

                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + amountToBePaid);

            } else {

                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }

        input.close();
    }
}