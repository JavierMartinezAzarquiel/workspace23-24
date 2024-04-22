package agendaGraficaConArchivo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoNuevoContacto extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldNombre;
	private JTextField textFieldTelefono;


	/**
	 * Create the dialog.
	 */
	public DialogoNuevoContacto(JFrame padre, boolean modal) {
		super(padre, modal);
		setTitle("Nuevo Contacto");
		setBounds(100, 100, 308, 176);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(26, 27, 55, 14);
		contentPanel.add(lblNombre);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(90, 24, 144, 20);
		contentPanel.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JLabel lblTelfono = new JLabel("Teléfono:");
		lblTelfono.setBounds(26, 55, 55, 14);
		contentPanel.add(lblTelfono);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.setColumns(10);
		textFieldTelefono.setBounds(90, 52, 144, 20);
		contentPanel.add(textFieldTelefono);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						pulsadoOK();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						pulsadoCancelar();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	private void pulsadoCancelar() {
		this.dispose();
	}
	
	private void pulsadoOK() {
		try {
			//comprobar que los campos están completos
			if(textFieldNombre.getText().isBlank() || textFieldTelefono.getText().isBlank()) {
				JOptionPane.showMessageDialog(this, "Revisa los datos", "Error", JOptionPane.ERROR_MESSAGE);
			}else {
				//recoger los datos de los textField y crear un objeto Contacto
				Contacto nuevo = new Contacto(textFieldNombre.getText(), Long.parseLong(textFieldTelefono.getText()) );
				//Hablar con la agenda que está en la ventana padre y pedirle que añada el contacto
				((VentanaPrincipalAgenda)this.getParent()).getAgenda().add(nuevo);
				//terminar
				this.dispose();
			}
		} catch (HeadlessException e) {
			JOptionPane.showMessageDialog(this, "El dialogo es huerfano", "Error", JOptionPane.ERROR_MESSAGE);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Teléfono incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	
}
