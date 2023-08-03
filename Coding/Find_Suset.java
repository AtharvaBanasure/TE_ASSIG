import java.util.*;

public class Find_Suset {
    public static void f(int idx, String s, String ans) {
        int n = s.length();
        // Bestcase
        if (idx == s.length()) {
            System.out.println(ans);
            return;
        }

        // Recursion case

        // Choice is YES
        f(idx + 1, s, ans + s.charAt(idx));

        // Choice is NO
        f(idx + 1, s, ans);

    }

    public static void main(String[] args) {
        String s = "abc";
        f(0, s, "");
    }
}
