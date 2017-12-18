package deco;

public class Osoba {
    private String imie;
    private int wiek;
    private String narodowos;

    public Osoba(String imie, int wiek, String narodowos) {
        this.imie = imie;
        this.wiek = wiek;
        this.narodowos = narodowos;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    public String getNarodowos() {
        return narodowos;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setNarodowos(String narodowos) {
        this.narodowos = narodowos;
    }
}
