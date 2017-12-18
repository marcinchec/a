package builder;

public class Wma implements FileFormat {
    private String naglowek;
    private String tags;
    private String body;

    @Override
    public void setNaglowek(String naglowek) {
        this.naglowek=naglowek;
    }

    @Override
    public void setTags(String tags) {
        this.tags=tags;
    }

    @Override
    public void setBody(String body) {
        this.body=body;
    }
}
