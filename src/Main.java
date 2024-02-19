import java.util.Scanner;

class MeasurementConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meters = 0;
        boolean validInput;

        // Prompt user for the measurement in meters
        do {
            System.out.print("Enter a measurement in meters: ");
            if (scanner.hasNextDouble()) {
                meters = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid measurement in meters.");
                scanner.next(); // clear the invalid input
                validInput = false;
            }
        } while (!validInput);

        // Convert meters to miles
        double miles = meters * 0.000621371;
        System.out.println("Measurement in miles: " + miles);

        // Convert meters to feet
        double feet = meters * 3.28084;
        System.out.println("Measurement in feet: " + feet);

        // Convert meters to inches
        double inches = meters * 39.3701;
        System.out.println("Measurement in inches: " + inches);

        scanner.close();
    }
}
