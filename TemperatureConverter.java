import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Temperature Converter!");
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();
        
        System.out.print("Enter the unit of the temperature (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = scanner.next().charAt(0);
        
        switch (unit) {
            case 'C':
            case 'c':
                convertFromCelsius(temperature);
                break;
            case 'F':
            case 'f':
                convertFromFahrenheit(temperature);
                break;
            case 'K':
            case 'k':
                convertFromKelvin(temperature);
                break;
            default:
                System.out.println("Invalid unit of temperature entered. Please enter C, F, or K.");
        }
        
        scanner.close();
    }
    
    public static void convertFromCelsius(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit + "F");
        System.out.println("Temperature in Kelvin: " + kelvin + " K");
    }
    
    public static void convertFromFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        double kelvin = celsius + 273.15;
        System.out.println("Temperature in Celsius: " + celsius + "C");
        System.out.println("Temperature in Kelvin: " + kelvin + " K");
    }
    
    public static void convertFromKelvin(double kelvin) {
        double celsius = kelvin - 273.15;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Celsius: " + celsius + "C");
        System.out.println("Temperature in Fahrenheit: " + fahrenheit + "F");
    }
}
