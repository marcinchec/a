package factory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LogerPlikowy implements Loger {
    private String path;

    public LogerPlikowy(String path) {
        this.path = path;
    }

    @Override
    public void dodajKomunikat(LogState status, String komunikat) {

        try {
            File file = new File(path);
            file.createNewFile();
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(komunikat);
            bw.newLine();
            System.out.println(status);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
