import java.util.List;
import java.util.Arrays;
public class Say {

    String[] lista1 = {
            "zero","one","two","three","four","five","six","seven","eight","nine","ten",
            "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen",
            "eigthteen","nineteen"
        };
    String[] lista2 = {
            "twenty","thirty","forty","fifty","sixty","seventy",
            "eighty","ninety"
        };
     
    public String say(long number) {
        var result = "";
        if(number<0 || number >=1_000_000_000_000L) throw new IllegalArgumentException();
        if(number<20 && number>=0){
            result = lista1[(int) number];
        }
        if(number%10!=0&&number<100 && number>20){
            result = lista2[(int) (number/10)-2]+"-"+lista1[(int) (number % 10)];
        }
        if(number%10==0&&number<100 && number>19){
            result = lista2[(int) (number/10)-2];
        } 
        if(number >= 1_000_000_000) {
            result = addSufix(number,1_000_000_000,"billion");
        } else if(number >= 1_000_000){
            result = addSufix(number,1_000_000,"million");
        } else if(number >= 1_000) {
            result = addSufix(number,1_000,"thousand");
        } else if(number%100==0&& number >= 100){
            result = say(number/100)+" hundred";
        } else if(number >= 100){
            result = say(number/100)+" hundred "+say(number%100);
        }
        return result;
    }

    public  String addSufix(long num, int div, String sufijo){
        var a = num / div;
        var b = num % div;
        if(num%div==0){
            return say(a) + " " + sufijo;
        } else {
            return say(a) +" "+sufijo+" "+say(b);
        }
    }
}
