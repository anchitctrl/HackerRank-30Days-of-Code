import java.util.*;
import java.io.*;
class Solution{
    public static void main(String []argh){
        Map<String,Integer> map=new HashMap<String,Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            Integer number = map.get(s);
            System.out.println((number != null) ? s + "=" + number : "Not found");
        }
        in.close();
    }
}
