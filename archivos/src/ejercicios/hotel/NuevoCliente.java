package ejercicios.hotel;


import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevoCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField campoDni;
	private JTextField campoNombre;

	
	/**
	 * Create the dialog.
	 */
	public NuevoCliente(JFrame padre,boolean modal) {
		super(padre,modal);
		setTitle("Nuevo Cliente");
		setBounds(100, 100, 405, 273);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel();
		label.setText("Nuevo Cliente");
		label.setForeground(new Color(0, 51, 204));
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(104, 44, 121, 22);
		contentPanel.add(label);
		
		campoDni = new JTextField();
		campoDni.setBounds(104, 95, 121, 20);
		contentPanel.add(campoDni);
		
		JLabel label_1 = new JLabel();
		label_1.setText("Dni:");
		label_1.setBounds(75, 98, 19, 14);
		contentPanel.add(label_1);
		
		JLabel label_2 = new JLabel();
		label_2.setText("Nombre:");
		label_2.setBounds(53, 136, 41, 14);
		contentPanel.add(label_2);
		
		campoNombre = new JTextField();
		campoNombre.setBounds(104, 133, 239, 20);
		contentPanel.add(campoNombre);
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pulsadoCancelar();
			}
		});
		button.setText("Cancelar");
		button.setBounds(104, 171, 75, 23);
		contentPanel.add(button);
		
		JButton button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pulsadoAceptar();
			}
		});
		button_1.setText("Aceptar");
		button_1.setBounds(215, 171, 71, 23);
		contentPanel.add(button_1);
	}
	
	private void pulsadoCancelar(){
		this.dispose();
	}
	
	private void pulsadoAceptar(){
		if(campoDni.getText().length()!=0 && campoNombre.getText().length()!=0){
            Cliente cliente=new Cliente(campoDni.getText(),campoNombre.getText());
            ((VentanaHotel)(this.getParent())).getGestorClientes().add(cliente);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this,"Hay campos vacíos","Error",JOptionPane.ERROR_MESSAGE);
        }
	}
}
