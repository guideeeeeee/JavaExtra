import java.util.Scanner;
public class split {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter string:");
        String st = sn.nextLine();
        int stlength = st.length();
        int i;
        for (i = 0;i< stlength;i++){
            System.out.print(st.substring(i,i+1)+" ");
        } 
    }
}
