package deco;

import java.util.ArrayList;
import java.util.List;

public class FiltrPelnoletnosci extends Filtr{


    public FiltrPelnoletnosci(BaseClass base) {
        super(base);
    }

    @Override
    public List<Osoba> czytaj() {
        List<Osoba> lista_osob=base.czytaj();
        List<Osoba> temp_list = new ArrayList<>(lista_osob);
        for(Osoba o : lista_osob)
        {
            if(o.getWiek()<18){
                temp_list.remove(o);
            }
        }
        return temp_list;
    }
}
