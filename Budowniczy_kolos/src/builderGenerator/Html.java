package builderGenerator;

public class Html implements GenerateDocument {
    private String paragraf;
    private String lina_pozioma;
    private String rozpoczynanie_dokumentu;
    private String konczenie;

    @Override
    public void dodaj_paragraf(String para) {
        this.paragraf=para;
    }

    @Override
    public void dodaj_linie_pozioma(String linia) {
        this.lina_pozioma=linia;
    }

    @Override
    public void rozpoczynanie_dokumentu(String start) {
        this.rozpoczynanie_dokumentu=start;
    }

    @Override
    public void konczenie_dokumentu(String end) {
        this.konczenie=end;
    }

    public String getParagraf() {
        return paragraf;
    }

    public String getLina_pozioma() {
        return lina_pozioma;
    }

    public String getRozpoczynanie_dokumentu() {
        return rozpoczynanie_dokumentu;
    }

    public String getKonczenie() {
        return konczenie;
    }
}
