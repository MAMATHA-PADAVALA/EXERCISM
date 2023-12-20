
class
BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {

        return birdsPerDay;

    }

    public int getToday() {

        int len=birdsPerDay.length;
        return birdsPerDay[len-1];

    }

    public void incrementTodaysCount() {

        int len=birdsPerDay.length;
        birdsPerDay[len-1]++;

    }

    public boolean hasDayWithoutBirds() {

        for(int day=0;day<birdsPerDay.length;day++){
            if(birdsPerDay[day]==0)
                return true;
        }
        return false;

    }

    public int getCountForFirstDays(int numberOfDays) {
        if(numberOfDays>birdsPerDay.length)
            numberOfDays=birdsPerDay.length;
        int count=0;
        for(int days=0;days<numberOfDays;days++){
            count+=birdsPerDay[days];
        }
        return count;

    }

    public int getBusyDays() {

        int busydays=0;
        for(int dayz=0;dayz<birdsPerDay.length;dayz++){
            if(birdsPerDay[dayz]>=5)
                busydays++;
        }
        return busydays;

    }
}
