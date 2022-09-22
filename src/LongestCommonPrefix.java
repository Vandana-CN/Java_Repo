import java.lang.Math;

class Prefix
{
    public String longestCommonPrefix(String[] strings) {

        StringBuilder longestCommonPrefix = new StringBuilder();

        if (strings == null || strings.length == 0) {
            return longestCommonPrefix.toString();
        }

        int minLen = strings[0].length();
        System.out.println(minLen);
        for (int i = 1; i < strings.length; i++) {
            minLen = Math.min(minLen, strings[i].length());
        }

        for (int i = 0; i < minLen; i++) {

            char current = strings[0].charAt(i);
            for (String str : strings) {
                if (str.charAt(i) != current) {
                    return longestCommonPrefix.toString();
                }
            }
            longestCommonPrefix.append(current);
        }
        return longestCommonPrefix.toString();
    }
}


public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strings = {"fast", "far", "famous", "false"};
        Prefix obj = new Prefix();
        System.out.println(obj.longestCommonPrefix(strings));
    }

}
