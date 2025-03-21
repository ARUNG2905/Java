import java.util.Scanner;

public class SpecialCharcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        char[] ch=s.toCharArray();
        int count =0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>31 && ch[i]<47||ch[i]>57 && ch[i]<65||ch[i]>90 && ch[i]<97||ch[i]>122&&ch[i]<127){
                count++;
                System.out.println(ch[i]);
            }
        }
        System.out.println(count);
        sc.close();
    }
}

