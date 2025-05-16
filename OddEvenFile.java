import java.io.*;
import java.util.Scanner;

public class OddEvenFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter source file name: ");
        String inFileName = scanner.nextLine();

        System.out.print("Enter destination file for even numbers: ");
        String evFileName = scanner.nextLine();

        System.out.print("Enter destination file for odd numbers: ");
        String odFileName = scanner.nextLine();

        try (
            BufferedReader rd = new BufferedReader(new FileReader(inFileName));
            BufferedWriter ev = new BufferedWriter(new FileWriter(evFileName));
            BufferedWriter od = new BufferedWriter(new FileWriter(odFileName))
        ) {
            String line;
            while ((line = rd.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }

                try {
                    int number = Integer.parseInt(line);
                    if (number % 2 == 0) {
                        ev.write(number + "\n");
                    } else {
                        od.write(number + "\n");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number: " + line);
                }
            }

            System.out.println("Even & odd numbers have been copied to separate files.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
