package clinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoAtender extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldNombre;

	

	/**
	 * Create the dialog.
	 */
	public DialogoAtender(JFrame padre, boolean modal) {
		super(padre, modal);
		setTitle("Atender");
		setBounds(100, 100, 450, 230);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Turno para:");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
			lblNewLabel.setBounds(41, 57, 145, 38);
			contentPanel.add(lblNewLabel);
		}
		{
			textFieldNombre = new JTextField();
			textFieldNombre.setEditable(false);
			textFieldNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
			textFieldNombre.setBounds(196, 63, 199, 31);
			contentPanel.add(textFieldNombre);
			textFieldNombre.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
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
		}
		//antes de terminar la construccion del diálogo, relleno el textfield Nombre
		rellenarNombre();
	}

	
	private void pulsadoOK() {
		this.dispose();
	}
	
	private void rellenarNombre() {
		//hablar con la ventana principal para pedirle a la lista de espera que
		//nos de el paciente a atender
		Paciente p = ((VentanaPricipalClinica)this.getParent()).getListaDeEspera().atender();
		//Poner el nombre en el textfield
		textFieldNombre.setText( p.getNombre() + " (" + p.getCompañia() + ")");
	}
}


