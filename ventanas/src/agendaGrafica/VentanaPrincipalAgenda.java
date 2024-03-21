package agendaGrafica;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipalAgenda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	//atributo Agenda
	private Agenda agenda;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					VentanaPrincipalAgenda frame = new VentanaPrincipalAgenda();
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
	public VentanaPrincipalAgenda() {
		setTitle("Agenda");
		//Lo primero es cargar la agenda con los contactos
		cargarAgenda();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAnadirContacto = new JButton("Añadir contacto");
		btnAnadirContacto.setBounds(86, 195, 123, 23);
		contentPane.add(btnAnadirContacto);
		
		JButton btnEliminarContacto = new JButton("Eliminar contacto");
		btnEliminarContacto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsadoEliminar();
			}
		});
		btnEliminarContacto.setBounds(246, 195, 123, 23);
		contentPane.add(btnEliminarContacto);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(69, 21, 300, 148);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Nombre", "Telefono"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Long.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(113);
		table.getColumnModel().getColumn(1).setPreferredWidth(125);
		scrollPane.setViewportView(table);
		//antes de acabar el constructor, cargo la tabla
		cargarTabla();
	}//fin constructor
	
	
	private void cargarAgenda() {
		/*
		 * Aquí es donde conectaré con una BBDD o conectaré con un archivo
		 * donde estará guardada la agenda
		 */
		//como no tenemos ni idea, vamos a crear una agenda en blanco y le añadimos
		//algún contacto para que parezca que funciona
		this.agenda = new Agenda();
		this.agenda.add(new Contacto("Laura", 667584743));
		this.agenda.add(new Contacto("Marcos", 603292233));
		this.agenda.add(new Contacto("Sara", 693283295));
	}
	
	private void cargarTabla() {
		//Este método sirve para cargar todos los contactos de la agenda en la tabla
		//Primer paso: Tengo que crear un array para preparar los datos
		Object[][] datos = new Object[this.agenda.length()][2];
		//Obtener la lista de contactos
		ArrayList<Contacto> lista = this.agenda.getListaDeContactos();
		//Relleno el array con los datos
		for (int i = 0; i < datos.length; i++) {
			datos[i][0]=lista.get(i).getNombre();
			datos[i][1]=lista.get(i).getTelefono();
		}
		//cargo el modelo
		table.setModel(new DefaultTableModel(
				datos,
				new String[] {
					"Nombre", "Telefono"
				}
			) {
				Class[] columnTypes = new Class[] {
					String.class, Long.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
			});
			table.getColumnModel().getColumn(0).setPreferredWidth(113);
			table.getColumnModel().getColumn(1).setPreferredWidth(125);
		
	}
	
	private void pulsadoEliminar() {
		//obtener la fila seleccionada en la tabla
		int filaSeleccionada = table.getSelectedRow();
		if (filaSeleccionada == -1) { //no hay fila seleccionada
			JOptionPane.showMessageDialog(this, "No hay fila seleccionada", "Error", JOptionPane.ERROR_MESSAGE);
		} else {
			//pregunto por si acaso no están seguros
			int opcionElegida = JOptionPane.showConfirmDialog(this, "Realmente quieres borrar ese contacto?","Confirmar",JOptionPane.YES_NO_OPTION);
			if (opcionElegida == JOptionPane.YES_OPTION) {
				//borro el contacto
				this.agenda.delete( this.agenda.get(filaSeleccionada) );
				cargarTabla(); //recargo la tabla porque ha habido cambios
			}
		}
		
	}
	
}


