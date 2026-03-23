public class CarsAssemble {
    private final int cph = 221;

    public double productionRatePerHour(int speed) {
        double productionRate = 0;
        if (speed >= 0 && speed <= 10) {
            productionRate = speed * cph;
            if (speed >= 1 && speed <= 4) {
                return productionRate;
            } else if (speed >= 5 && speed <= 8) {
                productionRate *= 0.9;
                return productionRate;
            } else if (speed == 9) {
                productionRate *= 0.8;
                return productionRate;
            } else if (speed == 10) {
                productionRate *= 0.77;
                return productionRate;
            }
        }
        return productionRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
