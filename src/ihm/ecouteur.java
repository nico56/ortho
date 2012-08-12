
package ihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ecouteur implements ActionListener {
	
	//atributs
	
	private ortho o;
	private int nb;
	
	public ecouteur(ortho theO, int i) {
		this.o=theO;
		nb=i;
	}
	public void actionPerformed(ActionEvent e){
			if (nb==1){
				o.quitter();
			}
			else if (nb==2){
				new aide();
			}
	}
}