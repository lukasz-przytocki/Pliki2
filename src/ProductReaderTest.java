import java.io.FileNotFoundException;

public class ProductReaderTest {
    public static void main(String[] args) {
        ProductReader productReader = new ProductReader();
        try {
            Product[] products;
            products= productReader.readProducts("file.csv");
            for (Product product: products){
                System.out.println(product.getProducts());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Plik nie istnieje");
        }

    }
}
