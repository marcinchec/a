package builderGenerator;

public abstract class Text implements GenerateDocument {
    private String paragraf;
    private String lina_pozioma;


    public void dodaj_paragraf(String para) {
        this.paragraf=para;
    }

    public void dodaj_linie_pozioma(String linia) {
        this.lina_pozioma=linia;
    }
}
