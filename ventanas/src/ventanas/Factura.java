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

public class Factura extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldCantidad;
	private JTextField textFieldIVA;
	private JTextField textFieldTotal;
	private final ButtonGroup grupoBotonesIVA = new ButtonGroup();
	private JRadioButton rdbtn21;
	private JRadioButton rdbtn10;
	private JRadioButton rdbtn4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Factura frame = new Factura();
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
	public Factura() {
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

		rdbtn21 = new JRadioButton("21%");
		rdbtn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizar();
			}
		});
		grupoBotonesIVA.add(rdbtn21);
		rdbtn21.setSelected(true);
		rdbtn21.setBounds(125, 82, 49, 23);
		contentPane.add(rdbtn21);

		rdbtn10 = new JRadioButton("10%");
		rdbtn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizar();
			}
		});
		grupoBotonesIVA.add(rdbtn10);
		rdbtn10.setBounds(198, 82, 49, 23);
		contentPane.add(rdbtn10);

		rdbtn4 = new JRadioButton("4%");
		rdbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizar();
			}
		});
		grupoBotonesIVA.add(rdbtn4);
		rdbtn4.setBounds(278, 82, 49, 23);
		contentPane.add(rdbtn4);

		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizar();
			}
		});
		btnNewButton.setBounds(198, 227, 89, 23);
		contentPane.add(btnNewButton);
	}


	private void actualizar() {
			//obtener que iva debo aplicar
			int iva;
			if(rdbtn21.isSelected()) {
				iva = 21;
			}else if(rdbtn10.isSelected()) {
				iva = 10;
			}else {
				iva = 4;
			}
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
