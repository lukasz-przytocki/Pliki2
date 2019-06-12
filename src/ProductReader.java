import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductReader {


    Product[] readProducts(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));
        Product[] products = new Product[countLines(file)];

            String[] table;
            int counter=0;
            while (scanner.hasNextLine()){
                table=scanner.nextLine().split(";");
                products[counter]=new Product(table[0], table[1],Double.parseDouble(table[2]));
                counter++;
            }

        return products;


    }
    private int countLines(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));
        int counter = 0;

        while (scanner.hasNextLine()){
            counter++;
            scanner.nextLine();

        }
        scanner.close();
        return counter;



    }







}
