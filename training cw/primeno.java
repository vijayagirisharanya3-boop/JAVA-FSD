 import java.util.Scanner;
 class primeno {
    public static void main (String args[]){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            boolean isPrime= true;
            if(num<=1){
                isPrime = false;
            }else{
                for(int i=2;i<=num/2;i++){
                    if(num%i==0){
                        isPrime = false;
                        break;
                }
            }
        }
        System.out.println(num + " is " + (isPrime ? "a prime number" : "not a prime number"));
    }
    
}
 }
