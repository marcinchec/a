package irek;

public class ZapiszCyfry implements Command {
    private ZapiszDoPliku zapiszcyfry;
    int godz=20;
    int min = 21;
    public ZapiszCyfry(ZapiszDoPliku zapisz) {
        this.zapiszcyfry = zapisz;
    }

    @Override
    public void execute(String path, int godz, int min) {
        zapiszcyfry.zapisz();
    }
}
