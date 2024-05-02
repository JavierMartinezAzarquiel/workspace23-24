package ejercicios.hotel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaHotel extends JFrame {

	private GestorArchivoClientes gestorClientes=new GestorArchivoClientes();
	private GestorArchivoHabitaciones gestorHabitaciones=new GestorArchivoHabitaciones();
	private JPanel contentPane;
	private JTable tabla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					VentanaHotel frame = new VentanaHotel();
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
	public VentanaHotel() {
		setTitle("Hotel Azarquiel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHotelAzarquiel = new JLabel("Hotel Azarquiel");
		lblHotelAzarquiel.setForeground(Color.BLUE);
		lblHotelAzarquiel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHotelAzarquiel.setBounds(217, 65, 163, 25);
		contentPane.add(lblHotelAzarquiel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(52, 121, 503, 183);
		contentPane.add(scrollPane);
		
		tabla = new JTable();
		tabla.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Habitaci\u00F3n", "Dni", "Nombre", "Disponible"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Boolean.class
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
		scrollPane.setViewportView(tabla);
		
		JButton btnGestinDeHabitaciones = new JButton("Gesti\u00F3n de Habitaciones");
		btnGestinDeHabitaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pulsadoGestion();
			}
		});
		btnGestinDeHabitaciones.setBounds(52, 310, 155, 25);
		contentPane.add(btnGestinDeHabitaciones);
		
		JButton btnSalidas = new JButton("Salidas");
		btnSalidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pulsadoSalidas();
			}
		});
		btnSalidas.setBounds(466, 311, 89, 23);
		contentPane.add(btnSalidas);
		
		JButton btnLlegadas = new JButton("Llegadas");
		btnLlegadas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pulsadoLlegadas();
			}
		});
		btnLlegadas.setBounds(372, 311, 89, 23);
		contentPane.add(btnLlegadas);
		cargarTabla();
	}
	
	
	private void cargarTabla(){
		ArrayList<Habitacion> lista=gestorHabitaciones.get();
		
		Object[][] datos=new Object[lista.size()][4];
		for (int i = 0; i < lista.size(); i++) {
			datos[i][0]=lista.get(i).getNumero();
			datos[i][1]=lista.get(i).getDni();
			if(lista.get(i).getDni()!=null){
				datos[i][2]=gestorClientes.get( lista.get(i).getDni() ).getNombre();
			}
			datos[i][3]=lista.get(i).isDisponible();
		}
		tabla.setModel(new DefaultTableModel(
				datos,
				new String[] {
					"Habitaci\u00F3n", "Dni", "Nombre", "Disponible"
				}
			) {
				Class[] columnTypes = new Class[] {
					Integer.class, String.class, String.class, Boolean.class
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
	}
	
	private void pulsadoGestion(){
		GestionHabitaciones gestion=new GestionHabitaciones(this, true);
		gestion.setLocationRelativeTo(this);
		gestion.setVisible(true);
		cargarTabla();
	}
	
	private void pulsadoLlegadas(){
		if(tabla.getSelectedRow()!=-1 &&
				((Boolean)(tabla.getValueAt(tabla.getSelectedRow(), 3))) == true){
			NuevaLlegada nl=new NuevaLlegada(this, true);
			nl.setLocationRelativeTo(this);
			nl.setVisible(true);
			cargarTabla();
		}else if(tabla.getSelectedRow()==-1){
			JOptionPane.showMessageDialog(this,"Debes seleccionar una habitación","Error",JOptionPane.ERROR_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(this,"La habitación no está disponible","Error",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	private void pulsadoSalidas(){
		if(tabla.getSelectedRow()!=-1 &&
		           ((String)(tabla.getValueAt(tabla.getSelectedRow(), 1)))!=null){
		            Integer numeroHabitacion=(Integer)(tabla.getValueAt(tabla.getSelectedRow(), 0));
		            gestorHabitaciones.desalojar(numeroHabitacion.intValue());
		            cargarTabla();
		            JOptionPane.showMessageDialog(this,"El cliente abandona la habitación","Salida efectuada",JOptionPane.INFORMATION_MESSAGE );
		        }else if(tabla.getSelectedRow()==-1){
		            JOptionPane.showMessageDialog(this,"Debes seleccionar una habitación","Error",JOptionPane.ERROR_MESSAGE);
		        }else{
		           JOptionPane.showMessageDialog(this,"La habitación no está ocupada","Error",JOptionPane.ERROR_MESSAGE);
		        }
	}

	public GestorArchivoClientes getGestorClientes() {
		return gestorClientes;
	}

	public GestorArchivoHabitaciones getGestorHabitaciones() {
		return gestorHabitaciones;
	}

	public JTable getTabla() {
		return tabla;
	}
	
	
	
	
}
