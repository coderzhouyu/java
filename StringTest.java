public class StringTest{
    public static void main(String[] args){
        String s0 = "abc";

        String s1 = new String("aaa");

        System.out.println(s0.length());


        String s00 = "Abc";

        System.out.println(s00.equals(s0));

        System.out.println(s00.equalsIgnoreCase(s0));

        System.out.println(s0 == s00);

        String c = s0 + s00;
        String d = s0.concat(s00);

        System.out.println(c);
        System.out.println(d);

        System.out.println(s0.charAt(0));
    }
}