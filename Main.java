public class Main {
    public static void main(String[] args) {
         Product product = new Product("182b4", "áo" , "Thời trang" , 134 , 20);
        LineItem lineItem = new LineItem(product, 2);
        System.out.println(lineItem.toString());

    }
}