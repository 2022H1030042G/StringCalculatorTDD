/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcalculatortdd_incbyte;
//random 
/**
 *
 * @author adwitiya
 */
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ch.lambdaj.function.convert.Converter;
import static ch.lambdaj.Lambda.*;
import java.util.stream.Stream;
import java.util.Arrays;
import static org.hamcrest.Matchers.*;

public class StringCalculator {
    
    public static int add(String text){
        int s=0, s2=0;String delimiter = ",|\n";
        if(text.isEmpty())
            return 0;
        if(text.contains("-")){
            throw new RuntimeException("Negatives not allowed");
        }
       //text.contains(text);
         if(text.startsWith("//")){
            String[] parts = text.split("\n", 2);
            String header = parts[0];
            delimiter = parts[0].substring(2);
            text = parts[1];
            
            }
        
            String[] num = text.split(delimiter);
            for(int x=0;x<num.length;x++){
                s+= Integer.parseInt(num[x]);
            }
            if(s>1000)
           return s%1000;
            else
                return s;
            
    }
}
