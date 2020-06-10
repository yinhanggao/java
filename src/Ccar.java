
public class Ccar {

	public double gas, tbo;

	public double max_dist;

	public void MaxDist() {

		max_dist = gas * tbo;

	}

	public double Dist(double oil) {

		return oil * tbo;

	}

}
