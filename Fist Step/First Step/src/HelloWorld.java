public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello, Alex");

        int myFirstNumber = 10 + 5; //declaration statement
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int sum = myFirstNumber + mySecondNumber + myThirdNumber;
        String myFirstName = "Alex";

        System.out.println("Sum :" + sum + "-" + myFirstNumber + ":" + myFirstName ); // + can be used to concat string

        int myLastNumber = 1000 - sum;
        System.out.println("Last Number:" + myLastNumber);
    }
}
