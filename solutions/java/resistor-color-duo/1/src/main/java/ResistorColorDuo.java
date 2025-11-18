import java.util.Map;


class ResistorColorDuo {
    private Map<String,Integer> map = Map.of(
        "black",0,
        "brown",1,
        "red",2,
        "orange",3,
        "yellow",4,
        "green",5,
        "blue",6,
        "violet",7,
        "grey",8,
        "white",9
    );
    int value(String[] colors) {
        if (colors == null || colors.length < 2) {
            throw new IllegalArgumentException("Se requieren al menos dos colores.");
        }
        Integer valor1 = map.getOrDefault(colors[0], -1); 
        Integer valor2 = map.getOrDefault(colors[1], -1);
        
        if (valor1 == -1 || valor2 == -1) {
            throw new IllegalArgumentException("Uno o más colores no son válidos o no se encuentran en el mapa.");
        }
        return valor1*10+valor2;
    }
}
