public class Main {
    
    public static void main(String[] args) {
        System.out.println("test");
        System.out.println("testing branches");
        System.out.println("new feature:");
        System.out.println(AddStrings("apple ", "and bananas"));
        System.out.println(AddTwo(2, 3));
    }


    public static String AddStrings(String str1, String str2) {
        return str1 + str2;
    }

    public static int AddTwo(int num1, int num2) {
        return num1 + num2;
    }

}