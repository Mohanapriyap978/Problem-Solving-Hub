class Solution {
    private static final int[] DAYS_IN_MONTHS={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
       int startAlice=countDays(arriveAlice);
       int endAlice=countDays(leaveAlice);
       int startBob=countDays(arriveBob);
       int endBob=countDays(leaveBob);
       int start=Math.max(startAlice,startBob);
       int end=Math.min(endAlice,endBob);
       return Math.max(0,end-start+1);
    }
    private int countDays(String date){
        int month=Integer.parseInt(date.substring(0,2));
        int day=Integer.parseInt(date.substring(3,5));
        int dayYear=day;
        for(int i=0;i<month-1;i++){
            dayYear+=DAYS_IN_MONTHS[i];
        }
        return dayYear;
    }
}
