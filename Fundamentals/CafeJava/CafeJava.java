public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripcoffeePrice = 4.0;
        double lattePrice = 3.8;
        double cappucinoPrice = 3.6;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(customer1 + pendingMessage);
        System.out.println(customer4 + pendingMessage);
        System.out.println(pendingMessage + " " + customer4);
        // System.out.println (displayTotalMessage +  int 7.6);
        // System.out.println(pendingMessage + customer2);
        System.out.println (displayTotalMessage + (lattePrice * 2));
        // System.out.println(displayTotalMessage + int 0.2);
        System.out.println(displayTotalMessage + (dripcoffeePrice - lattePrice));

    	// ** Your customer interaction print statements will go here ** //
    }
}
