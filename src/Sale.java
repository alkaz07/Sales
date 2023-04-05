public class Sale {
    String product;
    double weight;
    int price;

    @Override
    public String toString() {
        return "Sale{" + product + ", "+ weight + ", " + price +'}';
    }

    public double getWeight() {
        return weight;
    }
}
