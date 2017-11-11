import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;


/**
 * 
 * @author Mayra Silva    17276
 * @author Odalis Reyes   17032
 * @author Ivan Maldonado 17211
 * 
 * @file Principal.java
 * @since 10/11/17
 */
public class Main {

	private JFrame frame;
	private JTextField UsuarioTF;
	private JPasswordField PasswordTF;


	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 454, 343);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel iOrder = new JLabel("iOrder");
		iOrder.setHorizontalAlignment(SwingConstants.CENTER);
		iOrder.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		iOrder.setBounds(6, 38, 438, 26);
		frame.getContentPane().add(iOrder);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario:");
		lblNombreDeUsuario.setBounds(134, 94, 135, 16);
		frame.getContentPane().add(lblNombreDeUsuario);
		
		/* TextField para ingresar el usuario */
		UsuarioTF = new JTextField();
		UsuarioTF.setBounds(126, 111, 201, 26);
		frame.getContentPane().add(UsuarioTF);
		UsuarioTF.setColumns(10);

		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setBounds(134, 150, 135, 16);
		frame.getContentPane().add(lblContrasea);
		
		/* TextField para ingresar la contraseña */
		PasswordTF = new JPasswordField();
		PasswordTF.setBounds(126, 168, 201, 26);
		frame.getContentPane().add(PasswordTF);
		
		/* Boton para crear cuenta */
		JButton CrearB = new JButton("Crear cuenta");
		CrearB.setBounds(123, 223, 114, 29);
		frame.getContentPane().add(CrearB);
		
		/* Boton para ingresar al iOrder */
		JButton IngresarB = new JButton("Ingresar");
		IngresarB.setBounds(238, 223, 89, 29);
		frame.getContentPane().add(IngresarB);
		
		
		
		/*
		 * ActionListener para el boton "Ingresar"
		 */
		IngresarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (UsuarioTF.getText().equals(" ")) {
					JOptionPane.showMessageDialog(null, "Debe ingresar un nombre de usuario"); }
				
				else if (PasswordTF.equals(" ")) {
					JOptionPane.showMessageDialog(null, "Debe ingresar una contraseña"); } }
			});


	}
	
	
	
}
