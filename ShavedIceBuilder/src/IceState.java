

public class IceState implements State{

	@Override
	public void build() {

System.out.println("Making the Ice process");
		
	}

	@Override
	public void iceShape() {

System.out.println("Build the ice with required shape ");
		
	}

	@Override
	public void addMilk() {
		 System.out.println("Add some milks in to the ice");
		
	}

	@Override
	public void change() {
		 System.out.println("Changes the ice to Icecreams ");
		
	}

	@Override
	public void freeze() {
		 System.out.println("Freez the milk mixed water   ");
		
	}

}
