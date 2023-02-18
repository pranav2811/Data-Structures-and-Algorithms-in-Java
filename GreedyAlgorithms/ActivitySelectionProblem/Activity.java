package GreedyAlgorithms.ActivitySelectionProblem;

public class Activity {
    private String name;
    private int startTime;
    private int finishTime;

    public Activity(String name, int startTime, int finishTime){
        this.name = name;
        this.startTime = startTime;
        this.finishTime = finishTime;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartTime() {
        return this.startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getFinishTime() {
        return this.finishTime;
    }

    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }

    @Override
    public String toString(){
        return "Activity: "+ name + ", StartTime = "+startTime+", FinishTime = "+finishTime;
    }

    
}
