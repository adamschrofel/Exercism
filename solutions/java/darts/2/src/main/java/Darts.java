class Darts {
    int score(double xOfDart, double yOfDart) {
        double dart = (Math.pow(xOfDart, 2)) + (Math.pow(yOfDart, 2));
        if (dart > 100) {
            return 0;
        }
        if (dart > 25) {
            return 1;
        }
        if (dart > 1) {
            return 5;
        }
        return 10;
    }
}
