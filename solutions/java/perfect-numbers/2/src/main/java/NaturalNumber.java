import java.util.ArrayList;
import java.util.List;

class NaturalNumber {
    private int number;
    NaturalNumber(int number) {
        if(number<1){
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number = number;
    }

    Classification getClassification() {
        List<Integer> lista = new ArrayList<>();
        for(int i = (int) Math.sqrt(number);i>=1;i--){
            if(i==1){
                lista.add(1);
            } else if(number%i==0){
                lista.add(i);
                var num = number/i;
                if(i != num){
                    lista.add(num);    
                }
            }
        }
        var valor = lista.stream().reduce(0,(a,b)-> a+b);
        if(valor<number||number==1){
            return Classification.DEFICIENT;
        } else if(valor>number){
            return Classification.ABUNDANT;
        } else {
            return Classification.PERFECT;
        } 
    }
}
