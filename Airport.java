import java.util.List;
import java.util.ArrayList;
/**
 * @author RAFAEL FERNANDES DE QUEIROZ
 * @author HAMURABI DE MEDEIROS ARAÚJO
 */

/**
 * @see Classe para representar o aeroporto
 */
public class Airport {

	private String name;
	private List<Lane> lanes;
	
	/**
	 * @param name String - Nome do aeroporto
	 * @param qtdOfLanes int - Quantidade de pistas
	 */
	public Airport(String name, int qtdOfLanes) {
		this.name = name;
		this.qttOfLanes = qttOfLanes;
		lanes = new ArrayList<Lane>();
		for (int i=0;i<qtdOfLanes;i++) {
			lanes.add(new Lane());
		}
	}

	public List<Lane> getLanes() {
		return this.lanes;
	}

}
