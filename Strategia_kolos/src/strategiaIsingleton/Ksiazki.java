package strategiaIsingleton;
//wartość Książek to 2050 minus rok wydania, podzielone przez numer wydania książki.
public class Ksiazki extends Przedmiot {
    private int rok_wydania;
    private int nr_wydania;
    private String nazwa;

    public Ksiazki(int rok_wydania, int nr_wydania, String nazwa) {
        super();
        this.rok_wydania = rok_wydania;
        this.nr_wydania = nr_wydania;
        this.nazwa = nazwa;
    }

    @Override
    public double okreslWartosc() {
        if(podatek!=null) {
            return podatek.licz((2050 - rok_wydania) / nr_wydania);
        }
        else
        {
            return (2050 - rok_wydania) / nr_wydania;
        }
    }
}
