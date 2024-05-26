package com.project.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Men extends JFrame {

	private JPanel contentPane;

	public Men() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1650, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Seleccione la historia");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\imgPrincipal\\imgPrincipal\\icons8-cursor-de-mano-48.png"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Monospaced", Font.BOLD, 17));
		lblNewLabel_2.setBounds(697, 637, 326, 48);
		contentPane.add(lblNewLabel_2);

		JButton btnNivel = new JButton("Historia del Peru");
		btnNivel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H_P T = new H_P();
				T.setVisible(true);
				T.setLocationRelativeTo(null);
				T.setTitle("HISTORIA DEL PERU");

			}
		});
		btnNivel.setIcon(new ImageIcon("C:\\Users\\carle\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\imgPrincipal\\imgPrincipal\\icons8-historial-de-pedidos-50.png"));
		btnNivel.setFont(new Font("Monospaced", Font.BOLD, 25));
		btnNivel.setBackground(new Color(245, 222, 179));
		btnNivel.setBounds(1057, 716, 360, 77);
		contentPane.add(btnNivel);

		JButton btnNewButton = new JButton("Historia Universal");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				H_U O = new H_U();
				O.setVisible(true);
				O.setLocationRelativeTo(null);
				O.setTitle("HISTORIA UNIVERSAL");

			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\imgPrincipal\\imgPrincipal\\icons8-historial-de-pedidos-50.png"));
		btnNewButton.setBackground(new Color(245, 222, 179));
		btnNewButton.setFont(new Font("Monospaced", Font.BOLD, 25));
		btnNewButton.setBounds(268, 713, 360, 82);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("BIENVENIDO AL JUEGO");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Monospaced", Font.BOLD, 26));
		lblNewLabel_1.setBounds(51, 136, 1624, 57);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\imgPrincipal\\imgPrincipal\\Presentación Historia Aesthetic Beige Pastel (6).jpg"));
		lblNewLabel.setBounds(0, 0, 1902, 861);
		contentPane.add(lblNewLabel);
	}
}
