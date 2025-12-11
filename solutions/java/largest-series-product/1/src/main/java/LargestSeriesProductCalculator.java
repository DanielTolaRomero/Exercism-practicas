class LargestSeriesProductCalculator {
    private String inputNumber;
    LargestSeriesProductCalculator(String inputNumber) {  
        if(inputNumber.matches(".*\\D+.*")) {
            throw new IllegalArgumentException("String to search may only contain digits.");
        }
        this.inputNumber = inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        long result = 0;
        if(numberOfDigits<=0 ) {
            throw new IllegalArgumentException("Series length must be non-negative.");
        }
        if(inputNumber.length()<numberOfDigits || inputNumber.equals("")){
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        } 
        
        if(inputNumber.length()==numberOfDigits){
            return inputNumber.chars().mapToLong(c -> c-'0').reduce(1L,(a,b)->a*b);
        } 
        for(int i=0; i<inputNumber.length()+1-numberOfDigits;i++){
            String serie = inputNumber.substring(i,(i+numberOfDigits));
            long number = serie.chars().mapToLong(c -> c-'0').reduce(1L,(a,b)->a*b);
            result = number>result? number : result;
        }
        return result;
        
    }
}
