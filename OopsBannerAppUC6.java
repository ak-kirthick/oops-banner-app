public class OopsBannerAppUC6 {
    public static void main(String[] args) {
        // Now we can pass any name we want into the method
        renderBanner("KIRTHICK");
    }

    // UC6 Goal: Create a reusable method that takes a String parameter
    public static void renderBanner(String name) {
        // We use the parameter 'name' inside our array initialization
        String[] banner = {
            "*****************",
            "* *",
            "* " + name + "    *",
            "* *",
            "*****************"
        };

        // Enhanced for-loop for clean output traversal
        for (String line : banner) {
            System.out.println(line);
        }
    }
}