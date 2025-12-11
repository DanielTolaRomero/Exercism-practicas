class LuhnValidator {

    boolean isValid(String candidate) {
        candidate = candidate.replaceAll(" ","");
        if(candidate.trim().length()<=1 || !candidate.matches("\\d+")) return false; 
        String number = new StringBuilder(candidate)
                                 .reverse()
                                 .toString();
        int sum = 0;
        for(int i = 1; i <= number.length(); i++){
            var n = number.charAt(i-1)-'0';
            n = i%2==0?n*2:n;
            n = n>9?n%10+n/10:n;
            sum += n;
        }
        return sum%10==0;
    }

}
