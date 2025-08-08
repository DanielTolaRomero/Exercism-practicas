class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lasweek = new  int [] {0, 2, 5, 3, 7, 8, 4};
        return lasweek;
    }

    public int getToday() {
        int length = birdsPerDay.length;
        return birdsPerDay[length-1];        
    }

    public void incrementTodaysCount() {
        int length = birdsPerDay.length;
        birdsPerDay[length-1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if(birds == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        if (numberOfDays>birdsPerDay.length) {
            numberOfDays=7;
        }
        for(int i = 1;i<=numberOfDays; i++){
            total += birdsPerDay[i-1];
        }
        return total;
    }

    public int getBusyDays() {
        int total =0;
        for (int i : birdsPerDay) {
            if (i>=5) {
                total += 1;
            }
        }
        return total;
    }
}

