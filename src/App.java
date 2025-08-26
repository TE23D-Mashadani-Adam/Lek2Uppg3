import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Kalkylator

        Scanner scanner = new Scanner(System.in);

        double tal1 = 0;
        double tal2 = 0;
        String val = "";
        double sum = 0;

        boolean on = true;

        while (on) {
            sum = 0; // Resetar summan

            boolean rättval = false;
            while (!rättval) {

                System.out.println("Meny: " + "\n" + "1.Addition" + "\n" + "2.Subtraktion" +
                        "\n" + "3.Multiplikation"
                        + "\n" + "4.Division" + "\n" + "5.Avsluta" + "\n" + "Välj metod:");
                val = scanner.nextLine();

                if (val.equals("1") || val.equals("2") || val.equals("3") || val.equals("4") || val.equals("5")) {
                    rättval = true;
                } else {
                    System.out.println("Välja snälla metod från 1-5");
                    rättval = false;
                }

            }

            if (val.equals("5")) {
                on = false;
                break;
            }

            boolean felTalInput = true;
            while (felTalInput) {
                try {
                    System.out.print("Välj tal 1:");
                    tal1 = scanner.nextDouble();

                    System.out.print("Välj tal 2:");
                    tal2 = scanner.nextDouble();

                    felTalInput = false;
                } catch (InputMismatchException b) {
                    System.out.println("Snälla välj en siffra!!");
                    scanner.nextLine();
                }
            }

            String operation = "";

            switch (val) {
                case "1":
                    sum = tal1 + tal2;
                    operation = "+";
                    break;
                case "2":
                    sum = tal1 - tal2;
                    operation = "-";
                    break;
                case "3":
                    sum = tal1 * tal2;
                    operation = "*";
                    break;
                case "4":
                    sum = tal1 / tal2;
                    operation = "/";
                    break;
                default:
                    break;
            }

            System.out.println((int)tal1 + " " + operation +  " " + (int)tal2 + "= " + sum);
            System.out.print("Tryck för att gå vidare");
            String vidare = scanner.nextLine();

        }
    }

}
