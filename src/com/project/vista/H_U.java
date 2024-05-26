package com.project.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Principal;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class H_U extends JFrame {

	private JPanel contentPane;
	private JTextField txtElegido;
	ButtonGroup grupoBotnoes = new ButtonGroup();
	private JTextField txtRpta1;
	private JTextField txtRpta2;
	private JTextField txtRpta3;
	private JTextField txtCalificacion;
	private JTextField txtCaf2;
	private JTextField txtCaf3;
	private JTextField txtPuntaje;
	private JTextField txtPromedio;

	public void GrupoRadio(AbstractButton rb1, AbstractButton rb2, AbstractButton rb3, AbstractButton rb4) {

		grupoBotnoes.add(rb1);
		grupoBotnoes.add(rb2);
		grupoBotnoes.add(rb3);
		grupoBotnoes.add(rb4);

	}

	public void Limpiar() {

		txtCaf2.setText("");
		txtCaf3.setText("");
		txtCalificacion.setText("");
		txtPuntaje.setText("");
		txtRpta1.setText("");
		txtRpta2.setText("");
		txtRpta3.setText("");
		txtPromedio.setText("");

	}

	public H_U() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1650, 900);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1_2_1_4 = new JLabel("");
		lblNewLabel_1_2_1_4.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-la-música-country-30.png"));
		lblNewLabel_1_2_1_4.setBounds(775, 633, 46, 67);
		contentPane.add(lblNewLabel_1_2_1_4);

		JLabel lblNewLabel_1_2_1_3 = new JLabel("");
		lblNewLabel_1_2_1_3.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-soldier-64 (1).png"));
		lblNewLabel_1_2_1_3.setBounds(1523, 11, 58, 105);
		contentPane.add(lblNewLabel_1_2_1_3);

		JLabel lblNewLabel_1_2_1_2 = new JLabel("");
		lblNewLabel_1_2_1_2.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-soldier-64.png"));
		lblNewLabel_1_2_1_2.setBounds(20, -13, 58, 105);
		contentPane.add(lblNewLabel_1_2_1_2);

		JLabel lblNewLabel_1_2_1_1 = new JLabel("");
		lblNewLabel_1_2_1_1.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-soldiers-100.png"));
		lblNewLabel_1_2_1_1.setBounds(359, 172, 118, 105);
		contentPane.add(lblNewLabel_1_2_1_1);

		txtPromedio = new JTextField();
		txtPromedio.setFont(new Font("Monospaced", Font.BOLD, 14));
		txtPromedio.setHorizontalAlignment(SwingConstants.CENTER);
		txtPromedio.setColumns(10);
		txtPromedio.setBackground(new Color(238, 232, 170));
		txtPromedio.setBounds(1422, 781, 176, 61);
		contentPane.add(txtPromedio);

		JButton btnPromedio = new JButton("Promedio");
		btnPromedio.setIcon(new ImageIcon(
				"C:\\Users\\carle\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-nota-64.png"));
		btnPromedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String promedio;
				int puntaje = Integer.parseInt(txtPuntaje.getText());

				if (puntaje <= 100) {
					promedio = "Rendimiento bajo";
					txtPromedio.setText(promedio);
				} else if (puntaje > 100 && puntaje <= 200) {
					promedio = "Rendimiento intermedio";
					txtPromedio.setText(promedio);
				} else if (puntaje > 200) {
					promedio = "Rendimiento destacado";
					txtPromedio.setText(promedio);
				}

			}
		});
		btnPromedio.setFont(new Font("Monospaced", Font.BOLD, 18));
		btnPromedio.setBackground(new Color(245, 222, 179));
		btnPromedio.setBounds(1408, 703, 197, 72);
		contentPane.add(btnPromedio);

		JLabel lblNewLabel_1_2_3 = new JLabel("");
		lblNewLabel_1_2_3.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-torre-64.png"));
		lblNewLabel_1_2_3.setBounds(887, 781, 74, 105);
		contentPane.add(lblNewLabel_1_2_3);

		JLabel lblNewLabel_1_2_2 = new JLabel("");
		lblNewLabel_1_2_2.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-army-100.png"));
		lblNewLabel_1_2_2.setBounds(1344, 288, 92, 105);
		contentPane.add(lblNewLabel_1_2_2);

		JLabel lblNewLabel_1_2_1 = new JLabel("");
		lblNewLabel_1_2_1.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-lacayo-50.png"));
		lblNewLabel_1_2_1.setBounds(451, 398, 58, 105);
		contentPane.add(lblNewLabel_1_2_1);

		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-torre-96.png"));
		lblNewLabel_1_2.setBounds(1496, 288, 92, 105);
		contentPane.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-greek-helmet-100.png"));
		lblNewLabel_1_1.setBounds(426, 545, 92, 105);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-base-del-pilar-griego-64.png"));
		lblNewLabel_1.setBounds(1238, 11, 64, 105);
		contentPane.add(lblNewLabel_1);

		JLabel lblSelecione = new JLabel("Seleccione");
		lblSelecione.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\ProjectDemo\\src\\com\\projec\\img\\hand-right-solid-24.png"));
		lblSelecione.setFont(new Font("Monospaced", Font.BOLD, 40));
		lblSelecione.setBounds(10, 115, 290, 61);
		contentPane.add(lblSelecione);

		JLabel lblBienvenidoAlNivel = new JLabel("BIENVENIDO AL MUNDO UNIVERSAL");
		lblBienvenidoAlNivel.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenidoAlNivel.setFont(new Font("Monospaced", Font.BOLD, 40));
		lblBienvenidoAlNivel.setBounds(10, 0, 1624, 61);
		contentPane.add(lblBienvenidoAlNivel);

		JLabel lblDescripcionNivel = new JLabel("DESCRIPCION: Preguntas de Historia Universal");
		lblDescripcionNivel.setFont(new Font("Monospaced", Font.BOLD, 40));
		lblDescripcionNivel.setBounds(10, 56, 1075, 61);
		contentPane.add(lblDescripcionNivel);

		JLabel lblTemaElegido = new JLabel("Tema elegido");
		lblTemaElegido.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-seleccionar-todo-64.png"));
		lblTemaElegido.setFont(new Font("Monospaced", Font.BOLD, 40));
		lblTemaElegido.setBounds(10, 172, 360, 61);
		contentPane.add(lblTemaElegido);

		txtElegido = new JTextField();
		txtElegido.setFont(new Font("Monospaced", Font.BOLD, 40));
		txtElegido.setBackground(new Color(245, 222, 179));
		txtElegido.setBounds(459, 183, 785, 50);
		contentPane.add(txtElegido);
		txtElegido.setColumns(10);

		JLabel lblPregunta1 = new JLabel("Pregunta 1 ");
		lblPregunta1.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-ayuda-64.png"));
		lblPregunta1.setFont(new Font("Monospaced", Font.BOLD, 20));
		lblPregunta1.setBounds(10, 244, 222, 61);
		contentPane.add(lblPregunta1);

		JTextPane txtPreguntaone = new JTextPane();
		txtPreguntaone.setBackground(new Color(245, 222, 179));
		txtPreguntaone.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtPreguntaone.setBounds(10, 288, 563, 91);
		contentPane.add(txtPreguntaone);

		JRadioButton rb1 = new JRadioButton("Alternativa 1");
		rb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String elijio;

				elijio = rb1.getText();
				txtRpta1.setText(elijio);

			}
		});
		rb1.setHorizontalAlignment(SwingConstants.CENTER);
		rb1.setBackground(new Color(245, 222, 179));
		rb1.setFont(new Font("Monospaced", Font.BOLD, 12));
		rb1.setBounds(10, 386, 360, 50);
		contentPane.add(rb1);

		JRadioButton rb2 = new JRadioButton("Alternativa 2");
		rb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String elijio;

				elijio = rb2.getText();
				txtRpta1.setText(elijio);
			}
		});
		rb2.setHorizontalAlignment(SwingConstants.CENTER);
		rb2.setBackground(new Color(245, 222, 179));
		rb2.setFont(new Font("Monospaced", Font.BOLD, 12));
		rb2.setBounds(10, 439, 360, 50);
		contentPane.add(rb2);

		JRadioButton rb3 = new JRadioButton("Alternativa 3");
		rb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String elijio;

				elijio = rb3.getText();
				txtRpta1.setText(elijio);
			}
		});
		rb3.setHorizontalAlignment(SwingConstants.CENTER);
		rb3.setBackground(new Color(245, 222, 179));
		rb3.setFont(new Font("Monospaced", Font.BOLD, 12));
		rb3.setBounds(10, 492, 360, 50);
		contentPane.add(rb3);

		JRadioButton rb4 = new JRadioButton("Alternatica 4");
		rb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String elijio;

				elijio = rb4.getText();
				txtRpta1.setText(elijio);
			}
		});
		rb4.setHorizontalAlignment(SwingConstants.CENTER);
		rb4.setBackground(new Color(245, 222, 179));
		rb4.setFont(new Font("Monospaced", Font.BOLD, 12));
		rb4.setBounds(10, 545, 360, 50);
		contentPane.add(rb4);

		JLabel lblPregunta = new JLabel("Pregunta 2");
		lblPregunta.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-pregunta-64.png"));
		lblPregunta.setFont(new Font("Monospaced", Font.BOLD, 20));
		lblPregunta.setBounds(599, 244, 222, 61);
		contentPane.add(lblPregunta);

		JTextPane txtPreguntatwo = new JTextPane();
		txtPreguntatwo.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtPreguntatwo.setBackground(new Color(245, 222, 179));
		txtPreguntatwo.setBounds(597, 288, 716, 91);
		contentPane.add(txtPreguntatwo);

		JRadioButton rb5 = new JRadioButton("Alternativa 1");
		rb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String elijio;

				elijio = rb5.getText();
				txtRpta2.setText(elijio);
			}
		});
		rb5.setHorizontalAlignment(SwingConstants.CENTER);
		rb5.setBackground(new Color(245, 222, 179));
		rb5.setFont(new Font("Monospaced", Font.BOLD, 12));
		rb5.setBounds(597, 387, 360, 49);
		contentPane.add(rb5);

		JRadioButton rb6 = new JRadioButton("Alternativa 2");
		rb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String elijio;

				elijio = rb6.getText();
				txtRpta2.setText(elijio);
			}
		});
		rb6.setHorizontalAlignment(SwingConstants.CENTER);
		rb6.setBackground(new Color(245, 222, 179));
		rb6.setFont(new Font("Monospaced", Font.BOLD, 12));
		rb6.setBounds(599, 440, 360, 49);
		contentPane.add(rb6);

		JRadioButton rb7 = new JRadioButton("Alternativa 3");
		rb7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String elijio;

				elijio = rb7.getText();
				txtRpta2.setText(elijio);
			}
		});
		rb7.setHorizontalAlignment(SwingConstants.CENTER);
		rb7.setBackground(new Color(245, 222, 179));
		rb7.setFont(new Font("Monospaced", Font.BOLD, 12));
		rb7.setBounds(599, 493, 360, 49);
		contentPane.add(rb7);

		JRadioButton rb8 = new JRadioButton("Alternativa 4");
		rb8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String elijio;

				elijio = rb8.getText();
				txtRpta2.setText(elijio);
			}
		});
		rb8.setHorizontalAlignment(SwingConstants.CENTER);
		rb8.setBackground(new Color(245, 222, 179));
		rb8.setFont(new Font("Monospaced", Font.BOLD, 12));
		rb8.setBounds(597, 545, 360, 50);
		contentPane.add(rb8);

		JLabel lblPregunta_1 = new JLabel("Pregunta 3");
		lblPregunta_1.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-pregunta-64 (1).png"));
		lblPregunta_1.setFont(new Font("Monospaced", Font.BOLD, 20));
		lblPregunta_1.setBounds(10, 627, 188, 60);
		contentPane.add(lblPregunta_1);

		JTextPane txtPreguntatree = new JTextPane();
		txtPreguntatree.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtPreguntatree.setBackground(new Color(245, 222, 179));
		txtPreguntatree.setBounds(10, 687, 855, 60);
		contentPane.add(txtPreguntatree);

		JRadioButton rb9 = new JRadioButton("Alternativa 1");
		rb9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String elijio;

				elijio = rb9.getText();
				txtRpta3.setText(elijio);
			}
		});
		rb9.setHorizontalAlignment(SwingConstants.CENTER);
		rb9.setBackground(new Color(245, 222, 179));
		rb9.setFont(new Font("Monospaced", Font.BOLD, 12));
		rb9.setBounds(10, 754, 387, 43);
		contentPane.add(rb9);

		JRadioButton rb10 = new JRadioButton("Alternativa 2");
		rb10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String elijio;

				elijio = rb10.getText();
				txtRpta3.setText(elijio);
			}
		});
		rb10.setHorizontalAlignment(SwingConstants.CENTER);
		rb10.setBackground(new Color(245, 222, 179));
		rb10.setFont(new Font("Monospaced", Font.BOLD, 12));
		rb10.setBounds(10, 800, 387, 43);
		contentPane.add(rb10);

		JRadioButton rb11 = new JRadioButton("Alternativa 3");
		rb11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String elijio;

				elijio = rb11.getText();
				txtRpta3.setText(elijio);
			}
		});
		rb11.setHorizontalAlignment(SwingConstants.CENTER);
		rb11.setBackground(new Color(245, 222, 179));
		rb11.setFont(new Font("Monospaced", Font.BOLD, 12));
		rb11.setBounds(426, 754, 387, 43);
		contentPane.add(rb11);

		JRadioButton rb12 = new JRadioButton("Alternativa 4");
		rb12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String elijio;

				elijio = rb12.getText();
				txtRpta3.setText(elijio);
			}
		});
		rb12.setHorizontalAlignment(SwingConstants.CENTER);
		rb12.setBackground(new Color(245, 222, 179));
		rb12.setFont(new Font("Monospaced", Font.BOLD, 12));
		rb12.setBounds(426, 800, 387, 43);
		contentPane.add(rb12);

		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(245, 222, 179));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String tema = comboBox.getSelectedItem().toString();
				txtElegido.setText(tema);

				String p1, p2, p3, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12;

				if (tema.equalsIgnoreCase("LA GUERRA FRIA")) {

					p1 = "¿Cual fue el acuerdo firmado por el bloque sovietico para contrarrestar a la OTAN?";
					p2 = "¿La desestanilizacion de la URSS fue una politica llevada a cabo por?";
					p3 = "¿En el contexto de la Guerra Fria, el tratado de Roma de 1957 permitio?";

					txtPreguntaone.setText(p1);
					txtPreguntatwo.setText(p2);
					txtPreguntatree.setText(p3);

					if (p1.equalsIgnoreCase(
							"¿Cual fue el acuerdo firmado por el bloque sovietico para contrarrestar a la OTAN?")) {
						r1 = "El plan Dodge";
						r2 = "El plan Marshall";
						r3 = "El pacto de Acero";
						r4 = "El pacto de Varsovia";
						// r4
						rb4.setText(r4);
						rb3.setText(r3);
						rb2.setText(r2);
						rb1.setText(r1);

						GrupoRadio(rb4, rb2, rb3, rb1);

					}
					if (p2.equalsIgnoreCase("¿La desestanilizacion de la URSS fue una politica llevada a cabo por?")) {
						r5 = "Nikita Kruschev";
						r6 = "Leonid Brezhnev";
						r7 = "Lenis";
						r8 = "Boris Yeltsin";
						// r5
						rb5.setText(r5);
						rb6.setText(r6);
						rb7.setText(r7);
						rb8.setText(r8);

						GrupoRadio(rb5, rb6, rb7, rb8);

					}
					if (p3.equalsIgnoreCase(
							"¿En el contexto de la Guerra Fria, el tratado de Roma de 1957 permitio?")) {
						r9 = "Poner fin a la guerra de Corea";
						r10 = "La constuccion del muro de Berlin";
						r11 = "El surguimiento de la comunidad Economica Europea";
						r12 = "El nacimiento de la RFA";
						// r11
						rb9.setText(r9);
						rb10.setText(r10);
						rb11.setText(r11);
						rb12.setText(r12);

						GrupoRadio(rb12, rb11, rb10, rb9);

					}

				} else if (tema.equalsIgnoreCase("LA PRIMERA GUERRA MUNDIAL")) {
					p1 = "¿Durante la Primera Guerra Mundial, Francia, Rusia e Inglaterra formaron un bloque denominado?";
					p2 = "¿El acontencimiento que determino el ingreso a los EE.UU de N.A a la Primera Guerra Mundial fue?";
					p3 = "¿Con el tratado de Versalles(1919), se debilito territorial, economica y militarmente a?";

					txtPreguntaone.setText(p1);
					txtPreguntatwo.setText(p2);
					txtPreguntatree.setText(p3);

					if (p1.equalsIgnoreCase(
							"¿Durante la Primera Guerra Mundial, Francia, Rusia e Inglaterra formaron un bloque denominado?")) {
						r1 = "Triple Alianza";
						r2 = "El eje";
						r3 = "Triple Entente";
						r4 = "Los Aliados";
						// r3
						rb4.setText(r4);
						rb3.setText(r3);
						rb2.setText(r2);
						rb1.setText(r1);

						GrupoRadio(rb4, rb2, rb3, rb1);

					}
					if (p2.equalsIgnoreCase(
							"¿El acontencimiento que determino el ingreso a los EE.UU de N.A a la Primera Guerra Mundial fue?")) {
						r5 = "El hundimiento del RMS Lusitania";
						r6 = "La invasion a España";
						r7 = "La invasion a Francia";
						r8 = "El ataque a Lusitania y Francia";
						// r5
						rb5.setText(r5);
						rb6.setText(r6);
						rb7.setText(r7);
						rb8.setText(r8);

						GrupoRadio(rb5, rb6, rb7, rb8);

					}
					if (p3.equalsIgnoreCase(
							"¿Con el tratado de Versalles(1919), se debilito territorial, economica y militarmente a?")) {
						r9 = "Italia";
						r10 = "Alemania";
						r11 = "Austria";
						r12 = "Bulgaria";
						// r10
						rb9.setText(r9);
						rb10.setText(r10);
						rb11.setText(r11);
						rb12.setText(r12);

						GrupoRadio(rb12, rb11, rb10, rb9);
					}

				} else if (tema.equalsIgnoreCase("LA SEGUNDA GUERRA MUNDIAL")) {
					p1 = "¿Estados Unidos ingreso a la Segunda Guerra Mundial debido?";
					p2 = "¿En la siguiente relacion de enfrentamientos belicos de la segunda Guerra Mundial, señale el que termino en una derrota para Alemania?";
					p3 = "¿La justificacion fundamental de la Alemania nazi para desencadenar la Segunda Guerra Mundial fue?";

					txtPreguntaone.setText(p1);
					txtPreguntatwo.setText(p2);
					txtPreguntatree.setText(p3);

					if (p1.equalsIgnoreCase("¿Estados Unidos ingreso a la Segunda Guerra Mundial debido?")) {
						r1 = "A la invasion nazi en la URSS";
						r2 = "Al ataque japones a Peark Harbox";
						r3 = "Al hundimiento del buque Lusitania";
						r4 = "Al inicio de la Revolucion china";
						// r2
						rb4.setText(r4);
						rb3.setText(r3);
						rb2.setText(r2);
						rb1.setText(r1);
						GrupoRadio(rb4, rb2, rb3, rb1);

					}
					if (p2.equalsIgnoreCase(
							"¿En la siguiente relacion de enfrentamientos belicos de la segunda Guerra Mundial, señale el que termino en una derrota para Alemania?")) {
						r5 = "El milagro de Dunkerque";
						r6 = "La batalla de Midway";
						r7 = "La batalla de Stalingrado";
						r8 = "La operacion Rat";
						// r7
						rb5.setText(r5);
						rb6.setText(r6);
						rb7.setText(r7);
						rb8.setText(r8);

						GrupoRadio(rb5, rb6, rb7, rb8);

					}
					if (p3.equalsIgnoreCase(
							"¿La justificacion fundamental de la Alemania nazi para desencadenar la Segunda Guerra Mundial fue?")) {
						r9 = "El revanchismo de los judios";
						r10 = "La persecucion de los judios";
						r11 = "La superioridad de los paises arios";
						r12 = "La conquista del espacio vital";

						// r12

						rb9.setText(r9);
						rb10.setText(r10);
						rb11.setText(r11);
						rb12.setText(r12);

						GrupoRadio(rb12, rb11, rb10, rb9);

					}

				} /*
					 * else if (tema.equalsIgnoreCase("GOBIERNO DE ALBERTO FUJIMORI")) { p1 =
					 * "¿Fujimori establecio en el Peru el?"; p2 =
					 * "¿Durante el gobierno de Alberto Fujimori(1990 - 2000) se realizo una reforma laboral, que significo?"
					 * ; p3 =
					 * "¿La frase que ilustra la propuesta del candidato presidencial Alberto Fujimori, en las elecciones de 1990, fue?"
					 * ;
					 * 
					 * txtPreguntaone.setText(p1); txtPreguntatwo.setText(p2);
					 * txtPreguntatree.setText(p3);
					 * 
					 * }
					 */

			}
		});
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "", "LA GUERRA FRIA", "LA PRIMERA GUERRA MUNDIAL", "LA SEGUNDA GUERRA MUNDIAL" }));
		comboBox.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 40));
		comboBox.setBounds(459, 115, 785, 61);
		contentPane.add(comboBox);

		JLabel lblRpta1 = new JLabel("Respuesta 1");
		lblRpta1.setHorizontalAlignment(SwingConstants.LEFT);
		lblRpta1.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-respuesta-64.png"));
		lblRpta1.setFont(new Font("Monospaced", Font.BOLD, 16));
		lblRpta1.setBounds(1016, 389, 198, 43);
		contentPane.add(lblRpta1);

		JLabel lblRespuesta2 = new JLabel("Respuesta 2");
		lblRespuesta2.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-respuesta-64 (2).png"));
		lblRespuesta2.setFont(new Font("Monospaced", Font.BOLD, 16));
		lblRespuesta2.setBounds(1016, 443, 188, 43);
		contentPane.add(lblRespuesta2);

		JLabel lblRespuesta3 = new JLabel("Respuesta 3");
		lblRespuesta3.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-respuesta-64 (1).png"));
		lblRespuesta3.setFont(new Font("Monospaced", Font.BOLD, 16));
		lblRespuesta3.setBounds(1016, 495, 188, 43);
		contentPane.add(lblRespuesta3);

		txtRpta1 = new JTextField();
		txtRpta1.setHorizontalAlignment(SwingConstants.CENTER);
		txtRpta1.setFont(new Font("Monospaced", Font.BOLD, 12));
		txtRpta1.setBackground(new Color(238, 232, 170));
		txtRpta1.setBounds(1224, 395, 394, 33);
		contentPane.add(txtRpta1);
		txtRpta1.setColumns(10);

		txtRpta2 = new JTextField();
		txtRpta2.setHorizontalAlignment(SwingConstants.CENTER);
		txtRpta2.setFont(new Font("Monospaced", Font.BOLD, 12));
		txtRpta2.setBackground(new Color(238, 232, 170));
		txtRpta2.setColumns(10);
		txtRpta2.setBounds(1224, 448, 394, 33);
		contentPane.add(txtRpta2);

		txtRpta3 = new JTextField();
		txtRpta3.setHorizontalAlignment(SwingConstants.CENTER);
		txtRpta3.setFont(new Font("Monospaced", Font.BOLD, 12));
		txtRpta3.setBackground(new Color(238, 232, 170));
		txtRpta3.setColumns(10);
		txtRpta3.setBounds(1224, 501, 394, 33);
		contentPane.add(txtRpta3);

		txtCalificacion = new JTextField();
		txtCalificacion.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtCalificacion.setHorizontalAlignment(SwingConstants.CENTER);
		txtCalificacion.setBackground(new Color(238, 232, 170));
		txtCalificacion.setBounds(1224, 545, 132, 50);
		contentPane.add(txtCalificacion);
		txtCalificacion.setColumns(10);

		JButton btnEvaluarPt1 = new JButton("Evaluar Pregunta 1");
		btnEvaluarPt1.setIcon(new ImageIcon(
				"C:\\Users\\carle\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-pulgar-para-arriba-64 (1).png"));
		btnEvaluarPt1.setBackground(new Color(245, 222, 179));
		btnEvaluarPt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int calificacion = 0;
				String Rp1 = txtRpta1.getText();
				String Rp1_1 = txtRpta1.getText();
				String Rp1_2 = txtRpta1.getText();

				try {

					if (Rp1.equalsIgnoreCase("El pacto de Varsovia")) {

						calificacion = 100;

					}

					else if (Rp1_1.equalsIgnoreCase("Triple Entente")) {
						calificacion = 200;

					} else if (Rp1_2.equalsIgnoreCase("Al ataque japones a Peark Harbox")) {
						calificacion = 300;
					}

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Error");
				}

				txtCalificacion.setText(String.valueOf(calificacion));
			}
		});
		btnEvaluarPt1.setFont(new Font("Monospaced", Font.BOLD, 18));
		btnEvaluarPt1.setBounds(1300, 115, 324, 49);
		contentPane.add(btnEvaluarPt1);

		JLabel lblCalificacion = new JLabel("Calificacion 1");
		lblCalificacion.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-calificación-64 (1).png"));
		lblCalificacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalificacion.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblCalificacion.setBounds(963, 549, 237, 51);
		contentPane.add(lblCalificacion);

		JButton btnEvasluarp2 = new JButton("Evaluar Pregunta 2");
		btnEvasluarp2.setIcon(new ImageIcon(
				"C:\\Users\\carle\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-pulgar-para-arriba-64 (2).png"));
		btnEvasluarp2.setBackground(new Color(245, 222, 179));
		btnEvasluarp2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int calificacion = 0;
				String Rp2 = txtRpta2.getText();
				String Rp2_1 = txtRpta2.getText();
				String Rp2_2 = txtRpta2.getText();

				try {

					if (Rp2.equalsIgnoreCase("Nikita Kruschev")) {

						calificacion = 100;

					}

					else if (Rp2_1.equalsIgnoreCase("El hundimiento del RMS Lusitania")) {
						calificacion = 200;

					} else if (Rp2_2.equalsIgnoreCase("La batalla de Stalingrado")) {

						calificacion = 300;
					}

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Error");
				}

				txtCaf2.setText(String.valueOf(calificacion));

			}
		});
		btnEvasluarp2.setFont(new Font("Monospaced", Font.BOLD, 18));
		btnEvasluarp2.setBounds(1300, 172, 324, 49);
		contentPane.add(btnEvasluarp2);

		JButton btnEvaluarp3 = new JButton("Evaluar Pregunta 3");
		btnEvaluarp3.setIcon(new ImageIcon(
				"C:\\Users\\carle\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-pulgar-para-arriba-64 (1).png"));
		btnEvaluarp3.setBackground(new Color(245, 222, 179));
		btnEvaluarp3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int calificacion = 0;
				String Rp3 = txtRpta3.getText();
				String Rp3_1 = txtRpta3.getText();
				String Rp3_2 = txtRpta3.getText();

				try {

					if (Rp3.equalsIgnoreCase("El surguimiento de la comunidad Economica Europea")) {

						calificacion = 100;

					} else if (Rp3_1.equalsIgnoreCase("Alemania")) {
						calificacion = 200;

					} else if (Rp3_2.equalsIgnoreCase("La conquista del espacio vital")) {
						calificacion = 300;
					}

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Error");
				}
				txtCaf3.setText(String.valueOf(calificacion));

			}
		});
		btnEvaluarp3.setFont(new Font("Monospaced", Font.BOLD, 18));
		btnEvaluarp3.setBounds(1300, 228, 324, 49);
		contentPane.add(btnEvaluarp3);

		JButton btnPuntaje = new JButton("Puntaje");
		btnPuntaje.setIcon(new ImageIcon(
				"C:\\Users\\carle\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-score-64.png"));
		btnPuntaje.setBackground(new Color(245, 222, 179));
		btnPuntaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int a, b, c, puntaje;

				a = Integer.parseInt(txtCalificacion.getText());
				b = Integer.parseInt(txtCaf2.getText());
				c = Integer.parseInt(txtCaf3.getText());

				puntaje = a + b + c;

				txtPuntaje.setText(String.valueOf(puntaje));

			}
		});
		btnPuntaje.setFont(new Font("Monospaced", Font.BOLD, 18));
		btnPuntaje.setBounds(1408, 545, 198, 73);
		contentPane.add(btnPuntaje);

		JLabel lblCalificacion_3 = new JLabel("Calificacion 2");
		lblCalificacion_3.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-calificación-64.png"));
		lblCalificacion_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalificacion_3.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblCalificacion_3.setBounds(963, 605, 237, 51);
		contentPane.add(lblCalificacion_3);

		JLabel lblCalificacion_1 = new JLabel("Calificacion 3");
		lblCalificacion_1.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\cal.png"));
		lblCalificacion_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalificacion_1.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblCalificacion_1.setBounds(963, 660, 237, 51);
		contentPane.add(lblCalificacion_1);

		txtCaf2 = new JTextField();
		txtCaf2.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtCaf2.setHorizontalAlignment(SwingConstants.CENTER);
		txtCaf2.setBackground(new Color(238, 232, 170));
		txtCaf2.setColumns(10);
		txtCaf2.setBounds(1224, 606, 132, 50);
		contentPane.add(txtCaf2);

		txtCaf3 = new JTextField();
		txtCaf3.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtCaf3.setHorizontalAlignment(SwingConstants.CENTER);
		txtCaf3.setBackground(new Color(238, 232, 170));
		txtCaf3.setColumns(10);
		txtCaf3.setBounds(1224, 661, 132, 50);
		contentPane.add(txtCaf3);

		txtPuntaje = new JTextField();
		txtPuntaje.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtPuntaje.setHorizontalAlignment(SwingConstants.CENTER);
		txtPuntaje.setBackground(new Color(238, 232, 170));
		txtPuntaje.setColumns(10);
		txtPuntaje.setBounds(1438, 639, 132, 50);
		contentPane.add(txtPuntaje);

		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setIcon(new ImageIcon(
				"C:\\Users\\carle\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-toallitas-50.png"));
		btnLimpiar.setBackground(new Color(245, 222, 179));
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Limpiar();
			}
		});
		btnLimpiar.setFont(new Font("Monospaced", Font.BOLD, 18));
		btnLimpiar.setBounds(1092, 726, 198, 49);
		contentPane.add(btnLimpiar);

		JButton btnRegrsar = new JButton("Volver al menu  principal");
		btnRegrsar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Men P = new Men();
				P.setVisible(true);
				P.setLocationRelativeTo(null);

			}
		});
		btnRegrsar.setIcon(new ImageIcon(
				"C:\\Users\\carle\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\icons8-volver-64.png"));
		btnRegrsar.setFont(new Font("Monospaced", Font.BOLD, 18));
		btnRegrsar.setBackground(new Color(245, 222, 179));
		btnRegrsar.setBounds(993, 784, 408, 49);
		contentPane.add(btnRegrsar);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USUARIO\\eclipse-workspace\\ProyectoHistoria\\src\\com\\project\\img\\img\\Presentación Historia Aesthetic Beige Pastel (5).jpg"));
		lblNewLabel.setBounds(-10, 11, 1634, 861);
		contentPane.add(lblNewLabel);

	}

}
