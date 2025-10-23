import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        HashSet<String> unheard = new HashSet<>();
        for (int i = 0; i < N; i++) {
            unheard.add(sc.next());
        }

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String name = sc.next();
            if (unheard.contains(name)) {
                result.add(name);
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for (String name : result) {
            System.out.println(name);
        }
    }
}
