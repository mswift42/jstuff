public class Diamond {
    public static String print(int n) {
        StringBuffer result = new StringBuffer();
        int asterisks = 1;
        if (n == 1) {
            return "*";
        } else if (n % 2 == 0) {
            return null;
        } else {
            for (int i = 1; i < n; i++) {
                result.append(asteriskPlusPadding(asterisks, n));
                result.append("\n");
                asterisks += 2;
            }
        }
        return result.toString();
    }
    public static String asteriskPlusPadding(int asterisks, int target) {
        String result = "";
        int padding;
        padding = (int) Math.floor(target / 2.0);
        for (int i = 0; i < padding; i++) {
            result +=" ";
        }
        for (int i = 0; i<asterisks; i++) {
            result += "*";
        }
        return result;
    }
}
