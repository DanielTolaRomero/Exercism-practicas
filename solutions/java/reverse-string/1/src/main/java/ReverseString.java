class ReverseString {

    String reverse(String inputString) {
        char[] nuevaCadena = inputString.toCharArray();
        String cadenaInvertida = "";
        for(int i = 1;i<=nuevaCadena.length;i++){
            char c = nuevaCadena[nuevaCadena.length-i];
            cadenaInvertida = cadenaInvertida + c;
        }
        return cadenaInvertida;
    }
  
}
