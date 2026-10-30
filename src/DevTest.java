import java.util.Scanner;

public class DevTest
{
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String name = SafeInput.getNonZeroLenString(in, "Enter youe name");
        String code = "";


        IO.print("Name: " + name);

        int number = SafeInput.getInt ( in, "Enter an integer");
        IO.print("Integer: " + number);

        double decimal = SafeInput.getDouble(in, "Enter a decimal number");
        IO.print("Double: " + decimal);

        int rangedInt = SafeInput.getRangedInt (in, "Enter an integer", 1, 10);
        IO.print("Range integer: " + rangedInt);

        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a decimal", .5, 10.0);
        IO.println ("Range double: " + rangedDouble);

        boolean answer = SafeInput.getYNconfirm(in, "Continue?");
        IO.println ("Answer: " + answer);

        code = SafeInput.getRegExString(in, "Enter a five- digit M number", "^(M|m)\\d{5}$");
        IO.print("M number: " + code);

        in.close();

    }




}