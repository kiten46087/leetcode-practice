import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.Set;

public class Lock {
    public int checkLock(ArrayList<Event> events) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        int count = 1;

        for (int i = 0; i < events.size(); i++) {
            Event temp = events.get(i);
            count += 1;

            // Check when releasing a empty stack.
            if (temp.event.equals("RELEASE") && stack.isEmpty()) {
                // TO DO
            } 

            if (temp.event.equals("ACQUIRE")) {
                
                if (set.contains(temp.number)) {
                    return count;
                }
                stack.push(temp.number);
            }

            if (temp.event.equals("RELEASE")) {
                if (stack.peek() != temp.number) {
                    return count;
                }
                stack.pop();
                set.remove(temp.number);
            }
        }

        if (stack.size() != 0) {
            return count;
        }

        return 0;
    }
}

class Event {
    int number;
    String event;

    Event (int lockerNumber, String event) {
        this.number = lockerNumber;
        this.event = event;
    }
}