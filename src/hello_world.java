import java.util.Scanner;

public class hello_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		Scanner input = new Scanner(System.in);
          System.out.println("What is your name :" );
          name = input.nextLine();
          System.out.printf("My name is :%s ", name);
          }

}
