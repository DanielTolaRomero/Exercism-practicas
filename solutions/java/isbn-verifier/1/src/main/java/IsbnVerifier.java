class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        int num = 0;
        String codigo = stringToVerify.replace("-","");
        String number;
        if ((codigo.length()>=11)||(codigo.length()<=9)||codigo.isEmpty()){
            return false;
        }
        for(int i=0;i<codigo.length();i++){
            number = (codigo.charAt(i)=='x' && i == 9) || (codigo.charAt(i)=='X' && i == 9) ? "10":codigo.charAt(i)+"";
            if (number.matches(".*[a-zA-Z].*")){
                return false;
            }
            num += Integer.valueOf(number)*(10-i);
        }
        return num % 11 == 0;
    }

}
