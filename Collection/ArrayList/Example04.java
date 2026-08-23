import java.util.List;
import java.util.ArrayList;
public class Example04{
	public static void main(String er[]){

		//addAll(Collaction)
		//containsAll(Collection)
		//removeAll(Collction)
		//retainAll(Collection)

		List<String> KabhiKhushiKabhiGumCast1 = new ArrayList<>();
		KabhiKhushiKabhiGumCast1.add("Shahrukh Khan");
		KabhiKhushiKabhiGumCast1.add("Amitabh");
		KabhiKhushiKabhiGumCast1.add("Kajol");
		KabhiKhushiKabhiGumCast1.add("Kareena Kapoor");
		KabhiKhushiKabhiGumCast1.add("Hrutik");

		List<String> KuchKuchHotaHaiCast2=new ArrayList<>();
		KuchKuchHotaHaiCast2.add("Shaharukh Khan");
		KuchKuchHotaHaiCast2.add("Rani Kukharji");
		KuchKuchHotaHaiCast2.add("Salman Khan");
		KuchKuchHotaHaiCast2.add("kajol");

		
		KabhiKhushiKabhiGumCast1.addAll(KuchKuchHotaHaiCast2);
		System.out.println("Add All : "+KabhiKhushiKabhiGumCast1);

		KabhiKhushiKabhiGumCast1.removeAll(KuchKuchHotaHaiCast2);
		System.out.println("Add All : "+KabhiKhushiKabhiGumCast1);

		
		

	}
}