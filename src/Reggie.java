import java.util.Scanner;

public class Reggie
{
 public static void main (String[] args)
 {
  Scanner in = new Scanner(System.in);

  String mNumber = SafeInput.getRegExString(in,"(Enter SSN(123-45-6789)","^\\d{3}-\\d{2}-\\d{4}$");

  IO.println("M number: "+ mNumber);

  String choice = SafeInput.getRegExString(in,"Enter menu choice: Open, Save, View, or Quit(O, S, V, Q)","^[OoSsVvQq]$");

  IO.println("Menu choice " + choice);
 }
}
