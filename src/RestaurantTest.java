public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish("Tuscani Pasta", 1000, true);
//        dish.costInCents = 500;
//        dish.nameOfDish = "pizza";
//        dish.wouldRecommend = true;
//        dish.eat();
        System.out.println(dish.getCostInCents());
        System.out.println(dish.getNameOfDish());
        System.out.println(dish.isWouldRecommend());
        dish.eat();
    }
}