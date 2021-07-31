import java.util.*;
class Solution{
    public static int fineYear(int y1,int y2){
        if(y1<y2){
            return 0;
        }
        else return 10000;
    }
    
    public static int fineMonth(int m1,int m2){
        if(m1<m2){
            return 0;
        }
        else return 500*(m1-m2);
    }
    
    public static int fineDay(int d1,int d2){
        if(d1<d2){
            return 0;
        }
        else return 15*(d1-d2);
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int d1=sc.nextInt();
        int m1=sc.nextInt();
        int y1=sc.nextInt();
        int d2=sc.nextInt();
        int m2=sc.nextInt();
        int y2=sc.nextInt();
        int result=0;
        if(y1!=y2){
            result=fineYear(y1,y2);
        }
        else if(m1!=m2){
            result=fineMonth(m1,m2);
        }
        else if(d1!=d2){
            result=fineDay(d1,d2);
        }
        System.out.println(result);
    }
}
