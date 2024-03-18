package clinica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaPricipalClinica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	//Preparo un atributo lista de espera
	private ListaDeEspera listaDeEspera;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPricipalClinica frame = new VentanaPricipalClinica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPricipalClinica() {
		//Lo primero es cargar la lista de espera
		this.listaDeEspera = new ListaDeEspera(); //de momento la creo vacía
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
