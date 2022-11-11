//Bernie Garcia bgarcia295@toromail.csudh.edu
//HELLO? HELLO? HELLO?
import java.util.Scanner;
public class DayOfWeek
{
	public static void main(String[] args) {

		int d;

		String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

	Scanner week = new Scanner(System.in);
	System.out.println("Enter the number of the week: ");
	d = week.nextInt();
	int result = d-1;
if (d<=0||d>7)
{
System.out.println("This does not correlate to a day of the week! \nDiscontinuing program");
System.exit(0);
}
	int w=d-1;

	System.out.println("Based off the number you entered, "+d+", today is: " +day[w]);

}
}