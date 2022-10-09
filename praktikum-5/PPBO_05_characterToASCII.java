import java.util.Scanner;

public class PPBO_characterAsciiPrint {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        char input1 = userInput.next().charAt(0);
        char input2 = userInput.next().charAt(0);

        int ascii1 = (int) input1;
        int ascii2 = (int) input2;

        if( ascii1 < ascii2){
            for(; ascii1 <= ascii2; ascii1++){
                System.out.print((char)ascii1);
            }
        } else{
            for(; ascii2 <= ascii1; ascii2++){
                System.out.print((char)ascii2);
            }
        }
    }
}
