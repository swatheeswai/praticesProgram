import java.util.*;
class arraylist_to_array{
public static void main(String args[]){
     		ArrayList<String> cartoonList = new ArrayList<>(); 
			cartoonList.add("jerry");
			cartoonList.add("tom");
			cartoonList.add("shinchan");
			cartoonList.add("Doremon");
			cartoonList.add("pockemen");
			cartoonList.add("furkeryboys");
					System.out.println(cartoonList);


			String[] cartoonArray = cartoonList.toArray(new String[0]);
				for(String element:cartoonArray)
					System.out.println(element);
	}
}



