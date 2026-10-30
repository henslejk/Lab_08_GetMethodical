import java.util.Scanner;

public class FavNumbers {

    public static void main (String[] args) {

        Scanner in = new Scanner (System.in);

        int favoriteInteger = SafeInput.getInt(in,"Enter your favorite integer");

        double favoriteDouble = SafeInput.getDouble(in, "Enter your favorite double");

        IO.println ("Favorite number: " + favoriteInteger);
        IO.println ("Favorite double: " + favoriteDouble);

    }
}
