package builderGenerator;

import java.io.*;

public class Director {
    private DocumentBuilder documentbuilder;

    public Director(DocumentBuilder documentbuilder) {
        this.documentbuilder = documentbuilder;
    }

    public String generateDocument()
    {
        String napis="";
        try
        {
            File file = new File("/src/builderGenerator/plik.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linia;
            while((linia=br.readLine())!=null)
            {
                documentbuilder.linia(linia);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "A";
    }
}
