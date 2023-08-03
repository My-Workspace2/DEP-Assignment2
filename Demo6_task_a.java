public class Demo6_task_a {
    public static void main(String[] args) 
    {
    
       
        /* Set Colors as constants */
        final String cRed = "\u001B[41m";
        final String cGreen = "\u001B[42m";
        final String cReset = "\u001B[0m";

        /*Text to be highlighted */
        String text1= "[      5" ;
        String text2 = "0%     ]";

        
        System.out.printf("%s%s%s%s%s\n", cRed, text1, cGreen, text2, cReset);
        
    }
    
}
