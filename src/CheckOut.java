import java.util.Scanner;

public class CheckOut {

    public static void main(String[] args)
    {
    Scanner in = new Scanner (System.in);

    double price;
    double total = 0.0;
    boolean moreItems;

    do
    {
        price = SafeInput.getRangedDouble(in, "Enter item price", .50, 10.00 );
    total += price;

    moreItems = SafeInput.getYNconfirm (in,"Do you have another item?");
    
    }
    while(moreItems);

    System.out.printf ("%nTotal price: $%.2f%n", total);

    }

}
