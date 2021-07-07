import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            String str1="";
            String str2="";
            String S=sc.nextLine();
            char[] arr=S.toCharArray();
            for(int j=0;j<arr.length;j=j+2){
                str1=str1+arr[j];
            }
            for(int k=1;k<arr.length;k=k+2){
                str2=str2+arr[k];
            }
            System.out.println(str1+" "+str2);
        }
    }
}
