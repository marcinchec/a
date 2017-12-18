package strategy;

public class Bird extends Animal {

    public Bird(String name) {
        super();
        setName(name);
        flying=new ItCanFly();
    }
}
