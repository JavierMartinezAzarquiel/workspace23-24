package blocDeNotas;

import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.InputEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BlocDeNotas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	//necesito un objeto Gestor del archivo
	private GestorArchivoTexto gestor = new GestorArchivoTexto(null);
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					BlocDeNotas frame = new BlocDeNotas();
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
	public BlocDeNotas() {
		setTitle("Bloc de Notas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JMenuBar menuBar = new JMenuBar();
		scrollPane.setColumnHeaderView(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItemAbrir = new JMenuItem("Abrir");
		mntmNewMenuItemAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsadoAbrir();
			}
		});
		mntmNewMenuItemAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu.add(mntmNewMenuItemAbrir);
		
		JMenuItem mntmNewMenuItemGuardar = new JMenuItem("Guardar");
		mntmNewMenuItemGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsadoGuardar();
			}
		});
		mntmNewMenuItemGuardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu.add(mntmNewMenuItemGuardar);
		
		JMenuItem mntmNewMenuItemGuardarComo = new JMenuItem("Guardar como");
		mntmNewMenuItemGuardarComo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsadoGuardarComo();
			}
		});
		mnNewMenu.add(mntmNewMenuItemGuardarComo);
		
		JMenu mnNewMenu_1 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_1);
	}
	
	private void pulsadoAbrir() {
		//debería salir un dialogo para seleccionar el archivo (JFileChooser, FileDialog)
		JFileChooser dialogo = new JFileChooser(gestor.getArchivo());
		dialogo.showOpenDialog(this);
		//Ahora habra que preguntar si han seleccionado algo
		if (dialogo.getSelectedFile() != null) {
			//le paso el archivo al gestor
			this.gestor.setArchivo( dialogo.getSelectedFile() );
			//Pido al gestor que lea el texto
			ArrayList<String> texto = this.gestor.getTexto();
			
			//Limpiar el area de texto
			textArea.setText("");
			//mando el texto al textarea
			for (String string : texto) {
				textArea.append(string + "\n");
			}
			//poner el nombre del archivo en el titulo de la ventana
			this.setTitle(gestor.getArchivo().getName() + " : bloc de notas");
		}
	}
	
	private void pulsadoGuardarComo(){
		//mostrar un diálogo para elegir el archivo donde guardar
		JFileChooser dialogo = new JFileChooser(gestor.getArchivo());
		dialogo.showSaveDialog(this);
		//Ahora habra que preguntar si han seleccionado algo
		if (dialogo.getSelectedFile() != null) {
			//le paso el archivo al gestor
			this.gestor.setArchivo( dialogo.getSelectedFile() );
			//pasamos al gestor el texto que debe almacenar
			gestor.setTexto( textArea.getText() );
			//poner el nombre del archivo en el titulo de la ventana
			this.setTitle(gestor.getArchivo().getName() + " : bloc de notas");
		}
		
	}
	
	private void pulsadoGuardar() {
		//Preguntamos si tenemos un archivo elegido
		if (gestor.getArchivo() == null) { //si no hemos elegido todavía un archivo
			this.pulsadoGuardarComo();
		} else {
			//ya tenemos un archivo seleccionado, guardamos directamente
			gestor.setTexto( textArea.getText() );
		}
	}

}






