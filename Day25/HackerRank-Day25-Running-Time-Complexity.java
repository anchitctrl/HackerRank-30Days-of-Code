import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        boolean b;
        while(T-- >0){
            b=true;
            int n=sc.nextInt();
            if(n==1){
                System.out.println("Not prime");
                continue;
            }
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    System.out.println("Not prime");
                    b=false;
                    break;
                }
            }
            if(b){
                System.out.println("Prime");
            }
        }
    }
}



