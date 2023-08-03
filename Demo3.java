public class Demo3 {
    public static void main(String[] args) {
        int areaCode = 123;
        int firstPart = 456;
        int secondPart = 7890;

        System.out.print("\033[0;32m"); 
        System.out.printf("(%03d) ", areaCode);
        System.out.print("\033[0m"); 
        System.out.printf("%03d-%04d%n", firstPart, secondPart);


    }
}
