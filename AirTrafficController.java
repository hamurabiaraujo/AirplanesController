import java.util.List;
import java.util.ArrayList;
/**
 * @author RAFAEL FERNANDES DE QUEIROZ
 * @author HAMURABI DE MEDEIROS ARAÚJO
 */

/**
 * @see Classe para controlar a simulação do aeroporto.
 */
public class AirTrafficController {

	private Airport airport;
	private List<Airplane> airplanes;

	public AirTrafficController(Airport airport) {
		this.airport = airport;
		this.airplanes = new ArrayList<Airplane>();
		for (int i=0;i<3;i++) {
			airplanes.add(new Airplane(this));
		}
	}

	public Lane givePermissionToLand() {
		this.airport.getLanes();
	}
}
