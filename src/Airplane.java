package src;
/**
 * @author RAFAEL FERNANDES DE QUEIROZ
 * @author HAMURABI DE MEDEIROS ARAÚJO
 */

/**
 * @see Classe para representar os aviões da simulação
 */
public class Airplane {
	private boolean onAir;
	private AirTrafficController airTrafficController;

	public Airplane(AirTrafficController airTrafficController) {
		this.airTrafficController = airTrafficController;
	}

	public void askRequestForLanding() {
		this.airTrafficController.givePermissionToUseALane();
	}

	public boolean isOnAir() {
		return onAir;
	}

	public void setOnAir(boolean onAir) {
		this.onAir = onAir;
	}
	
	
}
