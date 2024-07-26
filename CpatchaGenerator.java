import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;
public class CpatchaGenerator{
  /**
   * @param args
   */
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    for(int i=0;i<n;i++){
      String input=sc.nextLine();
      String []p=input.split(" ");
      String num=p[0];
      String name=p[1];
      String password=generatePassword(num,name);
      System.out.println(password); 
    }
  }
    public static String generatePassword(String number,String name){
      try {
         double num=Double.parseDouble(number);
         System.out.println(num);
      String scientificNotation=convertoSN(num);
      String s1=getp1(scientificNotation);
      String s2=getp2(scientificNotation,name);
      return s1+"@"+s2; 
      } catch (NumberFormatException e) {
        return "Invalid input";
      }
    }

    public static String convertoSN(double num) {
      BigDecimal bigDecimal = new BigDecimal(num);
      DecimalFormat decimalFormat = new DecimalFormat("0.######E0");
      System.out.println("Format String"+decimalFormat.format(num));
      return decimalFormat.format(bigDecimal);
  }
  
      public static String getp1(String scientificNotation){

        String []p=scientificNotation.split("E");
        String []p1=p[0].split("\\.");
        //int a=Integer.parseInt(p1[1]);
       // System.out.println(p1[1]+p1[0]);
       System.out.println("After ."+p1[1]);
       int sumCoefficient = 0;
        for (char digit :p1[1].toCharArray()) {
            sumCoefficient += Character.getNumericValue(digit);
        }
        System.out.println(sumCoefficient);
        int singleDigitCoefficient = sumCoefficient % 9;
        if(singleDigitCoefficient==0){
          singleDigitCoefficient=9;
        }
        int singleDigitExponent = Integer.parseInt(p[1]);
        if(scientificNotation.contains("E-"))
        {
        return getWordRepresentation(Integer.parseInt(p1[0])) + "." +getWordRepresentation(singleDigitCoefficient)+"e-"+getWordRepresentation(singleDigitExponent);
        }
        else
        return getWordRepresentation(Integer.parseInt(p1[0])) + "." +getWordRepresentation(singleDigitCoefficient)+"e+"+getWordRepresentation(singleDigitExponent);
      }
      public static String getp2(String scientificNotation,String name){
        String []p=scientificNotation.split("E");
        int digit=Integer.parseInt(p[1]);
        StringBuilder S2 = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            if ((i + 1) % 2 == digit % 2) { 
                S2.append(name.charAt(i));
            }
        }
        return S2.toString();
      }
      public static String getWordRepresentation(int digit){
        switch (digit) {
          case 0 -> {
              return "zere";
          }
          case 1 -> {
              return "one";
          }
          case 2 -> {
              return "two";
          }
          case 3 -> {
              return "thr";
          }
          case 4 -> {
              return "for";
          }
          case 5 -> {
              return "fiv";
          }
          case 6 -> {
              return "six";
          }
          case 7 -> {
              return "sev";
          }
          case 8 -> {
              return "eigh";
          }
          case 9 -> {
              return "nin";
          }
          default -> {
              return "";
          }
      }
      }

  }
