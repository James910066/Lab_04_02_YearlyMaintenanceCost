public class YearlyMaintenanceCost
{
    public static void main(String[] args)
    {
        double springCost = 100.00;
        double winterCost = 200.00;
        double summerCost = 300.00;
        double fallCost   = 400.00;
        double totalYearMaintenanceCost = springCost + winterCost + summerCost + fallCost;
        System.out.println("The mainenance cost for Spring is $" + springCost);
        System.out.println("The maintenance cost for Winter is $" + winterCost);
        System.out.println("The maintenance cost for Summer is $" + summerCost);
        System.out.println("The maintenance cost for Fall is $" + fallCost);
        System.out.println("The total maintenance cost for the year is $" + totalYearMaintenanceCost);
    }

}