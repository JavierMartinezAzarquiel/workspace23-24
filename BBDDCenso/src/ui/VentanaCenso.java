package ui;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import dao.DAOHabitante;
import dao.DAOPoblacion;
import entidades.Habitante;
import entidades.Poblacion;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ListSelectionModel;

public class VentanaCenso extends JFrame {
	private DAOHabitante daoHabitante = new DAOHabitante();
	private DAOPoblacion daoPoblacion = new DAOPoblacion();
	private JPanel contentPane;
	private JTable tablePoblacion;
	private JTable tableHabitantes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					VentanaCenso frame = new VentanaCenso();
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
	public VentanaCenso() {
		setTitle("Censo Electoral");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 46, 527, 101);
		contentPane.add(scrollPane);

		tablePoblacion = new JTable();
		tablePoblacion.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tablePoblacion.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				cargarTablaHabitantes();
			}
		});
		tablePoblacion.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null},
				},
				new String[] {
						"Poblacion", "Habitantes"
				}
				) {
			Class[] columnTypes = new Class[] {
					String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
					false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tablePoblacion.getColumnModel().getColumn(0).setResizable(false);
		tablePoblacion.getColumnModel().getColumn(1).setResizable(false);
		scrollPane.setViewportView(tablePoblacion);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(45, 188, 527, 92);
		contentPane.add(scrollPane_1);

		tableHabitantes = new JTable();
		tableHabitantes.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null},
				},
				new String[] {
						"Nombre", "email", "Edad", "Poblacion"
				}
				) {
			Class[] columnTypes = new Class[] {
					String.class, String.class, Integer.class, String.class
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
		tableHabitantes.getColumnModel().getColumn(0).setResizable(false);
		tableHabitantes.getColumnModel().getColumn(1).setResizable(false);
		tableHabitantes.getColumnModel().getColumn(2).setResizable(false);
		tableHabitantes.getColumnModel().getColumn(3).setResizable(false);
		scrollPane_1.setViewportView(tableHabitantes);

		cargarTablaPoblacion();
		cargarTablaHabitantes();
	}

	private void cargarTablaPoblacion() {
		ArrayList<Poblacion> lista = daoPoblacion.get();
		Object[][] datos = new Object[lista.size()][2];
		for(int i=0;i<lista.size();i++) {
			datos[i][0]=lista.get(i).getNombre();
			datos[i][1]=lista.get(i).getNumeroHabitantes();
		}
		tablePoblacion.setModel(new DefaultTableModel(
				datos,
				new String[] {
						"Poblacion", "Habitantes"
				}
				) {
			Class[] columnTypes = new Class[] {
					String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
					false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tablePoblacion.getColumnModel().getColumn(0).setResizable(false);
		tablePoblacion.getColumnModel().getColumn(1).setResizable(false);
	}

	private void cargarTablaHabitantes() {
		ArrayList<Habitante> lista;
		if(tablePoblacion.getSelectedRow()!=-1) {
			lista = daoHabitante.getHabitantesDeUnaPoblacion((String)tablePoblacion.getValueAt(tablePoblacion.getSelectedRow(), 0));
		}else {
			lista = daoHabitante.get();
		}
		Object[][] datos = new Object[lista.size()][4];
		for(int i=0;i<lista.size();i++) {
			datos[i][0]=lista.get(i).getNombre();
			datos[i][1]=lista.get(i).getEmail();
			datos[i][2]=lista.get(i).getEdad();
			datos[i][3]=lista.get(i).getPoblacion();
		}
		tableHabitantes.setModel(new DefaultTableModel(
				datos,
				new String[] {
						"Nombre", "email", "Edad", "Poblacion"
				}
				) {
			Class[] columnTypes = new Class[] {
					String.class, String.class, Integer.class, String.class
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
		tableHabitantes.getColumnModel().getColumn(0).setResizable(false);
		tableHabitantes.getColumnModel().getColumn(1).setResizable(false);
		tableHabitantes.getColumnModel().getColumn(2).setResizable(false);
		tableHabitantes.getColumnModel().getColumn(3).setResizable(false);
	}
}
