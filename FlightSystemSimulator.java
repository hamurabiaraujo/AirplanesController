public class FlightSystemSimulator {

	public static void main(String[] args) {
		Airport airport = new Airport("Aeroporto Internacional Rio Potengi", 2);
		AirTrafficController controller = new AirTrafficController(airport);
		System.out.println("HAMURABI EH GAY!");
	}
}