package strategy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog piesek = new Dog("PIes");
        System.out.println(piesek.tryFlying());

        Animal bird = new Bird("ptaku");
        System.out.println(bird.tryFlying());
    }
}
