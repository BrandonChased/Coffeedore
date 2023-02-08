public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Mocha", 4);
        Item item2 = new Item("Latte", 5);
        Item item3 = new Item("drip Coffee", 3);
        Item item4 = new Item("Capuccino", 6);
        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");
        order1.addItems(item4);
        order1.addItems(item3);
        order1.addItems(item2);
        order1.addItems(item1);
        System.out.println((order1.getTotal()));
        order2.addItems(item1);
        order3.addItems(item4);
        order4.addItems(item2);
        order2.setReady(true);
        order3.addItems(item2);
        order3.addItems(item2);
        order3.setReady(true);
        // System.out.println(order1);
        // Order order2 = new Order("Latte", 5);
        // Order order3 = new Order("drip Coffee", 3);
        // Order order4 = new Order("Capuccino", 6);
        
    }
}
