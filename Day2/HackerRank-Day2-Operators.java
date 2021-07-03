import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float meal_cost=sc.nextFloat();
        float tip_percent=sc.nextFloat();
        float tax_percent=sc.nextFloat();
        float tip=(tip_percent/100)*meal_cost;
        float tax=(tax_percent/100)*meal_cost;
        float total=meal_cost+tip+tax;
        System.out.println(Math.round(total));   
    }
}
