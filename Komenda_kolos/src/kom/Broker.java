package kom;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orders=new ArrayList<>();

    public void takeorder(Order o)
    {
        orders.add(o);
    }

    public void wykonajZamowienia()
    {
        for(Order o : orders)
        {
            o.execute();
        }
        orders.clear();
    }
}
