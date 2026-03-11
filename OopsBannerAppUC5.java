public class OopsBannerAppUC5 {
    public static void main(String[] args) {
        // UC5 Optimization: Combining declaration and initialization in one statement
        String[] banner = {
            String.join("", "*******"), // Line 0
            String.join("", "* *"), // Line 1
            String.join("", "* K  *"), // Line 2 (Example for 'K')
            String.join("", "* *"), // Line 3
            String.join("", "*******")  // Line 4
        };

        // Use an enhanced for-loop to print (from UC4)
        for (String line : banner) {
            System.out.println(line);
        }
    }
}