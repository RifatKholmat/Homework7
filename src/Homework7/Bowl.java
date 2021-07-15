package Homework7;

public class Bowl {
    private int food;

    public void putFoodIntoBowl(int amount) {
        this.food += amount;
        System.out.printf("Food increased for %d, now: %d\n", amount, this.food);
    }

    public boolean decreaseFoodFromBowl(int amount) {
        if (this.food < amount) {
            System.out.println("Error! Not enough food!");
            return false;
        }
        this.food -= amount;
        System.out.printf("Food decreased for %d, now: %d\n", amount, this.food);
        return false;
    }

    public int getFood() {
        return food;
    }
}
