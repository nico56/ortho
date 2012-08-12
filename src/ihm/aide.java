package ihm;

import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class aide extends JFrame{

	/**
	 * 
	 */
	public boolean modifie;
	private static final long serialVersionUID = 1L;
	static aide a;
	JMenuBar myBar;
	JMenu menuFichier;
	JMenu menuAide;
	JMenuItem itemQuitter;
	JMenuItem itemAide;
	JTextArea texte2;
	JPanel pan;
	
	public aide() {
		super("Aide");
		this.creerInterface();
		this.attacherReactions();
		this.init();
		this.setSize(500,500);
		this.setLocationRelativeTo(this.getParent());
		this.setVisible(true);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setResizable(false);
	}

	private void init() {
		pan = new JPanel();
		pan.setLayout( new GridLayout(0,1));
		pan.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		texte2 = new JTextArea("ceci est l'aide");
		pan.add(texte2);
		this.add(pan);
		
	}
	private void attacherReactions() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				quitter();
			}
		}
	);	
	}
	public void quitter(){
		
		this.setVisible(false);
	}

	private void creerInterface() {
		
		
		
	}
}