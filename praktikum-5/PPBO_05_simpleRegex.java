import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PPBO_simpleregex {

    public static void main(String[] args) {
        
        String vowel = "^[aeiouAEIOU]";
        String consonant = "ng$";
        Scanner userInput = new Scanner(System.in);
        String Input = userInput.nextLine();

        Pattern.compile(vowel);
        Pattern.compile(consonant);

        Pattern patternVowel = Pattern.compile(vowel);
        Pattern patternConsonant = Pattern.compile(consonant);


        Matcher matcherVowel = patternVowel.matcher(Input);
        Matcher matcherConsonant = patternConsonant.matcher(Input);
        
            if(matcherVowel.find()) {
                System.out.println("1");
            } else if(matcherConsonant.find() && !matcherVowel.find()) {
                System.out.println("2");
            } else{
                System.out.println("-1");
            }


            
        
    }
    
}
