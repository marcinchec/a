package factory2;

public class Main {
    public static void main(String[] arg)
    {
        FabrykaDni dzien=new FabrykaDni();
        System.out.println(dzien.getDzien(2).getClass().getSimpleName());
    }
}
