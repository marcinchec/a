package strategiaIsingleton;


//wartość Rzeźb to 2020 minus rok wykonania, pomnożone przez rozmiar rzeźby w metrach sześciennych, pomnożone razy 2.
public class Rzezby extends Przedmiot {
    private int rok_wykonania;
    private int rozmiar;
    private String nazwa;

    public Rzezby(int rok_wykonania, int rozmiar, String nazwa) {
        this.rok_wykonania = rok_wykonania;
        this.rozmiar = rozmiar;
        this.nazwa = nazwa;
    }

    @Override
    public double okreslWartosc() {
        if(podatek!=null) {
            return podatek.licz((2020 - rok_wykonania) * rozmiar * 2);
        }
        else {
            return (2020 - rok_wykonania) * rozmiar * 2;
        }
    }
}
