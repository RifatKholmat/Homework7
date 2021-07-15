package Homework7;

public class Homework7 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 10),
                new Cat("Murzik", 20),
                new Cat("Murka", 15)
        };

        Bowl bowl = new Bowl();
        bowl.putFoodIntoBowl(30);

        for (Cat cat : cats) {
            cat.eat(bowl);
        }
        System.out.println(bowl.getFood());
    }
}
