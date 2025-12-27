public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double total = 0;
        if( speed >=1 && speed <= 4){
            total = speed*221;
        } else if( speed >=5 && speed <= 8){
            total = speed*221*0.9;
        } else if( speed == 9){
            total = speed*221*0.8;
        } else if( speed == 10){
            total = speed*221*0.77;
        }
        return total;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed)/60);
    }
}
