package Arrays;

public class CharacterPattern {
    public static void charPattern(){
        char ch = 'a';
        int n = 4;
        for(int i=1;i<=n;i++){
//            char ch = 'a'; if needed OP as a,ab,abc,abcd
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
