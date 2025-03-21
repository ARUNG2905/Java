import java.util.Scanner;

public class Frequencyofstring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        frequency(s);
        sc.close();
    
        
        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        
        // int count = 0;
        
        //     for (int j = 0; j < s.length(); j++) {
        //         if (s.charAt(j) == ch) {
        //             count++;
        //         }
               
        //     }
        //     System.out.println(count+" "+s.charAt(i));
            
        // }
    }
        public static int[] frequency(String s){
        int[] count = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            count[c]++;
        }
        for (int i = 0; i <count.length; i++) {
            if(count[i]!=0){
                System.out.println((char)i+"  "+count[i]);
            }
        }
        return count;
    }
        
    }
    

