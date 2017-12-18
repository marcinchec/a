package derek_komenda;

public class Radio implements Urzadzenie {
    private int volume=0;
    @Override
    public void wlacz() {
        System.out.println("Radio wlaczone");
    }

    @Override
    public void wylacz() {
        System.out.println("Radio wylaczone");
    }

    @Override
    public void podglosnij() {
        System.out.println("poziom glosnosci: "+ ++volume);
    }

    @Override
    public void przycisz() {
        System.out.println("poziom glosnosciL "+ --volume);
    }
}
