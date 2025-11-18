import java.util.Map;

class ResistorColor {

    private Map<String,Integer> colors = Map.of(
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

    private String[] colorsName = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    int colorCode(String color) {
        return (int) colors.get(color);
    }

    String[] colors() {
        return colorsName;
    }
}
