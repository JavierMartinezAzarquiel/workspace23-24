package ejercicios.taller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.File;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class VentanaTaller extends JFrame {

	//preparar dos objetos gestor para que se encarguen de los archivos
	private GestorArchivoVehiculos gestorV = new GestorArchivoVehiculos(new File(".\\src\\ejercicios\\taller\\vehiculos.obj"));
	private GestorArchivoIntervenciones gestorI = new GestorArchivoIntervenciones(new File(".\\src\\ejercicios\\taller\\intervenciones.obj"));

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					VentanaTaller frame = new VentanaTaller();
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
	public VentanaTaller() {
		setTitle("Ventana Taller");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Matricula: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(154, 57, 81, 22);
		contentPane.add(lblNewLabel);

		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				pulsadoCambioItem();
			}
		});
		comboBox.setBounds(265, 59, 137, 22);
		contentPane.add(comboBox);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(62, 150, 492, 226);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null},
				},
				new String[] {
						"Fecha", "Matricula", "Coste", "Descripci\u00F3n"
				}
				) {
			Class[] columnTypes = new Class[] {
					String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
					false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(104);
		table.getColumnModel().getColumn(1).setPreferredWidth(141);
		table.getColumnModel().getColumn(2).setPreferredWidth(113);
		table.getColumnModel().getColumn(3).setPreferredWidth(222);
		scrollPane.setViewportView(table);
		//antes de terminar el constructor, pido que cargue el comboBox y la tabla
		this.cargarComboBox();
		this.cargarTabla();
	}


	//Carga del comboBox
	private void cargarComboBox() {
		this.comboBox.addItem("Todas");
		for ( Vehiculo v : gestorV.getVehiculos()) {
			comboBox.addItem(v.getMatricula());
		}
	}

	//Carga de la tabla
	private void cargarTabla() {
		//decidir que objetos tengo que mostrar
		ArrayList<Intervencion> lista;
		//miro en el comboBox a ver que hay seleccionado
		String matricula =String.valueOf(comboBox.getSelectedItem());
		if (matricula.equals("Todas")) { 
			lista = gestorI.getIntervenciones();
		} else {
			lista = gestorI.getIntervenciones(matricula);
		}
		//preparar un array de dos dimensiones con los datos
		Object[][] datos = new Object[lista.size()][4];
		for (int i = 0; i < lista.size() ; i++) {
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			datos[i][0] = lista.get(i).getFecha().format(formato);
			datos[i][1] = lista.get(i).getMatricula();
			DecimalFormat formatoCoste = new DecimalFormat("##,##0.00 €");
			datos[i][2] = formatoCoste.format(lista.get(i).getCoste());
			datos[i][3] = lista.get(i).getDescripcion();
		}
		//asignar el array al model de la tabla
		table.setModel(new DefaultTableModel(
				datos,
				new String[] {
						"Fecha", "Matricula", "Coste", "Descripci\u00F3n"
				}
				) {
			Class[] columnTypes = new Class[] {
					String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
					false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(104);
		table.getColumnModel().getColumn(1).setPreferredWidth(141);
		table.getColumnModel().getColumn(2).setPreferredWidth(113);
		table.getColumnModel().getColumn(3).setPreferredWidth(222);
	}
	
	
	private void pulsadoCambioItem() {
		this.cargarTabla();
	}
}






