public class CarsAssemble {
    private int production = 221;
    private double[] successRate = {1,1,1,1,1,0.9,0.9,0.9,0.9,0.8,0.77};
    public double productionRatePerHour(int speed) {
        return speed<=10?production*speed*successRate[speed]:0;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed)/60);
    }
}
