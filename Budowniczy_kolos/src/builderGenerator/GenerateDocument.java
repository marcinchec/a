package builderGenerator;

public interface GenerateDocument {
    void dodaj_paragraf(String para);
    void dodaj_linie_pozioma(String linia);
    void rozpoczynanie_dokumentu(String start);
    void konczenie_dokumentu(String end);
}
