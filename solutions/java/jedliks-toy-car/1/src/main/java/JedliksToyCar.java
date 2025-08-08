public class JedliksToyCar {

    private int battery = 100;
    private int meters = 0;

    public JedliksToyCar() {
    }

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven "+meters+" meters";

    }

    public String batteryDisplay() {
        return battery > 0 ? "Battery at "+battery+"%" : "Battery empty";

    }

    public void drive() {
        if (battery > 0){
            meters += 20;
            battery -= 1;
        }
    }
}
