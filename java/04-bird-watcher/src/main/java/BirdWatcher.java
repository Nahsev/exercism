
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay){
            if(birds == 0){
                return true;
            }
            
        }
            
        
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
    int count = 0;
    int limit;

    if (numberOfDays > birdsPerDay.length) {
        limit = birdsPerDay.length;
    } else {
        limit = numberOfDays;
    }

    for (int i = 0; i < limit; i++) {
        count += birdsPerDay[i];
    }

    return count;
}

    public int getBusyDays() {
        int count = 0;
        for (int busy: birdsPerDay){
            if(busy>=5){
                count++;
            }
        }
        return count;
    }
    
}
