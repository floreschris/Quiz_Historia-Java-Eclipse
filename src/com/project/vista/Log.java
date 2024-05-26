package com.project.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Principal;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Log extends JFrame {

	private JPanel panel_control;
	private JTextField txtUsuario;
	private JPasswordField passwordField;

	public void Limpiar() {

		txtUsuario.setText("");
		passwordField.setText("");

	}

	public Log() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1227, 612);
		panel_control = new JPanel();
		panel_control.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel_control);
		panel_control.setLayout(null);

		JLabel lblUsu_1_3 = new JLabel("");
		lblUsu_1_3.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\imgLogin\\imgLogin\\icons8-peru-64.png"));
		lblUsu_1_3.setBounds(477, 220, 98, 127);
		panel_control.add(lblUsu_1_3);

		JLabel lblUsu_1_2 = new JLabel("");
		lblUsu_1_2.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\imgLogin\\imgLogin\\icons8-pikuniku-100.png"));
		lblUsu_1_2.setBounds(1113, 38, 98, 80);
		panel_control.add(lblUsu_1_2);

		JLabel lblUsu_1 = new JLabel("");
		lblUsu_1.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\imgLogin\\imgLogin\\icons8-poncho-64.png"));
		lblUsu_1.setBounds(477, 27, 98, 80);
		panel_control.add(lblUsu_1);

		JLabel lblUsu = new JLabel("");
		lblUsu.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\imgLogin\\imgLogin\\icons8-circundado-usuario-hombre-tipo-de-piel-1-2.gif"));
		lblUsu.setBounds(743, 94, 198, 169);
		panel_control.add(lblUsu);

		JLabel lblhuella = new JLabel("");
		lblhuella.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\imgLogin\\imgLogin\\fingerprint-regular-24.png"));
		lblhuella.setBounds(460, 449, 24, 65);
		panel_control.add(lblhuella);

		JLabel lbladorno = new JLabel("");
		lbladorno.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\imgLogin\\imgLogin\\git-merge-regular-24.png"));
		lbladorno.setBounds(10, 11, 37, 74);
		panel_control.add(lbladorno);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setFont(new Font("Monospaced", Font.BOLD, 83));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(558, 0, 576, 94);
		panel_control.add(lblLogin);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setFont(new Font("Monospaced", Font.BOLD, 30));
		lblUsuario.setBounds(635, 274, 154, 58);
		panel_control.add(lblUsuario);

		txtUsuario = new JTextField();
		txtUsuario.setBackground(new Color(240, 230, 140));
		txtUsuario.setFont(new Font("Monospaced", Font.BOLD, 34));
		txtUsuario.setBounds(894, 270, 240, 58);
		panel_control.add(txtUsuario);
		txtUsuario.setColumns(10);

		JLabel lblPasword = new JLabel("Password");
		lblPasword.setFont(new Font("Monospaced", Font.BOLD, 30));
		lblPasword.setBounds(635, 343, 154, 58);
		panel_control.add(lblPasword);

		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(240, 230, 140));
		passwordField.setFont(new Font("Monospaced", Font.BOLD, 34));
		passwordField.setBounds(894, 339, 240, 58);
		panel_control.add(passwordField);

		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\imgLogin\\imgLogin\\hand-right-solid-24.png"));
		btnIngresar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnIngresar.setBackground(new Color(245, 222, 179));
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Men N = new Men();

				String usuario = txtUsuario.getText();
				String password = passwordField.getText();

				try {
					if (usuario.isEmpty() || password.isEmpty()) {

						JOptionPane.showMessageDialog(null, "Complete la informacion...");

					} else {
						if (usuario.equalsIgnoreCase("admin") && password.equalsIgnoreCase("1234")) {

							JOptionPane.showMessageDialog(null, "Bienvenido al juego");
							N.setVisible(true);
							N.setLocationRelativeTo(null);
							N.setTitle("Menu del juego");

						} else if (usuario.equalsIgnoreCase("cristofer@test.com")
								&& password.equalsIgnoreCase("12345")) {

							JOptionPane.showMessageDialog(null, "Bienvenido al juego");
							N.setVisible(true);
							N.setLocationRelativeTo(null);
							N.setTitle("Menu del juego");
						}
					}

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Informacion Incorrecta...");
				}

				Limpiar();
			}
		});
		btnIngresar.setBounds(585, 449, 252, 40);
		panel_control.add(btnIngresar);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\imgLogin\\imgLogin\\message-x-solid-24.png"));
		btnSalir.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnSalir.setBackground(new Color(245, 222, 179));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});
		btnSalir.setBounds(894, 448, 252, 40);
		panel_control.add(btnSalir);

		JLabel lblFondo = new JLabel("");
		lblFondo.setBackground(new Color(0, 204, 255));
		lblFondo.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\imgLogin\\imgLogin\\Presentación Historia Aesthetic Beige Pastel (2).png"));
		lblFondo.setBounds(0, 0, 1211, 573);
		panel_control.add(lblFondo);
		
		
	}	

}
