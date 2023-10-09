import  java.util.Scanner;

public class rollprint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your roll number: ");
        int rollNumber = scanner.nextInt();
        System.out.println("Enter Your name");
        String name = scanner.next();
        System.out.print(name);
        System.out.println();
        int modulus = rollNumber % 10;
        scanner.close();
        for (int i = 0; i < modulus; i++) {
            System.out.println("Hello, World!");
        }
    }



}
