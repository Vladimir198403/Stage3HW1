package Answer3;

public class Main {

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruits(new Orange());
        orangeBox.addFruits(new Orange());
        appleBox.addFruits(new Apple());
        appleBox.addFruits(new Apple());

        System.out.println("Масса коробки 1 с яблоками равна: " + appleBox.getWeight());

        appleBox1.addFruits(new Apple());
        System.out.println("Масса коробки 2 с яблоками равна: " + appleBox1.getWeight());

        appleBox.toBox(appleBox1);
        System.out.println("Масса коробки 2 с яблоками после объединения равна: " + appleBox1.getWeight());





    }
}
