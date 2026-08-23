package pkg;
//import com.mylib.Booking;
import com.mylib.Booking;

//import static com.mylib.MathUtils.com /
public class Main{
	public static void main(String[] args) {
	
	Booking b1 = new Booking(111,2,10000,"ThirdAc","Pune");



	b1.ticketConfirmation();
	System.out.printf("% -15s : %d%n","Total Price",Booking.totalPrice());
	}
}