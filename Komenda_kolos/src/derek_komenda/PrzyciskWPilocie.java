package derek_komenda;

public class PrzyciskWPilocie {
    private Command komenda;

    public PrzyciskWPilocie(Command komenda) {
        this.komenda = komenda;
    }

    public void przycisnij_przycisk()
    {
        komenda.execute();
    }
}
