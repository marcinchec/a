package builder;

public class Mp3Builder implements FileBuilder {
    private Mp3 mp3;

    public Mp3Builder() {
        this.mp3 = new Mp3();
    }

    @Override
    public String budujNaglowek() {
        mp3.setNaglowek("Mp3Header");
        return "Mp3Header";
    }

    @Override
    public String budujTagi() {
        mp3.setTags("Mp3Tags");
        return "Mp3Tags";
    }

    @Override
    public String budujBody(int[] tablica) {
        String napis="";
        for(int i=0;i<tablica.length;i++)
        {
            napis+=String.valueOf(tablica[i]/2);
            napis+=",";
        }
        mp3.setBody(napis);
        return napis;
    }
}
