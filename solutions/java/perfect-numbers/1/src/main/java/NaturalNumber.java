import java.util.ArrayList;
import java.util.List;

class NaturalNumber {
    private int number;
    NaturalNumber(int number) {
        if(number==0||number<0){
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number = number;
    }

    Classification getClassification() {
        if(number==1){
            return Classification.DEFICIENT; 
        }
        List<Integer> lista = new ArrayList<>();
        for(int i = (int) Math.sqrt(number);i>=1;i--){
            if(i==1){
                lista.add(1);
            } else if(number%i==0){
                lista.add(i);
                var num = number/i;
                if(num != number/num){
                    lista.add(number/i);    
                }
            }
        }
        var valor = lista.stream().reduce(0,(a,b)-> a+b);
        if(valor==number){
            return Classification.PERFECT;
        } else if(valor>number){
            return Classification.ABUNDANT;
        } else if(valor<number){
            return Classification.DEFICIENT;
        }
        return  Classification.DEFICIENT;
    }
}
