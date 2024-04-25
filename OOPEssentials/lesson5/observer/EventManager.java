package lesson5.observer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EventManager {
    private Map<String, Set<Subscriber>> users = new HashMap<>();

    public void notify(String op, String path) {
        Set<Subscriber> subscribers = users.get(op);
        for (Subscriber subscriber : subscribers) {
            subscriber.update(path, op);
        }
    }

    public void subscribe(Subscriber subscriber, String op) {
        Set<Subscriber> prev = users.getOrDefault(op, new HashSet<>());
        prev.add(subscriber);
        users.put(op, prev);

//        users.merge(
//                op,
//                new HashSet<>(),
//                (s1, s2) -> {
//                    s1.addAll(s2);
//                    return s1;
//                }
//        );

    }
}
