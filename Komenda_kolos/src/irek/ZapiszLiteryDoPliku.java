package irek;

import java.io.*;

public class ZapiszLiteryDoPliku implements ZapiszDoPliku{
    @Override
    public void zapisz() {
        try {
            File file = new File("src/irek/plik.txt");
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("abcdef");
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
