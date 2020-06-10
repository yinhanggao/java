
public class BuildObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ccar car1 , car2;

		car1 = new Ccar();
		
		car2 = new Ccar();
		
		car1.gas = 40.7;
		car2.gas = 70.4;
		
		car1.tbo = 11.2;
		car2.tbo = 9.3;
		
		car1.MaxDist();
		car2.MaxDist();
		
		
		System.out.print(car1.max_dist + " " +car2.max_dist);
		
	}

}
