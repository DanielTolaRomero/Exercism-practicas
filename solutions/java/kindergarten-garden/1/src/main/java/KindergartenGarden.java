import java.util.List;
import java.util.Arrays;

class KindergartenGarden {

    private String[] garden;
    private List<String> kids = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry");
    KindergartenGarden(String garden) {
        this.garden = garden.split("\n");
    }

    List<Plant> getPlantsOfStudent(String student) {
        var position = kids.indexOf(student);
        List<Plant> plants = List.of(
            Plant.getPlant(garden[0].charAt(position*2)),
            Plant.getPlant(garden[0].charAt(position*2+1)),
            Plant.getPlant(garden[1].charAt(position*2)),
            Plant.getPlant(garden[1].charAt(position*2+1))
        );
        return plants;
    }

}
