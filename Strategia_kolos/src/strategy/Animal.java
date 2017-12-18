package strategy;

public class Animal {
    private String name;
    private int weight;
    //behaviour
    protected Fly flying;

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String tryFlying(){
        return flying.fly();
    }

    public Fly getFlying() {
        return flying;
    }
}
