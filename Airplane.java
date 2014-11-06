/**
 * @author RAFAEL FERNANDES DE QUEIROZ
 * @author HAMURABI DE MEDEIROS ARAÚJO
 */

/**
 * @see Classe para representar os aviões da simulação
 */
public class Airplane {

	private AirTrafficController airTrafficController;

	public Airplane(AirTrafficController airTrafficController) {
		this.airTrafficController = airTrafficController;
	}

	public void askRequestForLanding() {
		this.airTrafficController.givePermissionToLand();
	}
}
