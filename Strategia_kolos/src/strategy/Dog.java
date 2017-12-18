package strategy;

public class Dog extends Animal {

    public void kop_dziure()
    {
        System.out.println("Kopie");
    }
    public Dog(String name){
        super();
        setName(name);
        flying=new ItCanNotFly();
    }
}
