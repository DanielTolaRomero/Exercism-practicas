import java.util.List;
import java.util.Arrays;
class ResistorColorTrio {
    private List<String> color = List.of(
        "black", // 0
        "brown", // 1
        "red",  // 2 kilo
        "orange", // 3 
        "yellow", // 4
        "green",  // 5 mega
        "blue",  // 6 
        "violet", // 7 
        "grey",  // 8 giga
        "white" // 9 
    );
    String label(String[] colors) {
        var valor = (color.indexOf(colors[0]) * 10) + color.indexOf(colors[1]);
        var valor1 = color.indexOf(colors[2]);
        var valor2 = Math.pow(10,valor1);
        var text = "";
        if(valor1>=2 && valor1<=4){
            text = "kilo";
            valor2 /= 1000;
        }
        if(valor1>=5 && valor1<=7){
            text = "mega";
            valor2 /= 1000000;
        }
        if(valor1>= 8){
            text = "giga";
            valor2 /= 1000000000;
        }
         
        valor *= valor2;
        return valor+ " " +text+ "ohms";
    }
}
