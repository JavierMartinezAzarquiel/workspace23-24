package ventanas;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CambiarColorTexto extends JFrame {

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
					CambiarColorTexto frame = new CambiarColorTexto();
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
	public CambiarColorTexto() {
		setTitle("Cambio de color de texto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAzul = new JButton("Azul");
		btnAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setForeground(Color.BLUE);
			}
		});
		btnAzul.setBounds(58, 190, 89, 23);
		contentPane.add(btnAzul);
		
		JButton btnRojo = new JButton("Rojo");
		btnRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setForeground(Color.RED);
			}
		});
		btnRojo.setBounds(170, 190, 89, 23);
		contentPane.add(btnRojo);
		
		JButton btnVerde = new JButton("Verde");
		btnVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoPrueba.setForeground(Color.GREEN);
			}
		});
		btnVerde.setBounds(282, 190, 89, 23);
		contentPane.add(btnVerde);
		
		lblTextoPrueba = new JLabel("Texto de Prueba");
		lblTextoPrueba.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTextoPrueba.setBounds(107, 46, 228, 41);
		contentPane.add(lblTextoPrueba);
	}
}
