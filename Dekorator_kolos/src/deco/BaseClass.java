package deco;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BaseClass {

    public List<Osoba> czytaj()
    {
        List<Osoba> lista = new ArrayList<>();
        try{
            File file = new File("src/deco/plik.txt");
            FileReader fw = new FileReader(file);
            BufferedReader br = new BufferedReader(fw);

            String linia;
            while((linia=br.readLine())!=null)
            {
                String[] liniasplt=linia.split(" ");
                lista.add(new Osoba(liniasplt[0],Integer.valueOf(liniasplt[1]),liniasplt[2]));
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        return lista;
    }

}
