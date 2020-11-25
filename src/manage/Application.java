package manage;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			List <Maruti> maruti =new ArrayList<>();
			
		maruti.add(new Maruti("alto", "Whitw", "India", 20000));
		maruti.add(new Maruti("wagnar", "black", "India", 27000));
		maruti.add(new Maruti("breazzera", "blue", "India", 100000));
		maruti.add(new Maruti("suzuki", "black", "India", 500000));
			
		List <Honda> honda =new ArrayList<>();
		
		honda.add(new Honda("city", "Whitw", "India", 20000));
		honda.add(new Honda("swift", "black", "India", 27000));
		honda.add(new Honda("baleno", "blue", "India", 100000));
		honda.add(new Honda("venue", "black", "India", 500000));
		
		display(maruti);
		display(honda);
	
	}
	
	static <E> void display(List<E> list)
	{
		for(E  mar:list)
		{
			System.out.println(mar);
		}
		
	}

}
