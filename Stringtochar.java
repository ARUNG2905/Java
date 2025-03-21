public class Stringtochar {
    public static void main(String[] args) {
        String s1 ="aabbcc";
        char[] ch=s1.toCharArray();
        for (int i = 1; i < ch.length; i++) {
            
                if(ch[i]==ch[i-1]){
                    ch[i-1]=ch[i];
                    ch[i]='0';
                }
                if(ch[i]!=0){
                    ch[i]=ch[i];
                }

            
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(ch[i]);
        }
    }
}
