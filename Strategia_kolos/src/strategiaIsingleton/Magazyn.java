package strategiaIsingleton;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Magazyn {
    private Magazyn(){};
    private static Magazyn instance=null;
    private List<Przedmiot> przedmioty = new ArrayList<>();
    public static Magazyn getInstance() {
        if(instance==null)
        {
            instance=new Magazyn();
        }
        return instance;
    }

    public void dodajDoSpisu(Przedmiot przedmiot)
    {
        przedmioty.add(przedmiot);
    }

    public double pobierzWartoscPoOpodatkowaniu(Podatek podatek)
    {
        double suma=0;
        for(Przedmiot p : przedmioty)
        {
            suma+=p.okreslWartosc();
        }
        return suma;
    }
}
