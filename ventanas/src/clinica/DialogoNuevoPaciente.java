package clinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

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

public class DialogoNuevoPaciente extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldDni;
	private JTextField textFieldNombre;
	private JTextField textFieldCompania;

	

	/**
	 * Create the dialog.
	 */
	public DialogoNuevoPaciente(JFrame padre, boolean modal) {
		super(padre, modal); //lanzamos el constructor de la superclase
		
		setTitle("Nuevo Paciente");
		setBounds(100, 100, 245, 246);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Dni:");
			lblNewLabel.setBounds(23, 39, 46, 14);
			contentPanel.add(lblNewLabel);
		}
		
		textFieldDni = new JTextField();
		textFieldDni.setBounds(79, 36, 115, 20);
		contentPanel.add(textFieldDni);
		textFieldDni.setColumns(10);
		{
			textFieldNombre = new JTextField();
			textFieldNombre.setColumns(10);
			textFieldNombre.setBounds(79, 64, 115, 20);
			contentPanel.add(textFieldNombre);
		}
		{
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setBounds(23, 67, 46, 14);
			contentPanel.add(lblNombre);
		}
		{
			textFieldCompania = new JTextField();
			textFieldCompania.setColumns(10);
			textFieldCompania.setBounds(79, 95, 115, 20);
			contentPanel.add(textFieldCompania);
		}
		{
			JLabel lblCompaa = new JLabel("Compañía:");
			lblCompaa.setBounds(23, 98, 59, 14);
			contentPanel.add(lblCompaa);
		}
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
						pulsadoCancel();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	private void pulsadoCancel() {
		this.dispose();
	}
	
	private void pulsadoOK() {
		//comprobación de que tengo todos los datos
		if (textFieldDni.getText().isBlank() || textFieldNombre.getText().isBlank() || textFieldCompania.getText().isBlank()) {
			JOptionPane.showMessageDialog(this, "Revisa los datos", "Error",JOptionPane.ERROR_MESSAGE);
		} else {
			//crear un objeto Paciente con los tres datos que han escrito
			Paciente nuevo = new Paciente(textFieldDni.getText(), textFieldNombre.getText(), textFieldCompania.getText());
			//voy a la ventana principal y guardo el paciente en la lista de espera
			((VentanaPricipalClinica)this.getParent()).getListaDeEspera().add(nuevo);
			//desaparecer
			this.dispose();
		}
		
	}
}


