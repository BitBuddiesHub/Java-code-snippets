package Day_4.StepTracker;

public class StepTracker {
    private int dailyGoal;
    private int activeDays;
    private int totalSteps;
    private int totalDays;

    public StepTracker(int dailyGoal) {
        this.dailyGoal = dailyGoal;
        this.activeDays = 0;
        this.totalSteps = 0;
        this.totalDays = 0;
    }

    /**
     * Returns the number of active days.
     *
     * @return the number of active days
     */
    public int activeDays() {
        return activeDays;
    }
    
    /**
     * Calculates the average number of steps taken per day.
     *
     * @return the average number of steps taken per day, or 0.0 if no days have been tracked
     */
    public double averageSteps() {
        if (totalDays == 0) {
            return 0.0;
        } else {
            return totalSteps / totalDays;
        }
    }

    /**
     * Adds the given number of steps to the total steps taken for the day and increments the total number of days.
     * If the number of steps taken is equal to or exceeds the daily goal, increments the number of active days.
     *
     * @param  steps  the number of steps taken for the day
     */
    public void addDailySteps(int steps) {
        totalSteps += steps;
        totalDays++;
        if (steps >= dailyGoal) {
            activeDays++;
        }
    }
}
