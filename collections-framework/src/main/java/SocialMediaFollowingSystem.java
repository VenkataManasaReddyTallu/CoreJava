import java.util.*;

public class SocialMediaFollowingSystem {
    public static void main(String[] args) {
        Set<String> followers = new HashSet<>();
        followers.add("Alice");
        followers.add("Bob");
        followers.add("Charlie");

        Set<String> sortedFollowers = new TreeSet<>(followers);
        Iterator<String> iterator = sortedFollowers.iterator();
        while (iterator.hasNext()) {
            System.out.println("Follower: " + iterator.next());
        }
    }
}
