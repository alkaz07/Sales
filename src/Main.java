import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            int ammountOfSales = sc.nextInt();
            String[] product = new String[ammountOfSales];
            double[] weight = new double[ammountOfSales];
            int[] price = new int[ammountOfSales];
            for (int i = 0; i < ammountOfSales; i++) {
                product[i] = sc.next();
                weight[i] = sc.nextDouble();
                price[i] = sc.nextInt();
            }

            System.out.println(Arrays.toString(product));
            System.out.println(Arrays.toString(weight));
            System.out.println(Arrays.toString(price));

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
