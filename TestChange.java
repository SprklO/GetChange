import java.util.Scanner;

public class TestChange
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double total, pay, change; 
        int newChange;
        
        Change myChange = new Change();
        System.out.println("total: ");
        total = input.nextDouble();
        
        System.out.println("amount: ");
        pay = input.nextDouble();
        
        change = myChange.getChange(total, pay);
        System.out.printf("getChange = %f \n", change);
        newChange = (myChange.round(change) * 100);
        System.out.printf("round = %d \n", newChange);
        myChange.whatBills(newChange);
        
        
    }
}