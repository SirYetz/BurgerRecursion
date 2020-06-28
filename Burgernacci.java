import java.util.Scanner;

public class Burgernacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Burgernacci burgernacci = new Burgernacci();
        System.out.println("Enter the value n for which you want to create the burgernacci sequence");
        int n = scanner.nextInt();
        System.out.println(burgernacci.Burgernacci(n+1));
    }

    public String Burgernacci(int n){
        String s0 = " nothing burger";
        String s1 = " nothing burger burger";
        String[] sn = new String[n];

        if(n == 0){
            return s0;
        } else if(n == 1){
            return s1;
        } else {
            sn[0] = s0;
            sn[1] = s1;
            for(int i = 2; i < n; i++){
                sn[i] = "";
                for (int j = 0; j < i-1; j++){
                    sn[i] += sn[j];
                    sn[i] += " and";
                }
                sn[i] += sn[i-1];
                sn[i] += " burger";
            }
    }
        return sn[n-1];
    }
}