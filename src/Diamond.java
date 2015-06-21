public class Diamond {
    public static String print(int n) {
    }
    public String asteriskPlusPadding(int asteriks, int target) {
        String result = "";
        int padding;
        padding = (int) Math.floor(target / 2.0);
        for (int i = 0; i < padding; i++) {
            result +=" ";
        }
        for (int i = 0; i<asteriks; i++) {
            result += "*";
        }
        return result;
    }
}
