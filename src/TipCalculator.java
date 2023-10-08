import java.util.Scanner;

public class TipCalculator {
    Scanner scan = new Scanner(System.in);

    public double total;
    private int percentage;
    private int numberOfPeople;

    public TipCalculator (int numberOfPeople, int percentage){
        this.numberOfPeople = numberOfPeople;
        this.percentage = percentage;
    }
    public double addMeal(double cost) {
        total+=cost;
        if(cost == -1){
            total++;
        }
        return cost;
    }
    public double tipAmount(){
        return total * ((double) percentage /100);
    }
    public double totalBill(){
        return total + tipAmount();
    }
    public double perPersonCostBeforeTip(){
        return total / numberOfPeople;
    }
    public double perPersonTipAmount(){
        return tipAmount() / numberOfPeople;
    }
    public double perPersonTotalCost(){
        return totalBill() / numberOfPeople;
    }
    public String round(double variable){
        variable = Math.round(variable*100);
        variable /= 100;
        if ((variable*10)%1 == 0){
            return variable + "0";
        }else{
        }
        return variable + " ";
    }

}
