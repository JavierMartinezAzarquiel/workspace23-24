package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Factura2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldCantidad;
	private JTextField textFieldIVA;
	private JTextField textFieldTotal;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Factura2 frame = new Factura2();
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
	public Factura2() {
		setTitle("Factura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cantidad:");
		lblNewLabel.setBounds(50, 34, 63, 23);
		contentPane.add(lblNewLabel);

		textFieldCantidad = new JTextField();
		textFieldCantidad.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void removeUpdate(DocumentEvent e) {
				actualizar();
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				actualizar();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				actualizar();
			}
		});
		textFieldCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldCantidad.setBounds(125, 35, 122, 22);
		contentPane.add(textFieldCantidad);
		textFieldCantidad.setColumns(10);

		JLabel lblIva = new JLabel("IVA:");
		lblIva.setBounds(50, 123, 63, 23);
		contentPane.add(lblIva);

		textFieldIVA = new JTextField();
		textFieldIVA.setEditable(false);
		textFieldIVA.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldIVA.setColumns(10);
		textFieldIVA.setBounds(125, 124, 122, 22);
		contentPane.add(textFieldIVA);

		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setBounds(50, 174, 63, 23);
		contentPane.add(lblTotal);

		textFieldTotal = new JTextField();
		textFieldTotal.setEditable(false);
		textFieldTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldTotal.setColumns(10);
		textFieldTotal.setBounds(125, 175, 122, 22);
		contentPane.add(textFieldTotal);
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				actualizar();
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"21", "10", "4"}));
		comboBox.setBounds(142, 80, 105, 22);
		contentPane.add(comboBox);
		
		JLabel lblTipoDeIva = new JLabel("Tipo de IVA:");
		lblTipoDeIva.setBounds(50, 78, 63, 23);
		contentPane.add(lblTipoDeIva);
	}


	private void actualizar() {
			//obtener que iva debo aplicar
			int iva;
			//hablar con el comboBox para preguntar que está seleccionado
			String textoSeleccionado = (String)comboBox.getSelectedItem();
			iva = Integer.parseInt(textoSeleccionado);
			try {
				//obtener la cantidad
				double cantidad = Double.parseDouble(textFieldCantidad.getText());
				//hacer los calculos
				double ivaAPagar = cantidad * iva/100;
				double total = cantidad + ivaAPagar;
				//actualizar los campos iva y total
				DecimalFormat formato = new DecimalFormat("#,##0.00€");
				textFieldIVA.setText(formato.format(ivaAPagar));
				textFieldTotal.setText(formato.format(total));
			} catch (NumberFormatException e) {
				textFieldIVA.setText("");
				textFieldTotal.setText("");
			}
		
	}
}
