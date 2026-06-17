import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("$ ");
        String a=sc.next();
        System.err.print(a+": command not found");
    }
}
