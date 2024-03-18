package dialogoColores;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoColores extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private final ButtonGroup buttonGroupColores = new ButtonGroup();
	private JRadioButton rdbtnNegro;
	private JRadioButton rdbtnAzul;
	private JRadioButton rdbtnVerde;
	private JRadioButton rdbtnRojo;



	/**
	 * Create the dialog.
	 */
	public DialogoColores(JFrame padre, boolean modal) {
		super(padre, modal);
		setTitle("Selecciona un color");
		setBounds(100, 100, 244, 271);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		rdbtnNegro = new JRadioButton("Negro");
		buttonGroupColores.add(rdbtnNegro);
		rdbtnNegro.setSelected(true);
		rdbtnNegro.setBounds(31, 30, 109, 23);
		contentPanel.add(rdbtnNegro);
		
		rdbtnAzul = new JRadioButton("Azul");
		buttonGroupColores.add(rdbtnAzul);
		rdbtnAzul.setBounds(31, 56, 109, 23);
		contentPanel.add(rdbtnAzul);
		
		rdbtnVerde = new JRadioButton("Verde");
		buttonGroupColores.add(rdbtnVerde);
		rdbtnVerde.setBounds(31, 82, 109, 23);
		contentPanel.add(rdbtnVerde);
		
		rdbtnRojo = new JRadioButton("Rojo");
		buttonGroupColores.add(rdbtnRojo);
		rdbtnRojo.setBounds(31, 108, 109, 23);
		contentPanel.add(rdbtnRojo);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
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
		//antes de acabar el constructor, fuerzo a que se seleccione el boton adecuado
		seleccionarColorAdecuado();
	}//Final del constructor
	
	
	private void pulsadoCancel() {
		this.dispose(); //me elimino
	}
	
	private void pulsadoOK() {
		//Averiguar cual es el color seleccionado
		Color colorSeleccionado;
		if(rdbtnNegro.isSelected()) {
			colorSeleccionado = Color.BLACK;
		}else if(rdbtnAzul.isSelected()) {
			colorSeleccionado = Color.BLUE;
		}else if(rdbtnVerde.isSelected()) {
			colorSeleccionado = Color.GREEN;
		}else {
			colorSeleccionado = Color.RED;
		}
		//Hablar con la ventana padre para cambiar el color de la etiqueta
		((VentanaColores)this.getParent()).getLblTextoPrueba().setForeground(colorSeleccionado);
		
		//desaparecer
		this.dispose();
	}
	
	private void seleccionarColorAdecuado() {
		//hablar con la ventana Principal y preguntar el color de la etiqueta
		Color colorSeleccionado = ((VentanaColores)this.getParent()).getLblTextoPrueba().getForeground();
		//seleccionar el boton adecuado
		if (colorSeleccionado == Color.BLACK) {
			rdbtnNegro.setSelected(true);
		} else if (colorSeleccionado == Color.BLUE){
			rdbtnAzul.setSelected(true);
		} else if (colorSeleccionado == Color.GREEN) {
			rdbtnVerde.setSelected(true);
		} else {
			rdbtnRojo.setSelected(true);
		}
	}
}


