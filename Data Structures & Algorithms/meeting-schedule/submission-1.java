/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.size() < 1) return true;
        intervals.sort((a,b) -> a.start - b.start);
        int right = intervals.get(0).end;
        for(int i = 1; i < intervals.size(); i++){
            if(right > intervals.get(i).start) return false;
            right = intervals.get(i).end;
        }
        return true;
    }
}
