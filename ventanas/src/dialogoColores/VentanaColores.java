package dialogoColores;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class VentanaColores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTextoPrueba;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					VentanaColores frame = new VentanaColores();
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
	public VentanaColores() {
		setTitle("Ventana Colores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTextoPrueba = new JLabel("Texto de Prueba");
		lblTextoPrueba.setForeground(Color.BLACK);
		lblTextoPrueba.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblTextoPrueba.setBounds(80, 61, 272, 47);
		contentPane.add(lblTextoPrueba);
		
		JButton btnCambiarColor = new JButton("Cambiar Color");
		btnCambiarColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsadoBotonCambio();
			}
		});
		btnCambiarColor.setBounds(158, 186, 111, 30);
		contentPane.add(btnCambiarColor);
	}
	
	//Evento pulsar boton Cambiar de color
	private void pulsadoBotonCambio() {
		DialogoColores miDialogo = new DialogoColores(this, true);
		miDialogo.setLocationRelativeTo(this);
	    miDialogo.setVisible(true);
	}

	public JLabel getLblTextoPrueba() {
		return lblTextoPrueba;
	}
	
	
	
}


