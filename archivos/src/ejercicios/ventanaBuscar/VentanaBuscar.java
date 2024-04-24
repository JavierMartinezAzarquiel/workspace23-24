package ejercicios.ventanaBuscar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.ArrayList;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;

public class VentanaBuscar extends JFrame {

	private GestorArchivoTexto gestor=new GestorArchivoTexto(null);
	
	private JPanel contentPane;
	private JTextField campoArchivo;
	private JButton btnAbrir;
	private JTextField campoFiltro;
	private JButton btnFiltrar;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					VentanaBuscar frame = new VentanaBuscar();
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
	public VentanaBuscar() {
		setTitle("Busqueda en archivos de texto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		campoArchivo = new JTextField();
		campoArchivo.setEditable(false);
		campoArchivo.setBounds(36, 19, 352, 20);
		panel.add(campoArchivo);
		campoArchivo.setColumns(10);
		
		campoFiltro = new JTextField();
		campoFiltro.setBounds(36, 69, 191, 20);
		//Evento para que haga la busqueda al tiempo que tecleamos
//		campoFiltro.getDocument().addDocumentListener(new DocumentListener() {
//			public void changedUpdate(DocumentEvent e) {
//				pulsadoFiltrar();
//			}
//			public void removeUpdate(DocumentEvent e) {
//				pulsadoFiltrar();
//			}
//			public void insertUpdate(DocumentEvent e) {
//				pulsadoFiltrar();
//			}
//		});
		
		panel.add(campoFiltro);
		campoFiltro.setColumns(10);
		
		btnAbrir = new JButton("Abrir");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pulsadoAbrir();
			}
		});
		btnAbrir.setBounds(397, 18, 55, 23);
		panel.add(btnAbrir);
		
		btnFiltrar = new JButton("Filtrar");
		btnFiltrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pulsadoFiltrar();
			}
		});
		btnFiltrar.setBounds(237, 68, 61, 23);
		panel.add(btnFiltrar);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
	}
	
	private void pulsadoAbrir(){
		JFileChooser dialogo=new JFileChooser(gestor.getArchivo());
		dialogo.showOpenDialog(this);
		
		if(dialogo.getSelectedFile()!=null){
			gestor.setArchivo(dialogo.getSelectedFile());
			//mostrar nombre del archivo
			campoArchivo.setText(gestor.getArchivo().getPath());
			//pido al gestor que me traiga el texto
			ArrayList<String> lista=gestor.getTexto();
			//visualizo el texto en la ventana
			textArea.setText("");//limpiar area de texto
			for (int i = 0; i < lista.size(); i++) {
				textArea.append(lista.get(i)+"\n");
			}
			
		}
		
	}

	private void pulsadoFiltrar(){
			
		if(gestor.getArchivo()==null){
			JOptionPane.showMessageDialog(this, "Selecciona un archivo","Error",JOptionPane.ERROR_MESSAGE);
		}
		else{
			
			ArrayList<String> lista=gestor.getTexto();
			
			textArea.setText("");
			for (String linea : lista) {
				if(linea.toUpperCase().indexOf(campoFiltro.getText().toUpperCase())!=-1){
					textArea.append(linea+"\n");
				}
				
			}
			
		}
	}
}
