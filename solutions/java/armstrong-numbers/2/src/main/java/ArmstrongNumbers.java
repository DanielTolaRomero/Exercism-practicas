class ArmstrongNumbers {

    boolean isArmstrongNumber(int num) {
        String numberString = num+"";
        int cantidad = numberString.length();
        int suma = 0;
        int number = num;
        for (int i=0;i<cantidad;i++){
            suma += Math.pow((number%10),cantidad);
            number /= 10;
        }

        return num==suma ? true:false;

    }

}
