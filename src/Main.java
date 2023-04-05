import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            int ammountOfSales = sc.nextInt();
            /*String[] product = new String[ammountOfSales];
            double[] weight = new double[ammountOfSales];
            int[] price = new int[ammountOfSales];*/
            Sale[] sales = new Sale[ammountOfSales];
            for (int i = 0; i < ammountOfSales; i++) {
                sales[i] = new Sale();
                sales[i].product = sc.next();
                sales[i].weight = sc.nextDouble();
                sales[i].price = sc.nextInt();
            }

           /* System.out.println(Arrays.toString(product));
            System.out.println(Arrays.toString(weight));
            System.out.println(Arrays.toString(price));*/
            System.out.println(Arrays.toString(sales));

            ArrayList<Sale> sales1 = new ArrayList<Sale>();
            sales1.addAll(List.of(sales));
            sales1.sort(Comparator.comparing(Sale::toString));
            System.out.println(sales1);

            sales1.sort(Comparator.comparing(Sale::getWeight));
            System.out.println(sales1);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
