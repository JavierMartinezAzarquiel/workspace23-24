package dialogos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoElegirEdad extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblValor;
	private JSlider slider;

	
	/**
	 * Create the dialog.
	 */
							//añadimos al constructor, quien es su padre
	public DialogoElegirEdad(JFrame padre, boolean modal) {
		super(padre, modal); //lanzo el constructor de la superclase
		setTitle("Selecciona la edad");
		setBounds(100, 100, 343, 241);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblValor = new JLabel("0");
			lblValor.setHorizontalAlignment(SwingConstants.RIGHT);
			lblValor.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblValor.setBounds(123, 33, 64, 32);
			contentPanel.add(lblValor);
		}
		
		slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				actualizar();
			}
		});
		slider.setValue(0);
		slider.setMaximum(120);
		slider.setBounds(60, 98, 200, 26);
		contentPanel.add(slider);
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
	
	private void actualizar() {
		lblValor.setText( String.valueOf(slider.getValue()) );
	}
	
	private void pulsadoCancel() {
		//El dialogo debe desaparecer
	//	this.setVisible(false); //Esto hace que no se vea, pero sigue consumiendo recursos
		this.dispose(); //esto elimina el dialogo
	}
	
	private void pulsadoOK() {
		((Formulario2)this.getParent()).getTextFieldEdad().setText(lblValor.getText());
		//aquí termina mi trabajo
		this.dispose();
	}
}
