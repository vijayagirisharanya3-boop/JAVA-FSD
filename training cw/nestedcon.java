import java.util.Scanner;
class nestedcon {
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("enter your marks:");
            int marks=sc.nextInt();
            if(marks>=40){
                if(marks>=90){
                    System.out.println("passed with distinction");
            }
            else{
                System.out.println("passed");
            }
        }
        else{
            System.out.print("failed");
        }

        }
    }
    
}
