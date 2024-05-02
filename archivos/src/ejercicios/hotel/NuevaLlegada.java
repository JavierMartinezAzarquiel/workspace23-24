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

import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class NuevaLlegada extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tabla;



	/**
	 * Create the dialog.
	 */
	public NuevaLlegada(JFrame padre,boolean modal) {
		super(padre,modal);
		setBounds(100, 100, 537, 293);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel label = new JLabel();
		label.setText("Clientes");
		label.setForeground(new Color(0, 51, 204));
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(177, 24, 61, 22);
		contentPanel.add(label);


		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 64, 375, 139);
		contentPanel.add(scrollPane);
		{
			tabla = new JTable();
			tabla.setAutoCreateRowSorter(true);
			tabla.setAutoCreateRowSorter(true);
			tabla.setModel(new javax.swing.table.DefaultTableModel(
					new Object [][] {
						{null, null},
						{null, null},
						{null, null},
						{null, null}
					},
					new String [] {
							"DNI", "Nombre"
					}
					) {
				Class[] types = new Class [] {
						java.lang.String.class, java.lang.String.class
				};
				boolean[] canEdit = new boolean [] {
						false, false
				};

				public Class getColumnClass(int columnIndex) {
					return types [columnIndex];
				}

				public boolean isCellEditable(int rowIndex, int columnIndex) {
					return canEdit [columnIndex];
				}
			});
			scrollPane.setViewportView(tabla);
		}


		JButton buttonNuevo = new JButton();
		buttonNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pulsadoNuevo();
			}
		});
		buttonNuevo.setText("Nuevo");
		buttonNuevo.setBounds(417, 92, 75, 23);
		contentPanel.add(buttonNuevo);


		JButton buttonAceptar = new JButton();
		buttonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pulsadoAceptar();
			}
		});
		buttonAceptar.setText("Aceptar");
		buttonAceptar.setBounds(417, 121, 75, 23);
		contentPanel.add(buttonAceptar);


		JButton buttonCancel = new JButton();
		buttonCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pulsadoCancelar();
			}
		});
		buttonCancel.setText("Cancelar");
		buttonCancel.setBounds(417, 150, 75, 23);
		contentPanel.add(buttonCancel);

		cargarTablaClientes();
	}


	private void pulsadoNuevo(){
		NuevoCliente nc=new NuevoCliente((VentanaHotel)this.getParent(), true);
		nc.setLocationRelativeTo(this);
		nc.setVisible(true);
		cargarTablaClientes();
	}

	private void pulsadoAceptar(){
		if (tabla.getSelectedRow()!=-1){
			VentanaHotel ventanaHotel=(VentanaHotel)this.getParent();
			int numeroHabitacion=(Integer)ventanaHotel.getTabla().getValueAt(ventanaHotel.getTabla().getSelectedRow(), 0);
			String dni=(String)tabla.getValueAt(tabla.getSelectedRow(), 0);
			ventanaHotel.getGestorHabitaciones().alojar(numeroHabitacion,dni);
			this.dispose();
		}else{
			JOptionPane.showMessageDialog(this,"Debes seleccionar un cliente","Error",JOptionPane.ERROR_MESSAGE);
		}
	}

	private void pulsadoCancelar(){
		this.dispose();
	}


	private void cargarTablaClientes(){
		ArrayList<Cliente> lista=((VentanaHotel)(this.getParent())).getGestorClientes().get();


		Object[][]datos=new Object[lista.size()][2];
		for(int i=0;i<lista.size();i++){
			datos[i][0]=lista.get(i).getDni();
			datos[i][1]=lista.get(i).getNombre();

		}
		tabla.setModel(new javax.swing.table.DefaultTableModel(datos,
				new String [] {
						"DNI", "Nombre"
		}
				) {
			Class[] types = new Class [] {
					java.lang.String.class, java.lang.String.class
			};
			boolean[] canEdit = new boolean [] {
					false, false
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
