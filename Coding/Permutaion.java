public class Permutaion {
    public static void f(String s, String ans) {
        int n = s.length();
        // Best Case
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Recursion Case

        // get choice
        for (int i = 0; i < n; i++) {
            char curr = s.charAt(i);
            f(s.substring(0, i) + s.substring(i + 1, n), ans + curr); /// jitke branch banat aahet titkanda
                                                                      // funtion call karav lagte...
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        f(s, "");
    }
}
