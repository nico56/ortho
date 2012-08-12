package ihm;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ortho extends JFrame{

	/**
	 * 
	 */
	public boolean modifie;
	private static final long serialVersionUID = 1L;
	static ortho o;
	JMenuBar myBar;
	JMenu menuFichier;
	JMenu menuAide;
	JMenuItem itemQuitter;
	JMenuItem itemAide;
	JButton leSMS;
	JButton Ped;
	JButton seg;
	JButton bm;
	JPanel pan;
	
	public static void main (String [] args) {
		o = new ortho();
	}
	public ortho() {
		super("Wintel");
		this.creerInterface();
		this.attacherReactions();
		this.init();
		this.setSize(800,700);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setResizable(false);
	}

	private void init() {
		pan = new JPanel();
		pan.setLayout(null);
		pan.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		leSMS =new JButton("Le SMS");
		leSMS.setBounds(100, 150, 200, 70);
		Ped =new JButton("Phrases en désordre");
		Ped.setBounds(200, 250, 200, 70);
		seg =new JButton("Les ciseaux");
		seg.setBounds(300, 350, 200, 70);
		bm =new JButton("Le bon mot");
		bm.setBounds(400, 450, 200, 70);
		pan.add(leSMS);
		pan.add(Ped);
		pan.add(seg);
		pan.add(bm);
		this.add(pan);
		
		
	}
	private void attacherReactions() {
		itemQuitter.addActionListener(new ecouteur(this,1));
		itemAide.addActionListener(new ecouteur(this, 2));
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				quitter();
			}
	});
		
	}
	public  void quitter(){
		
		int reponse = JOptionPane.showConfirmDialog(this,
			       "Voulez vous vraiment quitter l'application ?",
			       "quitter",JOptionPane.YES_NO_OPTION);
			if (reponse == 0){
				System.exit(0);
				}
	}

	private void creerInterface() {
		
		myBar = new JMenuBar();
		menuFichier = new JMenu("Fichier");
		menuAide = new JMenu("Aide");
		itemQuitter = new JMenuItem("Quitter");
		itemAide = new JMenuItem("Aide");
		
		menuFichier.add(itemQuitter);
		menuAide.add(itemAide);
		myBar.add(menuFichier);
		myBar.add(menuAide);
		this.setJMenuBar(myBar);
		
	}
}
