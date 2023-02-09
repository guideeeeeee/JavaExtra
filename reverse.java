public class reverse {
    public static void main(String[]args) {
        String x = "hello world";
        for (int i = 11;i>=1;i--){
            String subl =x.substring(i-1,i);
            System.out.print(subl);
        }
    }
}
