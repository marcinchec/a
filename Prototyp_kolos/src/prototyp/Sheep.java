package prototyp;

public class Sheep implements Animal {

    public Sheep() {
        System.out.println("Original Sheep");
    }

    @Override
    public Animal makecopy() {
        Sheep toclone=null;

        try {
            toclone= (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return toclone;
    }
}
