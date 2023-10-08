import java.util.ArrayList;
import java.util.Scanner;
public class TipCalculatorRunner {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Tip Calculator!");
        System.out.print("What percentage would you like to tip? (0%-100%) ");
        int percentage = scan.nextInt();
        System.out.println("How many people are dining with you today? (including yourself) ");
        int numberOfPeople = scan.nextInt();
        scan.nextLine();
        TipCalculator tipcalc = new TipCalculator(numberOfPeople, percentage);
        double cost = 0;
        double total = 0;

        while (cost != -1) {
            System.out.print("Enter the price of your item (enter -1 when done): $");
            cost = scan.nextDouble();
            scan.nextLine();
            total += tipcalc.addMeal(cost);
            if (cost == -1) {  //makes sure -1 isn't added to the cost
                total++;
            }
            System.out.println(total);
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Total Bill Before Tip: $" + tipcalc.round((total)));
        System.out.println("Tip percentage: " + percentage + "%");
        System.out.println("Total Tip: $" + tipcalc.round(tipcalc.tipAmount()));
        System.out.println("Total Bill With Tip: $" + tipcalc.round(tipcalc.totalBill()));
        System.out.println("Per Person Cost Before Tip: $" + tipcalc.round(tipcalc.perPersonCostBeforeTip()));
        System.out.println("Tip Per Person: $" + tipcalc.round(tipcalc.perPersonTipAmount()));
        System.out.println("Total Cost Per Person: $" + tipcalc.round(tipcalc.perPersonTotalCost()));

    }
}
