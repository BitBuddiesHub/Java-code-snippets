package Day_2.Welcome;

public class Welcome {
    /**
     * Prints a welcome message to the console, followed by a line of equal signs
     * of the same length as the message.
     *
     * @param  args  command line arguments (not used)
     */
    public static void main(String[] args) {
        String greeting = "Welcome to Jvav";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}
