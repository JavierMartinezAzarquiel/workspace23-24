package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dao.DAOLineaTicket;
import dao.DAOProductos;
import dao.DAOTicket;
import entidades.LineaTicket;
import entidades.Producto;
import entidades.Ticket;

import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;

public class Bar extends JFrame {

	DAOProductos daop=new DAOProductos();
	DAOTicket daot=new DAOTicket();
	DAOLineaTicket daolt=new DAOLineaTicket();
	
	
	private JPanel contentPane;
	private JTextField campoNumeroTicket;
	private JTable table;
	private JTextField campoTotal;
	private JPanel panelBotones;
	private JPanel panel_2;
	private JPanel panel_3;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Bar frame = new Bar();
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
	public Bar() {
		setTitle("Bar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(0, 2, 10, 0));
		setContentPane(contentPane);
		
		
		panelBotones = new JPanel();
		contentPane.add(panelBotones);
		FlowLayout fl_panelBotones = new FlowLayout(FlowLayout.LEADING, 5, 5);
		fl_panelBotones.setAlignOnBaseline(true);
		panelBotones.setLayout(fl_panelBotones);
		
		 
		JPanel panelTicket = new JPanel();
		contentPane.add(panelTicket);
		panelTicket.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panelTicket.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Producto", "Cantidad", "Precio"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		
		panel_2 = new JPanel();
		panelTicket.add(panel_2, BorderLayout.NORTH);
		
		JLabel lblTicket = new JLabel("Ticket :");
		panel_2.add(lblTicket);
		lblTicket.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		campoNumeroTicket = new JTextField();
		panel_2.add(campoNumeroTicket);
		campoNumeroTicket.setHorizontalAlignment(SwingConstants.RIGHT);
		campoNumeroTicket.setColumns(10);
		
		panel_3 = new JPanel();
		panelTicket.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblTotal = new JLabel("Total :");
		panel_3.add(lblTotal);
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		campoTotal = new JTextField();
		panel_3.add(campoTotal);
		campoTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		campoTotal.setColumns(10);
		
		JButton btnPagado = new JButton("Pagado");
		panel_3.add(btnPagado);
		btnPagado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pulsadoPagado();
			}
		});
		
		
		crearBotones();
		nuevoTicket();
		cargarTabla();
	}

	//metodo para crear los botones de los productos
    private void crearBotones(){
        ArrayList<Producto> lista=daop.get();
        for(Producto p:lista){
           JButton boton=new JButton();
           boton.setIcon(new javax.swing.ImageIcon(p.getImagen()));
           boton.setPreferredSize(new java.awt.Dimension(100, 100));
           boton.setName(p.getCodigo());
           boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulsadoBebida(evt);
            }
             });

           panelBotones.add(boton);
        }
        
    }

	
	private void nuevoTicket(){
		int ultimoNumero=daot.getUltimoNumeroUsado();
		Ticket nuevo=new Ticket(ultimoNumero+1);
		daot.insert(nuevo);
		campoNumeroTicket.setText(String.valueOf(nuevo.getNumero()));
	}
	
	private void cargarTabla(){
		ArrayList<LineaTicket> lista=daolt.get(Integer.parseInt(campoNumeroTicket.getText()));
		Object[][] datos=new Object[lista.size()][3];
		float total=0;
		for(int i=0;i<lista.size();i++){
			Producto p=daop.get(lista.get(i).getCodigoProducto());
			datos[i][0]=p.getNombre();
			datos[i][1]=lista.get(i).getCantidad();
			datos[i][2]=p.getPrecio();
			total+=lista.get(i).getCantidad()*p.getPrecio();
		}
		table.setModel(new DefaultTableModel(
				datos,
				new String[] {
						"Producto", "Cantidad", "Precio"
				}
				) {
			boolean[] columnEditables = new boolean[] {
					false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		campoTotal.setText(String.valueOf(total));
	}
	
	private void pulsadoPagado(){
		nuevoTicket();
		cargarTabla();
	}
	
	private void pulsadoBebida(java.awt.event.ActionEvent evt){
		String codigo=((JButton)evt.getSource()).getName();

		int numeroTicket=Integer.parseInt(campoNumeroTicket.getText());
		LineaTicket linea=daolt.get(numeroTicket, codigo);
		if(linea==null){
			//añadir
			daolt.insert(new LineaTicket(numeroTicket, codigo, 1));
		}else{
			//modificar
			linea.setCantidad(linea.getCantidad()+1);
			daolt.update(linea);
		}
		cargarTabla();
	}
}
