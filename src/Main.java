public class Main {
    public static void main(String[] args){

        //print 1-100

        for(int i=1; i<=100; i++){
            //if divisible by 3 AND 5 = "FizzBuzz"
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            // if divisible by 3 = "Fizz"
            else if(i%3==0){
                System.out.println("Fizz");
            }
            //if divisible by 5 = "Buzz"
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }

        }


    }
}
