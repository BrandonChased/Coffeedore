import java.util.ArrayList;

public class Order {

    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items;

    public Order(String name) {
        this.name = name;
        this.total = 0;
        this.items = new ArrayList<>();
        this.ready = false;
    }

    public Order() {
        this.name = "Guest";
        this.total = 0;
        this.items = new ArrayList<>();
        this.ready = false;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isReady() {
        return this.ready;
    }

    public boolean getReady() {
        return this.ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItems(Item item) {
        this.items.add(item);
        this.total += item.getPrice();
    }

}
