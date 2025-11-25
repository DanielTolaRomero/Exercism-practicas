public class EliudsEggs {
    public int eggCount(int number) {
        var result = 0;        
        while(number>1){
            if(number%2==1){
                result ++;
            }
            number/=2;
        }
        if(number == 1){
            result++;
        }
        return result;
        
    }
}
