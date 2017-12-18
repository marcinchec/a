package builder;

public class WavBuilder implements FileBuilder {
    private Wav wav;

    public WavBuilder() {
        this.wav = new Wav();
    }

    @Override
    public String budujNaglowek() {
        wav.setNaglowek("WavHeader");
        return "WavHeader";
    }

    @Override
    public String budujTagi() {
        wav.setTags("");
        return "";
    }

    @Override
    public String budujBody(int[] tablica) {
        String napis="";
        for(int i=0;i<tablica.length;i++)
        {
            napis+=String.valueOf(tablica[i]);
            napis+=",";
        }
        wav.setBody(napis);
        return napis;
    }
}
