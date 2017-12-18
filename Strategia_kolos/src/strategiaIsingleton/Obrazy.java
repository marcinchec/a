package strategiaIsingleton;


//wartość Obrazów to 2100 minus rok namalowania, pomnożone razy 10.
public class Obrazy extends Przedmiot {
    private int rok_namalowania;
    private String nazwa;

    public Obrazy(int rok_namalowania, String nazwa) {
        this.rok_namalowania = rok_namalowania;
        this.nazwa=nazwa;

    }

    @Override
    public double okreslWartosc() {
        if(podatek!=null) {
            return podatek.licz((2100 - rok_namalowania) * 10);
        }
        else {
            return (2100 - rok_namalowania) * 10;
        }
    }
}
