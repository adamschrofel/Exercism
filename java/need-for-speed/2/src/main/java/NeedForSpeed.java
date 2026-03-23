class NeedForSpeed {
    private int battery = 100;
    private int speed;
    private int distance;
    private int batteryDrain;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if (battery >= batteryDrain) {
            distance += speed;
            battery -= batteryDrain;
        }

    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
    public int maxDistance(){
        int maxDrives = battery / batteryDrain;
        return maxDrives * speed;
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return car.maxDistance() >= distance;
    }
}
