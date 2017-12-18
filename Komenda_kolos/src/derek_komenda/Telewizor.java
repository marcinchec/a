package derek_komenda;

public class Telewizor implements Urzadzenie {
    private int volume=0;
    @Override
    public void wlacz() {
        System.out.println("Tv wlaczone");
    }

    @Override
    public void wylacz() {
        System.out.println("Tv wylaczone");
    }

    @Override
    public void podglosnij() {
        System.out.println("Poziom glosnosci: "+ ++volume);
    }

    @Override
    public void przycisz() {
        System.out.println("Poziom glosnosci: "+ --volume);
    }
}
