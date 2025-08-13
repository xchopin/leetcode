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

class MeetingRoomsII {
    public int minMeetingRooms(List<Interval> intervals) {
        PriorityQueue<Integer> rooms = new PriorityQueue<>();
        intervals.sort(Comparator.comparing(a -> a.start));
        int counter = 0;

        for (Interval i : intervals) {
            if (rooms.isEmpty()) {
                counter++;
                rooms.add(i.end);
            } else {
                int previousMeeting = rooms.peek();
                int startCurrentMeeting = i.start;

                if (startCurrentMeeting >= previousMeeting && !rooms.isEmpty()) {
                    previousMeeting = rooms.poll();
                    counter--;
                }
                    
                rooms.add(i.end);
                counter++;
            
            }
        }

        return counter;
    }
}
