package strategiaIsingleton;

public class Main {
    public static void main(String[] args)
    {
        Magazyn magazyn = Magazyn.getInstance();
        Podatek podatek=new Podatekliniowy();

        Przedmiot p=new Ksiazki(1999,2,"asd");
       // p.podatek=new Podatekliniowy();
        p.podatek=new PodatekProgresywny();
        magazyn.dodajDoSpisu(p);

        p=new Ksiazki(2006,3,"Asdf");
        //p.podatek=new Podatekliniowy();
        magazyn.dodajDoSpisu(p);

         p = new Obrazy(1800,"asdgfdh");
         //p.podatek=new Podatekliniowy();
         magazyn.dodajDoSpisu(p);

         p=new Obrazy(1900,"ghdgh");
        // p.podatek=new Podatekliniowy();
         magazyn.dodajDoSpisu(p);

         p=new Rzezby(1500,3,"dfhfh");
        // p.podatek=new Podatekliniowy();
         magazyn.dodajDoSpisu(p);

         p=new Rzezby(900,5,"ahsdhsdh");
       //  p.podatek=new Podatekliniowy();
         magazyn.dodajDoSpisu(p);

         double suma=magazyn.pobierzWartoscPoOpodatkowaniu(podatek);
        System.out.println(suma);


    }
}
