package movies;

public class Movie {
    private String name;
    private String category;


    //  Constructor starts
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

// create setters
        public void setName(String name) {
            this.name = name; }
        public void setCategory(String category) {
            this.category = category; }

// create getters
        public String getName() { return name; }
        public String getCategory() { return category; }
}
