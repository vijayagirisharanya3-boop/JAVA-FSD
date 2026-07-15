import java.util.Scanner;
class eligibilityvote {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Please enter your age:   ");
            int age = sc.nextInt();
            if(age>=18){
                System.out.println("You are eligible to vote.");
            }
            else{
                System.out.println("You are not eligible to vote.");
            }
        }
    }
}
    

