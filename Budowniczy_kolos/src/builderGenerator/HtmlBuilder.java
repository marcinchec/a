package builderGenerator;

public class HtmlBuilder implements DocumentBuilder {
    private Html html;

    public HtmlBuilder() {
        this.html = new Html();
    }

    @Override
    public String paragraf(String para) {
        String a="<p>";
        a+=para;
        a+="</p>";
        html.dodaj_paragraf(a);
        return html.getParagraf();
    }

    @Override
    public String linia(String linia) {
        String a="<hr>";
        html.dodaj_linie_pozioma(a);
        return html.getLina_pozioma();
    }

    @Override
    public String rozpoczecie(String start) {
        String a="<html>";
        html.rozpoczynanie_dokumentu(a);
        return html.getRozpoczynanie_dokumentu();
    }

    @Override
    public String zakonczenie(String end) {
        String a="</html>";
        html.konczenie_dokumentu(end);
        return html.getKonczenie();
    }
}
