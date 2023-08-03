public class Demo4 {
    public static void main(String[] args) {
        int day = 28;
        int month = 12;
        int year = 2023;
        int hour = 23;
        int minute = 59;
        int second = 59;

        
        System.out.printf("\033[0;33m%02d" + "\033[0;0m/", month);
        System.out.printf("\033[0;31m%02d" + "\033[0;0m/", day);
        System.out.printf("\033[0;32m%04d" + " ", year);
        System.out.printf("\033[0;35m%02d" + "\033[0;0m:", hour);
        System.out.printf("\033[0;36m%02d" + "\033[0;0m:", minute);
        System.out.printf("\033[0;30m%02d%n" , second);
        
       
    }
}
