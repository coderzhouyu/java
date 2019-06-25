import java.util.Scanner;
public class StringUtil{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        String res = "";
        input = input.trim();
        int start = input.indexOf(" ");

        res = res + input.substring(0,start);
        input = input.substring(start);
        input = input.trim();
        
        System.out.println(res);
    }
}