package ejercicios.hotel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionHabitaciones extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tabla;



	/**
	 * Create the dialog.
	 */
	public GestionHabitaciones(JFrame padre,boolean modal) {
		super(padre,modal);
		setTitle("Gesti\u00F3n de Habitaciones");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblMarcaLasHabitaciones = new JLabel("Marca las habitaciones disponibles");
		lblMarcaLasHabitaciones.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMarcaLasHabitaciones.setBounds(106, 43, 239, 26);
		contentPanel.add(lblMarcaLasHabitaciones);


		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 85, 377, 132);
		contentPanel.add(scrollPane);

		tabla = new JTable();
		tabla.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null},
				},
				new String[] {
						"Habitaci\u00F3n", "Disponible"
				}
				));
		scrollPane.setViewportView(tabla);



		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);

		JButton okButton = new JButton("OK");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pulsadoOK();
			}
		});
		okButton.setActionCommand("OK");
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);


		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pulsadoCancel();
			}
		});
		cancelButton.setActionCommand("Cancel");
		buttonPane.add(cancelButton);

		cargarTabla();
	}




	private void pulsadoOK(){
		for(int i=0;i<tabla.getRowCount();i++){
			int numeroHabitacion=(int)(tabla.getValueAt(i, 0));
			boolean estado=(boolean)(tabla.getValueAt(i, 1));
			((VentanaHotel)(this.getParent())).getGestorHabitaciones().setDisponible(numeroHabitacion,estado);

		}
		this.dispose();
	}

	private void pulsadoCancel() {
		this.dispose();
	}
	private void cargarTabla(){
		ArrayList<Habitacion> lista=((VentanaHotel)(this.getParent())).getGestorHabitaciones().getHabitacionesLibres();

		Object[][]datos=new Object[lista.size()][2];
		for(int i=0;i<lista.size();i++){
			datos[i][0]=lista.get(i).getNumero();
			datos[i][1]=lista.get(i).isDisponible();
		}
		tabla.setModel(new javax.swing.table.DefaultTableModel(
				datos,
				new String [] {
						"Habitación", "Disponible"
				}
				) {
			Class[] types = new Class [] {
					java.lang.Integer.class, java.lang.Boolean.class
			};
			boolean[] canEdit = new boolean [] {
					false, true
			};

			public Class getColumnClass(int columnIndex) {
				return types [columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit [columnIndex];
			}
		});


	}


}
