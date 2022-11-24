package package1;

 import java.awt.Graphics;
 
public interface IObjetDessinable {

	void dessiner( Graphics g);

	/**
	 * Fait effectuer au visage un déplacement élementaire. La position du coin
	 * supérieur gauche du visage est modifiée en lui ajoutant le déplacement
	 * élémentaire défini par dx et dy. Si le visage dépasse de l'un des bords
	 * de la zone de dessin il inverse sa direction de déplacement.
	 */
	void deplacer();
}

