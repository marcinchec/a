package derek_komenda;

public class Main {
    public static void main(String[] args)
    {
        Urzadzenie tv = new Telewizor();

        Command komenda = new PodglosnijUrzadzenie(tv);
        komenda.execute();

        komenda=new WlaczUrzadzenie(tv);
        komenda.execute();

        Urzadzenie radio = new Radio();

        komenda=new WlaczUrzadzenie(radio);
        komenda.execute();


    }
}
