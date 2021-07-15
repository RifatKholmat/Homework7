package Homework7;

public class Cat {
    private final String name;
    private final int appetite;
//    private Flea[] fleas;
    private boolean satiety;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety  = false;
    }

    public boolean eat(Bowl bowl) {
        if (bowl.decreaseFoodFromBowl(appetite)) {
            System.out.printf("Cat %s ate for %d food\n", this.name, this.appetite);
            this.satiety = true;
            return true;
        }
        System.out.printf("Сat %s could not eat food. %d - need, %d - present\n", this.name, this.appetite, bowl.getFood());
        return false;
    }

//    public void playWithFleas() {
//        for (Flea flea : fleas) {
//            flea.jump();
//        }
//    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

//    public Flea[] getFleas() {
//        return fleas;
//    }

//    public void setFleas(Flea[] fleas) {
//        this.fleas = fleas;
//    }
}
