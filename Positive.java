import java.util.Scanner;
class Positive{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number ");
        int num = scanner.nextInt();
	if (num > 0) {
            System.out.println(num + " is positive");
        }else if (num < 0) {
            System.out.println(num + " is negative");
        }else {
            System.out.println("The number is zero");
        }
}
}