import java.util.*;

public class J02024 {
    static ArrayList<Integer> arr = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            n = scanner.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = scanner.nextInt();
            }
            Integer[] arrObj = Arrays.stream(A).boxed().toArray(Integer[]::new);
            Arrays.sort(arrObj, Collections.reverseOrder());
            solve(A, 0, 0);
            for (ArrayList<Integer> a : res) {
                for(int x : a){
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            arr.clear();
            res.clear();
        }
        scanner.close();
    }

    static void solve(int[] A, int idx, int sum) {
        if (sum % 2 == 1) {
            res.add(new ArrayList<>(arr));
        }
        for (int i = idx; i < n; i++) {
            arr.add(A[i]);
            solve(A, i + 1, sum + A[i]);
            arr.remove(arr.size() - 1);
        }
    }
}
