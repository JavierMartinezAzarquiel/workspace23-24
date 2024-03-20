package clinica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPricipalClinica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	//Preparo un atributo lista de espera
	private ListaDeEspera listaDeEspera;
	private JLabel lblEsperando;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					VentanaPricipalClinica frame = new VentanaPricipalClinica();
					frame.setLocationRelativeTo(null);
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
		setTitle("Clinica Azarquiel");
		//Lo primero es cargar la lista de espera
		this.listaDeEspera = new ListaDeEspera(); //de momento la creo vacía
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 306);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Clínica Azarquiel");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(99, 47, 293, 43);
		contentPane.add(lblNewLabel);
		
		JButton btnNuevoPaciente = new JButton("Nuevo Paciente");
		btnNuevoPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsadoNuevoPaciente();
			}
		});
		btnNuevoPaciente.setBounds(67, 147, 107, 29);
		contentPane.add(btnNuevoPaciente);
		
		JButton btnAtender = new JButton("Atender");
		btnAtender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsadoAtender();
			}
		});
		btnAtender.setBounds(220, 150, 107, 29);
		contentPane.add(btnAtender);
		
		JLabel lblNewLabel_1 = new JLabel("Pacientes esperando: ");
		lblNewLabel_1.setBounds(128, 226, 115, 30);
		contentPane.add(lblNewLabel_1);
		
		lblEsperando = new JLabel("0");
		lblEsperando.setBounds(242, 226, 46, 30);
		contentPane.add(lblEsperando);
	}
	
	private void pulsadoNuevoPaciente() {
		DialogoNuevoPaciente dialogo = new DialogoNuevoPaciente(this, true);
		dialogo.setLocationRelativeTo(this);
		dialogo.setVisible(true);
		//cuando el dialogo termina, los siguiente será actualizar la etiqueta de pacientes esperando
		lblEsperando.setText( String.valueOf(this.listaDeEspera.size()) );
	}
	
	private void pulsadoAtender() {
		try {
			DialogoAtender dialogo = new DialogoAtender(this, true);
			dialogo.setLocationRelativeTo(this);
			dialogo.setVisible(true);
			//cuando el dialogo termina, los siguiente será actualizar la etiqueta de pacientes esperando
			lblEsperando.setText( String.valueOf(this.listaDeEspera.size()) );
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Nadie esperando", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	//Este get sirve para que los dialogos puedan acceder a la lista de espera
	public ListaDeEspera getListaDeEspera() {
		return listaDeEspera;
	}
	
}


