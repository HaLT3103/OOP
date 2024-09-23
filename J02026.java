import java.util.*;

public class J02026 {
    static int[] arr;
    static int n, k;
    static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            n = scanner.nextInt();
            k = scanner.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            backtrack(new ArrayList<>(), 0);
            for (List<Integer> list : result) {
                for(int x : list){
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            result.clear();
        }
        scanner.close();
    }

    static void backtrack(List<Integer> tempList, int start) {
        if (tempList.size() == k) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i < n; i++) {
                tempList.add(arr[i]);
                backtrack(tempList, i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
