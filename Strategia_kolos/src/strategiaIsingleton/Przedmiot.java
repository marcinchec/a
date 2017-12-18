package strategiaIsingleton;

public abstract class Przedmiot {
    protected static Podatek podatek;
    abstract double okreslWartosc();

    public void setPodatek(Podatek podatek) {
        this.podatek = podatek;
    }
}
