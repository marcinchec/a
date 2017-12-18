package obserwator;

public class Internet implements Obserwator {
    private Totolotek t;

    public Internet(Totolotek t) {
        this.t = t;
        t.dodajObserwatora(this);
    }

    @Override
    public void update() {
        System.out.println("Internet wynik: ");
        int[] nowe=t.getLiczby();
        for(int n : nowe)
        {
            System.out.print(n+" ");
        }
        System.out.println();
    }
}
