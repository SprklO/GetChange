public class Change
{
    private int TWENTY = 2000;
    private int TEN = 1000;
    private int FIVE = 500;
    private int ONE = 100;
    private int QUARTER = 25;
    private int DIME = 10;
    private int NICKLE = 5;
    private int PENNY = 1;
    
    public double getChange(double total, double pay)
    {
        double change;
        change = pay - total;
        return change;
    }
    public int round(double num)
    {
        return (int)(num + .5);
    }
    public void whatBills(int amt)
    {
        int twentyAmt, tenAmt, fiveAmt, oneAmt, quarterAmt, dimeAmt, nickleAmt, pennyAmt, newAmt;
        
        twentyAmt = amt / TWENTY;
        newAmt = amt % TWENTY;
        System.out.printf("20 bills: %d \n", twentyAmt);
        
        tenAmt = newAmt / TEN;
        newAmt = amt % TEN;
        System.out.printf("10 bills: %d \n", tenAmt);
        
        fiveAmt = newAmt / FIVE;
        newAmt = amt % FIVE;
        System.out.printf("5 bills: %d \n", fiveAmt);
        
        oneAmt = newAmt / ONE;
        newAmt = amt % ONE;
        System.out.printf("1 bills: %d \n", oneAmt);
        
        quarterAmt = newAmt / QUARTER;
        newAmt = amt % QUARTER;
        System.out.printf("Quarters: %d \n", quarterAmt);
        
        dimeAmt = newAmt / DIME;
        newAmt = amt % DIME;
        System.out.printf("Dime: %d \n", dimeAmt);
        
        nickleAmt = newAmt / NICKLE;
        newAmt = amt % NICKLE;
        System.out.printf("Nickles: %d \n", nickleAmt);
        
        pennyAmt = newAmt / PENNY;
        newAmt = amt % PENNY;
        System.out.printf("Pennys: %d \n", pennyAmt);
    }
}