package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import dao.DAOGrupos;
import dao.DAOProductos;
import entidades.Grupo;
import entidades.Producto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaFruteria extends JFrame {

	//Preparar dos DAOs para Productos y Grupos
	private DAOGrupos daog = new DAOGrupos();
	private DAOProductos daop = new DAOProductos();
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField textFieldIdProducto;
	private JTextField textFieldNombre;
	private JTextField textFieldPrecio;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					VentanaFruteria frame = new VentanaFruteria();
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
	public VentanaFruteria() {
		setTitle("Frutería Azarquiel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gestión Frutería");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(174, 57, 286, 25);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(68, 105, 412, 163);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				pulsadoSobreTabla();
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"IdProducto", "Nombre", "Grupo", "Precio"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(171);
		table.getColumnModel().getColumn(2).setPreferredWidth(141);
		scrollPane.setViewportView(table);
		
		lblNewLabel_1 = new JLabel("IdProducto:");
		lblNewLabel_1.setBounds(68, 304, 70, 19);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setBounds(68, 329, 70, 19);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Grupo:");
		lblNewLabel_3.setBounds(69, 352, 70, 19);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Precio:");
		lblNewLabel_4.setBounds(69, 378, 70, 19);
		contentPane.add(lblNewLabel_4);
		
		textFieldIdProducto = new JTextField();
		textFieldIdProducto.setEditable(false);
		textFieldIdProducto.setBounds(135, 303, 58, 20);
		contentPane.add(textFieldIdProducto);
		textFieldIdProducto.setColumns(10);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(136, 328, 122, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setBounds(136, 377, 86, 20);
		contentPane.add(textFieldPrecio);
		textFieldPrecio.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setBounds(136, 350, 122, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Modificar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsadoModificar();
			}
		});
		btnNewButton.setBounds(301, 337, 89, 23);
		contentPane.add(btnNewButton);
		//antes de terminar el constructor de la ventana, cargamos los datos en la tabla
		cargarTabla();
	}
	
	
	
	//Cargamos los objetos producto en la tabla
	private void cargarTabla() {
		//Obtener los objetos
		ArrayList<Producto> listaProductos = daop.get();
		//Preparar un array bidimensional
		Object[][] datos = new Object[listaProductos.size()][4];
		//rellenar el array
		for (int i = 0; i < datos.length; i++) {
			datos[i][0] = listaProductos.get(i).getIdProducto();
			datos[i][1] = listaProductos.get(i).getNomProducto();
			datos[i][2] = daog.get(listaProductos.get(i).getIdGrupo()).getNomGrupo();
			DecimalFormat formato = new DecimalFormat("#0.00€");
			datos[i][3] = formato.format(listaProductos.get(i).getPrecio());
		}
		//visualizar los datos
		table.setModel(new DefaultTableModel(
				datos,
				new String[] {
					"IdProducto", "Nombre", "Grupo", "Precio"
				}
			) {
				Class[] columnTypes = new Class[] {
					Integer.class, String.class, String.class, String.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
			});
		table.getColumnModel().getColumn(1).setPreferredWidth(171);
		table.getColumnModel().getColumn(2).setPreferredWidth(141);
		//Para alinear a la derecha la columna de precio
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
		table.getColumnModel().getColumn(3).setCellRenderer(dtcr);
	}
	
	private void pulsadoSobreTabla() {
		//buscar el producto que está seleccionado
		Producto p = daop.get( (Integer) table.getValueAt(table.getSelectedRow(),0)  );
		
		//rellenar los datos en cada campo
		textFieldIdProducto.setText( String.valueOf(p.getIdProducto()) );
		textFieldNombre.setText(p.getNomProducto());
		textFieldPrecio.setText( String.valueOf(p.getPrecio()) );
		//seleccionar en el comboBox, el grupo adecuado
		cargarComboBox();
//		comboBox.setSelectedItem( table.getValueAt(table.getSelectedRow(),2) );
		comboBox.setSelectedItem( daog.get(p.getIdGrupo()).getNomGrupo());
	}
	
	private void cargarComboBox() {
		//obtener todos los grupos
		ArrayList<Grupo> listaGrupos = daog.get();
		//limpiar el comboBox
		comboBox.removeAllItems();
		for (Grupo grupo : listaGrupos) {
			comboBox.addItem( grupo.getNomGrupo());
		}
	}
	
	private void pulsadoModificar() {
		try {
			Producto p = new Producto(Integer.parseInt(textFieldIdProducto.getText())
					                  ,textFieldNombre.getText()
					                  , daog.get((String)comboBox.getSelectedItem()).getIdGrupo()
					                  , Double.parseDouble(textFieldPrecio.getText()));
			daop.update(p);
			cargarTabla();
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Revisa el precio","Error",JOptionPane.ERROR_MESSAGE);
		}
	}
}



