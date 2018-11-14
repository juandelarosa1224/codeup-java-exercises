public class BurgerTester {
    public static void main(String[] args) {
    BurgerTools burger1 = new BurgerTools();
        burger1.mostPopularTopping = "cheese";
        burger1.averageDaysBeforeExpiration = 2;
        burger1.temperatureWhenCooked = 450;
        burger1.grill();
    }
}

