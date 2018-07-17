

public class CenterOfGravity {

	public double calculateCenterOfMassTwoPlanets(double planet1Mass, double planet2Mass, 
			double planet1x, double planet2x) {
		return ((planet1Mass * planet1x)+(planet2Mass * planet2x))/(planet1Mass + planet2Mass);
	}
}
