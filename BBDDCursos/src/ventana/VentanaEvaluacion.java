package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.UIManager;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dao.DAOAlumnos;
import dao.DAOCursos;
import dao.DAOEvaluaciones;
import entidades.Alumno;
import entidades.Curso;
import entidades.Evaluacion;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class VentanaEvaluacion extends JFrame {

	DAOAlumnos daoAlumnos=new DAOAlumnos();
	DAOCursos daoCursos=new DAOCursos();
	DAOEvaluaciones daoEvaluaciones=new DAOEvaluaciones();
	
	private JPanel contentPane;
	private JTextField textField;
	private JComboBox<Integer> comboBoxNotas;
	private JComboBox<String> comboBoxCursos;
	private JComboBox<String> comboBoxAlumnos;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					VentanaEvaluacion frame = new VentanaEvaluacion();
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
	public VentanaEvaluacion() {
		setTitle("Evaluaci\u00F3n de Cursos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(52, 256, 604, 171);
		contentPane.add(scrollPane_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Alumno", "Curso", "Nota", "Observaciones"
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
		table.getColumnModel().getColumn(0).setPreferredWidth(123);
		table.getColumnModel().getColumn(1).setPreferredWidth(123);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(209);
		table.getColumnModel().getColumn(3).setMinWidth(27);
		scrollPane_2.setViewportView(table);
		
		JButton btnAnotar = new JButton("Anotar");
		btnAnotar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pulsadoAnotar();
			}
		});
		btnAnotar.setBounds(271, 212, 156, 23);
		contentPane.add(btnAnotar);
		
		JLabel lblSeleccioneAlumno = new JLabel("Seleccione Alumno:");
		lblSeleccioneAlumno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSeleccioneAlumno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSeleccioneAlumno.setBounds(101, 49, 133, 23);
		contentPane.add(lblSeleccioneAlumno);
		
		JLabel lblSeleccioneCurso = new JLabel("Seleccione Curso:");
		lblSeleccioneCurso.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSeleccioneCurso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSeleccioneCurso.setBounds(101, 83, 133, 23);
		contentPane.add(lblSeleccioneCurso);
		
		JLabel lblNota = new JLabel("Nota:");
		lblNota.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNota.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNota.setBounds(101, 116, 133, 23);
		contentPane.add(lblNota);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setHorizontalAlignment(SwingConstants.RIGHT);
		lblObservaciones.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblObservaciones.setBounds(101, 150, 133, 23);
		contentPane.add(lblObservaciones);
		
		textField = new JTextField();
		textField.setBounds(244, 152, 412, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		comboBoxNotas = new JComboBox<Integer>();
		comboBoxNotas.setBounds(244, 119, 133, 20);
		contentPane.add(comboBoxNotas);
		
		comboBoxCursos = new JComboBox<String>();
		comboBoxCursos.setBounds(244, 86, 233, 20);
		contentPane.add(comboBoxCursos);
		
		comboBoxAlumnos = new JComboBox<String>();
		comboBoxAlumnos.setBounds(244, 52, 233, 20);
		contentPane.add(comboBoxAlumnos);
		
		cargarComboBoxAlumnos();
		cargarComboBoxCursos();
		cargarComboBoxNotas();
		cargarTabla();
	}
	
	private void cargarComboBoxAlumnos(){
		ArrayList<Alumno> lista=daoAlumnos.get();
		comboBoxAlumnos.removeAllItems();
		for (Alumno alumno : lista) {
			comboBoxAlumnos.addItem(alumno.getNombre()+" "+alumno.getApellidos());
		}
	}
	
	private void cargarComboBoxCursos(){
		ArrayList<Curso> lista=daoCursos.get();
		comboBoxCursos.removeAllItems();
		SimpleDateFormat formateador=new SimpleDateFormat("dd/MM/yyyy");
		for (Curso curso : lista) {
			comboBoxCursos.addItem(curso.getCurso()+"   "+formateador.format(curso.getFechaInicio())+" a "+formateador.format(curso.getFechaFin()));
		}
	}
	
	private void cargarComboBoxNotas(){
		for(int i=1;i<=10;i++){
			comboBoxNotas.addItem(i);
		}
	}
	
	private void cargarTabla(){
		ArrayList<Evaluacion> lista=daoEvaluaciones.get();
		Object[][] datos=new Object[lista.size()][4];
		
		for (int i = 0; i < lista.size(); i++) {
			Alumno a = daoAlumnos.get(lista.get(i).getCodigoAlumno()); //pido al daoalumnos el alumno con ese codigo
			datos[i][0]=a.getNombre()+" "+a.getApellidos();
			Curso c = daoCursos.get(lista.get(i).getCodigoCurso()); //pido el objeto curso
			datos[i][1]=c.getCurso();
			datos[i][2]=lista.get(i).getNota();
			datos[i][3]=lista.get(i).getObservaciones();
		}
		
		table.setModel(new DefaultTableModel(
				datos,
				new String[] {
					"Alumno", "Curso", "Nota", "Observaciones"
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
			table.getColumnModel().getColumn(0).setPreferredWidth(123);
			table.getColumnModel().getColumn(1).setPreferredWidth(123);
			table.getColumnModel().getColumn(2).setResizable(false);
			table.getColumnModel().getColumn(3).setPreferredWidth(209);
			table.getColumnModel().getColumn(3).setMinWidth(27);
	}
	
	private void pulsadoAnotar(){
		int codigoAlumno=daoAlumnos.get().get(comboBoxAlumnos.getSelectedIndex()).getCodigoAlumno();
		int codigoCurso=daoCursos.get().get(comboBoxCursos.getSelectedIndex()).getCodigoCurso();
		
		if(daoEvaluaciones.get(codigoAlumno, codigoCurso)==null){
			int nota=(Integer)comboBoxNotas.getSelectedItem();
			String observaciones=textField.getText();
			Evaluacion ev=new Evaluacion(codigoAlumno, codigoCurso, nota, observaciones);
			daoEvaluaciones.add(ev);
			JOptionPane.showMessageDialog(this, "Nota guardada","Correcto",JOptionPane.INFORMATION_MESSAGE);
			cargarTabla();
		}else{
			JOptionPane.showMessageDialog(this, "Ya existe una nota para ese alumno y curso","Error",JOptionPane.ERROR_MESSAGE);
		}
	}
}
