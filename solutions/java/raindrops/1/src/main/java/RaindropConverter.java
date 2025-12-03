class RaindropConverter {

    String convert(int number) {
        var result = "";
        var indivisible = true;
        if(number%3==0){
            result = result + "Pling";
            indivisible = false;
        }
        if(number%5==0){
            result = result + "Plang";
            indivisible = false;
        }
        if(number%7==0){
            result = result + "Plong";
            indivisible = false;
        }
        if(indivisible){
            result = result + number;
        }
        return result;
    }

}
