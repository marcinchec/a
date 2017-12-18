package strategy;

public class ItCanNotFly implements Fly {
    @Override
    public String fly() {
        return "I cant fly :(";
    }
}
