
class BirdWatcher {
    private final int[] birdsPerDay;
    private final int[] birdsLastWeek = {0,2,5,3,7,8,4};
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsLastWeek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int day : birdsPerDay){
            if (day == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        int days = 0;
        if(numberOfDays > birdsPerDay.length){
            days = birdsPerDay.length;
        } else{
            days = numberOfDays;
        }
       for(int i = 0; i < days; i++ ){
           count += birdsPerDay[i];
       }
        return count;
    }

    public int getBusyDays() {
        int count = 0;
        for(int day: birdsPerDay){
            if(day >= 5){
                count++;
            }
        }
        return count;
    }
}
