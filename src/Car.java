public class Car {
    private String make;
    private String model;
    private int year;
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String getMake() {
        return this.make;
    }
    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year;
    }
    public void setMake( String make) { this.make = make; }

    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        Car c = new Car("Ram", "1500", 2014);
        System.out.println(c.getModel());
    }

}


//public class ArraysLecture {
//    int[] nums = new int[3];
//
//    System.out.println(nums[0]);
//    System.out.println(nums[1]);
//    System.out.println(nums[2]);
//}


