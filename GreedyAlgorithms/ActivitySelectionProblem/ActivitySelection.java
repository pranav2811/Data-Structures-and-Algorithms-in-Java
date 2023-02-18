package GreedyAlgorithms.ActivitySelectionProblem;
//time complexity is O(nlogn)
//space complexity is o(1)
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySelection {
    
    static void activitySelection(ArrayList<Activity> activityList){
        Comparator<Activity> finishTimeComparator = new Comparator<Activity>() {
            @Override
            public int compare(Activity o1, Activity o2){
                return o1.getFinishTime() - o2.getFinishTime();
            }
        };
        //based on the finishtimeComparator we are going to sort the activities inside the acitivty list we created 
        Collections.sort(activityList,finishTimeComparator);
        Activity previousActivity = activityList.get(0);

        System.out.println("\n\nReccomended Schedue:\n"+activityList.get(0));

        for(int i = 1; i < activityList.size();i++){
            Activity activity = activityList.get(i);
            if(activity.getStartTime() >= previousActivity.getFinishTime()){
                System.out.println(activity);
                previousActivity = activity;
            }
        }
    }
}
