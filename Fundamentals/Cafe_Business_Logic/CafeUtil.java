import java.util.ArrayList;
public class CafeUtil {

    public CafeUtil(){

    }
    
    public void militaryHoursTest(){
        for (int i = 0; i <24; i++) {
            System.out.println(i);

        }
    }
    public void specialsAlert(){
        for (int i = 6; i <=15; i++) {
            if (i % 3 == 0) {
                System.out.println("Buy one get one free for the next 15 minutes!");
            }
            else {
                System.out.println("Stay tuned for deals announced throughout the day.");
            }
        }
    }
    public int leadsAtDay10() {
        int sum = 0;
        for (int day = 1; day <= 10; day++) {
            sum += day;
            System.out.println(sum);
        }
    return sum;
    }
    public void displayMenu(String[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);

        }
    }
    public double getOrderTotal(double[] arr) {
        double sum = 0.0;
        // for (int price = 0; price < arr.length; price++){
        //     sum += arr[price];
        // }
        for (double eachitem : arr) {
            sum += eachitem;
        }
    return sum;
    } 
}