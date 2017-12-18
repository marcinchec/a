package derek_komenda;

public class WlaczUrzadzenie implements Command {
    private Urzadzenie urzadzenie;

    public WlaczUrzadzenie(Urzadzenie urzadzenie) {
        this.urzadzenie = urzadzenie;
    }

    @Override
    public void execute() {
        urzadzenie.wlacz();
    }
}
