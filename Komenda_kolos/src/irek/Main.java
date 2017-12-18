package irek;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Command> lista_komend = new ArrayList<>();
        ZapiszDoPliku zapis= new ZapiszCyfryDoPliku();
        lista_komend.add(new ZapiszLitery(zapis));

        zapis=new ZapiszCyfryDoPliku();
        lista_komend.add(new ZapiszCyfry(zapis));

        for (Command c : lista_komend) {
            System.out.println(c.getClass());
            c.execute("sa", 19, 35);
        }

    }
}
