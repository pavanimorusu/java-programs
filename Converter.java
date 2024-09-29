import java.util.Scanner;

abstract class Converter {
    public abstract void convert();
}

class CurrencyConverter extends Converter {
    private static final double USD_TO_INR = 83.25;
    private static final double EURO_TO_INR = 89.50;
    private static final double YEN_TO_INR = 0.56;

    public void convert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Currency Converter: ");
        System.out.println("1. Dollar to INR");
        System.out.println("2. INR to Dollar");
        System.out.println("3. Euro to INR");
        System.out.println("4. INR to Euro");
        System.out.println("5. Yen to INR");
        System.out.println("6. INR to Yen");
        System.out.print("Choose conversion type: ");
        int choice = scanner.nextInt();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        switch (choice) {
            case 1: 
                System.out.println("Dollar to INR: " + amount * USD_TO_INR);
                break;
            case 2: 
                System.out.println("INR to Dollar: " + amount / USD_TO_INR);
                break;
            case 3: 
                System.out.println("Euro to INR: " + amount * EURO_TO_INR);
                break;
            case 4: 
                System.out.println("INR to Euro: " + amount / EURO_TO_INR);
                break;
            case 5: 
                System.out.println("Yen to INR: " + amount * YEN_TO_INR);
                break;
            case 6: 
                System.out.println("INR to Yen: " + amount / YEN_TO_INR);
                break;
            default: 
                System.out.println("Invalid Choice");
                break;
        }
    }
}

class DistanceConverter extends Converter {
    public void convert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Distance Converter: ");
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Kilometers to Meters");
        System.out.println("3. Miles to Kilometers");
        System.out.println("4. Kilometers to Miles");
        System.out.print("Choose conversion type: ");
        int choice = scanner.nextInt();
        System.out.print("Enter distance: ");
        double distance = scanner.nextDouble();

        switch (choice) {
            case 1: 
                System.out.println("Meters to Kilometers: " + distance / 1000);
                break;
            case 2: 
                System.out.println("Kilometers to Meters: " + distance * 1000);
                break;
            case 3: 
                System.out.println("Miles to Kilometers: " + distance * 1.60934);
                break;
            case 4: 
                System.out.println("Kilometers to Miles: " + distance / 1.60934);
                break;
            default: 
                System.out.println("Invalid Choice");
                break;
        }
    }
}

class TimeConverter extends Converter {
    public void convert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Time Converter: ");
        System.out.println("1. Hours to Minutes");
        System.out.println("2. Minutes to Hours");
        System.out.println("3. Hours to Seconds");
        System.out.println("4. Seconds to Hours");
        System.out.print("Choose conversion type: ");
        int choice = scanner.nextInt();
        System.out.print("Enter time: ");
        double time = scanner.nextDouble();

        switch (choice) {
            case 1: 
                System.out.println("Hours to Minutes: " + time * 60);
                break;
            case 2: 
                System.out.println("Minutes to Hours: " + time / 60);
                break;
            case 3: 
                System.out.println("Hours to Seconds: " + time * 3600);
                break;
            case 4: 
                System.out.println("Seconds to Hours: " + time / 3600);
                break;
            default: 
                System.out.println("Invalid Choice");
                break;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = null;

        System.out.println("Converter Application");
        System.out.println("1. Currency Converter");
        System.out.println("2. Distance Converter");
        System.out.println("3. Time Converter");
        System.out.print("Choose a converter: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: 
                converter = new CurrencyConverter();
                break;
            case 2: 
                converter = new DistanceConverter();
                break;
            case 3: 
                converter = new TimeConverter();
                break;
            default: 
                System.out.println("Invalid choice");
                break;
        }

        if (converter != null) {
            converter.convert();
        }
    }
}
