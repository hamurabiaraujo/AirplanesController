/**
 * @author RAFAEL FERNANDES DE QUEIROZ
 * @author HAMURABI DE MEDEIROS ARAÚJO
 */

/**
 * @see Classe para controlar a simulação do aeroporto.
 */
public class AirTrafficController {

	private Airport airport;

	public AirTrafficController(Airport airport) {
		this.airport = airport;	
	}

	public Lane givePermissionToLand() {
		this.airport.getLanes();
	}
}
