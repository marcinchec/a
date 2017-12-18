package obserwator;

public class TV implements Obserwator {

    private Totolotek t;

    public TV(Totolotek t)
    {
        this.t=t;
        t.dodajObserwatora(this);
    }
    @Override
    public void update() {
        System.out.println("TV losowanie: ");
        int[] noweliczby=t.getLiczby();
        for(int a: noweliczby)
        {
            System.out.print(a+" ");
        }
        System.out.println();
    }
}
