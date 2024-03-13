package dialogos;

import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldEdad;
	private JButton btnTresPuntos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Formulario2 frame = new Formulario2();
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
	public Formulario2() {
		setTitle("Formulario ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(57, 32, 60, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(57, 72, 60, 21);
		contentPane.add(lblEdad);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(127, 32, 165, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldEdad = new JTextField();
		textFieldEdad.setEditable(false);
		textFieldEdad.setText("");
		textFieldEdad.setBounds(127, 72, 45, 20);
		contentPane.add(textFieldEdad);
		textFieldEdad.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		btnNewButton.setBounds(147, 200, 89, 23);
		contentPane.add(btnNewButton);
		
		btnTresPuntos = new JButton("...");
		btnTresPuntos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsadoTresPuntos();
			}
		});
		btnTresPuntos.setBounds(182, 71, 30, 23);
		contentPane.add(btnTresPuntos);
	}
	
	
	private void guardar() {
		
		try {
			//revisar que los datos están bien, sino tendré que avisar
			if (textFieldNombre.getText().isBlank()) {
				JOptionPane.showMessageDialog(this, "El campo nombre está vacío", "Error", JOptionPane.WARNING_MESSAGE);
			}else if (textFieldEdad.getText().isBlank()) {
				JOptionPane.showMessageDialog(this, "El campo edad está vacío", "Error", JOptionPane.WARNING_MESSAGE);
			}else if(Integer.parseInt(textFieldEdad.getText()) < 0 || Integer.parseInt(textFieldEdad.getText()) >120 ) {
				JOptionPane.showMessageDialog(this, "Revisa la edad", "Error", JOptionPane.WARNING_MESSAGE);
			}else {
				//si todos está bien, guardaré los datos en la BBDD
				JOptionPane.showMessageDialog(this, "Datos guardados", "Correcto", JOptionPane.PLAIN_MESSAGE);
			}
		} catch (HeadlessException e) {
			JOptionPane.showMessageDialog(this, "El dialogo se siente huerfano", "Error", JOptionPane.WARNING_MESSAGE);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Edad incorrecta", "Error", JOptionPane.WARNING_MESSAGE);
		}
		
		
	}
	
	private void pulsadoTresPuntos() {
		//lanzar mi dialogo para que tecleen la edad
		DialogoElegirEdad miDialogo = new DialogoElegirEdad(this, true); //creo el objeto
		miDialogo.setLocationRelativeTo(this); //que aparezca donde yo estoy
		miDialogo.setVisible(true); //que se vea
	}

	//genero el get para que el dialogo pueda tocar el campo edad
	public JTextField getTextFieldEdad() {
		return textFieldEdad;
	}
	
}
