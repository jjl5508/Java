public class Index {
    public static void main(String[] args){
        sayhello("Jonathan");
        String answer = add(2,2);
        System.out.println(answer);
    }
    
    public void sayhello(String fname) {
        System.out.println("Hello" + fname);
    }
    public String add (int num1, int num2) {
        int answer = num1 + num2;
        System.out.println(answer);
        return "I have the answer and I'm not going to tell you.";
    }
}