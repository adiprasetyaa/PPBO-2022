import java.util.Scanner;

public class PPBO_stringmethod {
    public static void main(String args[] ) throws Exception {
        try (Scanner userInput = new Scanner(System.in)) {
            String name = userInput.nextLine();
            
            int size = name.length();
            System.out.println(size);
            for(int i = 0; i < size; i++){
                if(i%3 == 0){
                    System.out.print(name.charAt(i));
                }
            }
        }
    }
}
