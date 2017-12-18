package derek_komenda;

public class PrzyciszUrzadzenie implements Command {
    private Urzadzenie urzadzenie;

    public PrzyciszUrzadzenie(Urzadzenie urzadzenie) {
        this.urzadzenie = urzadzenie;
    }

    @Override
    public void execute() {
        urzadzenie.przycisz();
    }
}
