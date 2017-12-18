package kom;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stock sklepik = new Stock("Ogórki",20);

        Order buy=new BuyStock(sklepik);
        Order sell=new SellStock(sklepik);

        Broker posrednik=new Broker();

        posrednik.takeorder(buy);
        posrednik.wykonajZamowienia();

        posrednik.takeorder(sell);
        posrednik.takeorder(buy);
        posrednik.takeorder(buy);
        posrednik.wykonajZamowienia();

    }
}
