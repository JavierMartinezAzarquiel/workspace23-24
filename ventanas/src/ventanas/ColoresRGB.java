package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class ColoresRGB extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldRojo;
	private JTextField textFieldVerde;
	private JTextField textFieldAzul;
	private JSlider sliderAzul;
	private JSlider sliderVerde;
	private JSlider sliderRojo;
	private JPanel panelColor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					ColoresRGB frame = new ColoresRGB();
					frame.setLocationRelativeTo(null);//centre la ventana
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
	public ColoresRGB() {
		setTitle("Colores RGB");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelColor = new JPanel();
		panelColor.setBackground(Color.BLACK);
		panelColor.setBounds(174, 43, 144, 112);
		contentPane.add(panelColor);
		
		sliderRojo = new JSlider();
		sliderRojo.setValue(0);
		sliderRojo.setMaximum(255);
		sliderRojo.setBounds(152, 195, 200, 26);
		contentPane.add(sliderRojo);
		
		JLabel lblNewLabel = new JLabel("R");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(107, 195, 35, 26);
		contentPane.add(lblNewLabel);
		
		textFieldRojo = new JTextField();
		textFieldRojo.setEditable(false);
		textFieldRojo.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldRojo.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldRojo.setText("0");
		textFieldRojo.setBounds(364, 195, 51, 26);
		contentPane.add(textFieldRojo);
		textFieldRojo.setColumns(10);
		
		JLabel lblG = new JLabel("G");
		lblG.setForeground(Color.GREEN);
		lblG.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblG.setBounds(107, 232, 35, 26);
		contentPane.add(lblG);
		
		sliderVerde = new JSlider();
		
		sliderVerde.setValue(0);
		sliderVerde.setMaximum(255);
		sliderVerde.setBounds(152, 232, 200, 26);
		contentPane.add(sliderVerde);
		
		textFieldVerde = new JTextField();
		textFieldVerde.setEditable(false);
		textFieldVerde.setText("0");
		textFieldVerde.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldVerde.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldVerde.setColumns(10);
		textFieldVerde.setBounds(364, 232, 51, 26);
		contentPane.add(textFieldVerde);
		
		JLabel lblB = new JLabel("B");
		lblB.setForeground(Color.BLUE);
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblB.setBounds(107, 268, 35, 26);
		contentPane.add(lblB);
		
		sliderAzul = new JSlider();
		
		sliderAzul.setValue(0);
		sliderAzul.setMaximum(255);
		sliderAzul.setBounds(152, 268, 200, 26);
		contentPane.add(sliderAzul);
		
		textFieldAzul = new JTextField();
		textFieldAzul.setEditable(false);
		textFieldAzul.setText("0");
		textFieldAzul.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldAzul.setFont(new Font("Tahoma", Font.BOLD, 20));
		textFieldAzul.setColumns(10);
		textFieldAzul.setBounds(364, 268, 51, 26);
		contentPane.add(textFieldAzul);
		
		sliderRojo.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				actualizar();
			}
		});
		sliderAzul.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				actualizar();
			}
		});
		sliderVerde.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				actualizar();
			}
		});
	}
	
	private void actualizar() { //método que actualiza los valores y el color del panel
		//coger los valores de los tres colores
		int rojo = sliderRojo.getValue();
		int verde = sliderVerde.getValue();
		int azul = sliderAzul.getValue();
		
		//actualizar los campos de texto donde se muestran los valores
		textFieldRojo.setText( String.valueOf(rojo) );
		textFieldVerde.setText( String.valueOf(verde) );
		textFieldAzul.setText( String.valueOf(azul) );
		
		//cambiar el color del panel
		panelColor.setBackground( new Color(rojo,verde,azul) );
	}
}
