import java.util.Scanner;

public class IT24103835Lab5Q3 {
    
    public static final int ROOM_CHARGE_PER_DAY = 48000;
    public static final int DISCOUNT_3_TO_4_DAYS = 10;
    public static final int DISCOUNT_5_OR_MORE_DAYS = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start date (day): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter the end date (day): ");
        int endDate = scanner.nextInt();

        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

        
        int daysReserved = endDate - startDate;

        
        int discountRate = 0;
        if (daysReserved >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        } else if (daysReserved >= 3) {
            discountRate = DISCOUNT_3_TO_4_DAYS;
        }

        
        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
        double discountAmount = totalAmount * discountRate / 100;
        double finalAmount = totalAmount - discountAmount;

        
        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Total amount before discount: Rs " + totalAmount);
        System.out.println("Discount: " + discountRate + "%");
        System.out.println("Total amount to be paid after discount: Rs " + finalAmount);
    }
}