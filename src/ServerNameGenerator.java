//import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
//
    String adjective = getElement(adj);
    String Noun = getElement(Nouns);
        System.out.println(adjective + "-" + Noun);
    }
//    Two STRING arrays
    private static String[] adj = {"courageous", "scandalous", "tight", "rough", "abrupt", "frantic", "rainy", "sincere", "imported", "repulsive"};
    private static String[] Nouns = {"rice", "sense", "time", "carpenter", "wealth", "turkey", "crowd", "rule", "train", "harmony"};
//        int num = (int) (Math.random() * 9) + 0;
//        String Noun = Nouns[num];
        public static String getElement(String[] Array) {
        int num = (int) (Math.random() * 9) + 0;
        String element = Array[num];
        return element;
    }
}


