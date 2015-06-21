/**
 * Created by severin on 21/06/15.
 */
public class Diamond {
    public static String print(int n) {
        StringBuffer result = new StringBuffer();
        if (n == 1) {
            return "*\n";
        } else if (n % 2 == 0) {
            return null;
        } else {
            int counter = 1;
            while (counter < n) {
                for (int i = 1; i<counter;i++) {
                    result.append("*");
                }
                result.append("\n");
                counter+=2;
            }
            while (counter > 1) {
                for (int i = counter; i>1;i--) {
                    result.append("*");
                }
                result.append("\n");
                counter-=2;
            }
        }
        return result.toString();
    }
}
