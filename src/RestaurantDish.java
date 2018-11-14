public class RestaurantDish {
//    public int costInCents;
//    public String nameOfDish;
//    public boolean wouldRecommend;
//    public void eat() {
//        System.out.println("Nom nom nom!");
//    }
//}
//    Create a class called "RestaurantDish" (you should not include quotes)
//
//        Include an integer property called "costInCents"
//        Include a string property called "nameOfDish"
//        Include a boolean property called "wouldRecommend"
//        Include a method called "eat"
//        this method will print out "Nom nom nom!"
//
//        Create another class called RestaurantTest
//        Add a main method and inside the method...
//        1) instantiate a RestaurantDish object called "dish"
//        2) assign values creative to each of the properties
//        3) print out each of the property values
//        4) test the eat() method by calling it

    public RestaurantDish() {
    }

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public void eat() {
        System.out.println("Nom nom nom!");
    }

    public RestaurantDish(String nameOfDish, int costInCents, boolean wouldRecommend) {
        this.nameOfDish = nameOfDish;
        this.costInCents = costInCents;
        this.wouldRecommend = wouldRecommend;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public int getCostInCents() {
        return this.costInCents;
    }

    public String getNameOfDish() {
        return this.nameOfDish;
    }

    public boolean isWouldRecommend() {
        return this.wouldRecommend;
    }
}


//    SHORT ASSIGNMENT #2 (part 2) --
//        Refactor your RestaurantDish and RestaurantTest classes...
//        1) Change your public properties in your RestaurantDish class to private
// 2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to do this quickly)
//         3) Refactor code used in RestaurantTest to set and print these property values...
//         ...to use your getters and setters
//         4) Add a constructor method to RestaurantDish that will assign property...
//         ...values based on arguments passed into the constructor

