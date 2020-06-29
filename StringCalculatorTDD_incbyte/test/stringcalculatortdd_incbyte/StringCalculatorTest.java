/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcalculatortdd_incbyte;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adwitiya
 */
public class StringCalculatorTest {
    
  @Test
  public void returnZero(){
      assertEquals(0, StringCalculator.add(""));
  }
  
  @Test
  public void returnNumber(){
      assertEquals(1, StringCalculator.add("1"));
  }
  
  @Test
  public void sumTwoNumbersDelimitedByComma(){
      assertEquals(3, StringCalculator.add("1,2"));
  }
  
  @Test
  public void sumMultipleNumbersDelimitedByComma(){
      assertEquals(6, StringCalculator.add("1,2,3"));
  }
  
  @Test
  public void handleNewLinesDelimitedByComma(){
      assertEquals(6, StringCalculator.add("1\n2,3"));
  }
  
  @Test
  public void handleMultipleDelimiters(){
      assertEquals(3, StringCalculator.add("//;\n1;2"));
  }
  
  @Test
  public void exceptionNegativeNumber(){
      try{
      StringCalculator.add("-2");
      }catch(RuntimeException e){
      assertEquals("Negatives not allowed", e.getMessage());
      }
      
  }
  
  @Test
  public void ignoreAbove1000(){
      assertEquals(2, StringCalculator.add("2,1000"));
  }
  
 }
