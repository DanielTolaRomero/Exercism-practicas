class PrimeCalculator {

    int nth(int nth) {
        if(nth<=0) throw new IllegalArgumentException();
        int count = 0;
        int n = 1;
        while(true){
            if(esPrimo(n)){
                count++;
                if(count==nth) return n;
            }
            n++;
        }
    }
    boolean esPrimo(int num){
        if(num<=1) return false;
        if(num==2) return true;
        
        if(num%2==0) return false;
        
        int limite = (int) Math.sqrt(num);
        
        for(int i = 3; i<=limite; i+=2){
            if(num%i==0) return false;
        }
        return true;
    }

}
