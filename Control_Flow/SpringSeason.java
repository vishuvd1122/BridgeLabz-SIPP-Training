public class SpringSeason {
    public static void main(String[] args) {
        // Ensure exactly two command-line arguments are passed
        if (args.length != 2) {
            System.out.println("Please provide exactly two arguments: month and day.");
            return;
        }

        // Parse command-line arguments to integers
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the date is in the Spring season (March 20 to June 20)
        boolean isSpring = 
            (month == 3 && day >= 20) ||    // March 20–31
            (month == 4) ||                 // All of April
            (month == 5) ||                 // All of May
            (month == 6 && day <= 20);      // June 1–20

        // Print result based on the condition
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
