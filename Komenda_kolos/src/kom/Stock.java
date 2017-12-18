package kom;

public class Stock {
    private String name;
    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void Buy()
    {
        System.out.println("buy a: " + name +" quantity: "+quantity);
    }

    public void Sell()
    {
        System.out.println("sell a: "+ name + " quantity: "+quantity);
    }
}
