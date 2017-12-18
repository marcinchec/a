package irek;

import java.io.*;

public class ZapiszCyfryDoPliku implements ZapiszDoPliku {

    @Override
    public void zapisz() {
        try {
            File file = new File("src/irek/plik.txt");
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("12345");
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
