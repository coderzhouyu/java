public class ArrayTest{
    public static void main(String[] args){
        String[][] name = {
            {"z","2"},
            {"a","b"}
            };

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(name[i][j]);
            }
        }
    }
}