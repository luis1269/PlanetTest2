

public class planettest extends Speed{
	Planets solar[] = Planets.values();
	
	public enum Planets{
		MERCURY(1, 10, .33*10E24, 57.9E6, 4879), 
		VENUS(2, 20, 4.87*10E24, 108.2E6, 12104), 
		EARTH(3, 30, 5.97*10E24, 149.6E6, 12756), 
		MARS(4, 25, .642*10E24, 227.9E6, 6792), 
		JUPITER(5, 250, 142984*10E24, 778.3E6, 142984),
		SATURN(6, 160, 120536*10E24, 1427E6, 120536), 
		URANUS(7,70, 51118*10E24, 2871E6, 51118), 
		NEPTUNE(8, 80, 49528*10E24, 5913E6, 49528);
		int planetNumber;
		int planetSize;
		double planetMass;
		double distanceFromSun; //million km
		double radius;
		
		Planets(int planetNumber, int planetSize, double planetMass, double distanceFromSun, double radius){
			this.planetNumber = planetNumber;
			this.planetSize = planetSize;
			this.planetMass = planetMass;
			this.distanceFromSun = distanceFromSun;
			this.radius = radius;
		}
	} //End of enum Planets

	/*		Methods		*/
	public String getSolarSystem(int planet, int planet2) {
		
		
		String tempText = "Planet #" + solar[planet].planetNumber + " is " + solar[planet].toString() + 
					" with a size of " + (solar[planet].planetSize) + ".\n";
		tempText += "This planet has a center of gravity this is " + 
					calculateCenterOfMassTwoPlanets(solar[planet].planetMass, solar[planet2].planetMass, solar[planet].distanceFromSun, solar[planet2].distanceFromSun);
		return tempText;
	}//End of method getSolarSystem
	
	public double getRadius(int i) {
		return solar[i].radius;
	}//End of method getRadius
	
	public double getDistanceFromSun(int i) {
		return solar[i].distanceFromSun;
	}//End of method getDistanceFromSun
	
	public double getPlanetMass(int i) {
		return solar[i].planetMass;
	}//End of method getPlanetMass
	
	public double getDiameter(int i) {
		return getRadius(i)/2;
	}
	
}//End of Class planettest
