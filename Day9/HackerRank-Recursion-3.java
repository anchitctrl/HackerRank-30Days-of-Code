import java.util.*;
class Solution{
    public int factorial(int n){
        if(n==1) return 1;
        return n*factorial(n-1);
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution Obj=new Solution();
        int result= Obj.factorial(n);
        System.out.println(result);
    }
}
