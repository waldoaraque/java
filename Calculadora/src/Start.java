import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Start {

	private JFrame frmCalculadora;
	private JButton btn_C, btn_Par, btn_Suma, btn_Multiplica, btn_Divide, btn_Resta, btn_Result, 
	btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8,btn_9;
	private JTextField jtf_Contenedor_Data;
	private Float n1, n2, result;
	private String operation;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();  // Ventana de Calculadora
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 450, 300);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		// Pantalla de Calculadora -------------->
		jtf_Contenedor_Data = new JTextField(); 
		jtf_Contenedor_Data.setEditable(false);
		jtf_Contenedor_Data.setBounds(39, 22, 340, 47);
		frmCalculadora.getContentPane().add(jtf_Contenedor_Data);
		jtf_Contenedor_Data.setColumns(10);
		// <--------------------------------------
		
		// Botones de Operaciones ------------------------------>
		btn_C = new JButton("C");  
		btn_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtf_Contenedor_Data.setText("");
				enableBtns();
			}
		});
		btn_C.setBounds(248, 92, 65, 34);
		frmCalculadora.getContentPane().add(btn_C); 
		
		btn_Par = new JButton("Par");
		btn_Par.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				catchOperation("par");
			}
		});
		btn_Par.setBounds(314, 92, 65, 34);
		frmCalculadora.getContentPane().add(btn_Par);
		
		btn_Suma = new JButton("+");
		btn_Suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				catchOperation("+");
			}
		});
		btn_Suma.setBounds(314, 125, 65, 34);
		frmCalculadora.getContentPane().add(btn_Suma);
		
		btn_Resta = new JButton("-");
		btn_Resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				catchOperation("-");
			}
		});
		btn_Resta.setBounds(314, 159, 65, 34);
		frmCalculadora.getContentPane().add(btn_Resta);
		
		btn_Multiplica = new JButton("*");
		btn_Multiplica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				catchOperation("*");
			}
		});
		btn_Multiplica.setBounds(248, 125, 65, 34);
		frmCalculadora.getContentPane().add(btn_Multiplica);
		
		btn_Divide = new JButton("/");
		btn_Divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				catchOperation("/");
			}
		});
		btn_Divide.setBounds(248, 159, 65, 34);
		frmCalculadora.getContentPane().add(btn_Divide);
		// <--------------------------------------
		
		// Botones numéricos  ------------------------------->
		btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtf_Contenedor_Data.setText(jtf_Contenedor_Data.getText()+0);
			}
		});
		btn_0.setBounds(39, 193, 160, 34);
		frmCalculadora.getContentPane().add(btn_0);
		
		btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtf_Contenedor_Data.setText(jtf_Contenedor_Data.getText()+1);
			}
		});
		btn_1.setBounds(39, 159, 54, 34);
		frmCalculadora.getContentPane().add(btn_1);
		
		btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtf_Contenedor_Data.setText(jtf_Contenedor_Data.getText()+2);
			}
		});
		btn_2.setBounds(91, 159, 54, 34);
		frmCalculadora.getContentPane().add(btn_2);
		
		btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtf_Contenedor_Data.setText(jtf_Contenedor_Data.getText()+3);
			}
		});
		btn_3.setBounds(145, 159, 54, 34);
		frmCalculadora.getContentPane().add(btn_3);
		
		btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtf_Contenedor_Data.setText(jtf_Contenedor_Data.getText()+4);
			}
		});
		btn_4.setBounds(39, 125, 54, 34);
		frmCalculadora.getContentPane().add(btn_4);
		
		btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtf_Contenedor_Data.setText(jtf_Contenedor_Data.getText()+5);
			}
		});
		btn_5.setBounds(91, 125, 54, 34);
		frmCalculadora.getContentPane().add(btn_5);
		
		btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtf_Contenedor_Data.setText(jtf_Contenedor_Data.getText()+6);
			}
		});
		btn_6.setBounds(145, 125, 54, 34);
		frmCalculadora.getContentPane().add(btn_6);
		
		btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtf_Contenedor_Data.setText(jtf_Contenedor_Data.getText()+7);
			}
		});
		btn_7.setBounds(39, 92, 54, 34);
		frmCalculadora.getContentPane().add(btn_7);
		
		btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtf_Contenedor_Data.setText(jtf_Contenedor_Data.getText()+8);
			}
		});
		btn_8.setBounds(91, 92, 54, 34);
		frmCalculadora.getContentPane().add(btn_8);
		
		btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtf_Contenedor_Data.setText(jtf_Contenedor_Data.getText()+9);
			}
		});
		btn_9.setBounds(145, 92, 54, 34);
		frmCalculadora.getContentPane().add(btn_9);
		// <--------------------------------------
		
		// Botón de Resultado con Lógica --------------->
		btn_Result = new JButton("=");
		btn_Result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (operation) {
					case "+":
						try { // 2do valor de Suma
							n2 = Float.parseFloat(jtf_Contenedor_Data.getText());
							result = n1 + n2;
							jtf_Contenedor_Data.setText("");
							jtf_Contenedor_Data.setText(result.toString());
							blockBtns();
						} catch (Exception exception) {
							jtf_Contenedor_Data.setText("error");
							blockBtns();
						}
						break;
					case "-":
						try { // 2do valor de Resta
							n2 = Float.parseFloat(jtf_Contenedor_Data.getText());
							result = n1 - n2;
							jtf_Contenedor_Data.setText("");
							jtf_Contenedor_Data.setText(result.toString());
							blockBtns();
						} catch (Exception exception) {
							jtf_Contenedor_Data.setText("error");
							blockBtns();
						}
						break;
					case "*":
						try { // 2do valor de Multiplicación
							n2 = Float.parseFloat(jtf_Contenedor_Data.getText());
							result = n1 * n2;
							jtf_Contenedor_Data.setText("");
							jtf_Contenedor_Data.setText(result.toString());
							blockBtns();
						} catch (Exception exception) {
							jtf_Contenedor_Data.setText("error");
							blockBtns();
						}
						break;
					case "/":
						try { // 2do valor de División
							n2 = Float.parseFloat(jtf_Contenedor_Data.getText());
							if (n2 == 0.0f) {
								jtf_Contenedor_Data.setText("Indeterminación");
								blockBtns();
							} else {
								result = n1 / n2;
								jtf_Contenedor_Data.setText("");
								jtf_Contenedor_Data.setText(result.toString());
								blockBtns();
							}
						} catch (Exception exception) {
							jtf_Contenedor_Data.setText("error");
							blockBtns();
						}
						break;
				}
			}
		});
		btn_Result.setBounds(248, 193, 131, 34);
		frmCalculadora.getContentPane().add(btn_Result);
		// <--------------------------------------
	}
	
	private void catchOperation(String op) {
	/*
	 * Método para capturar con try/catch el 1er valor numérico
	 */
		try {
			n1 = Float.parseFloat(jtf_Contenedor_Data.getText());
			if (op == "par") {
				if (n1 % 2 == 0.0f) {
					jtf_Contenedor_Data.setText("Par");
					blockBtns();
				} else {
					jtf_Contenedor_Data.setText("Impar");
					blockBtns();
				}
			} else {
				operation = op;
				jtf_Contenedor_Data.setText("");	
				blockBtns();
			}
			
		} catch (Exception exception) {
			jtf_Contenedor_Data.setText("error");
			blockBtns();
		}
	}
	
	private void blockBtns() {
	/*
	 * Método para bloquear todos los botones excepto C
	 */
		btn_0.setEnabled(false);
		btn_1.setEnabled(false);
		btn_2.setEnabled(false);
		btn_3.setEnabled(false);
		btn_4.setEnabled(false);
		btn_5.setEnabled(false);
		btn_6.setEnabled(false);
		btn_7.setEnabled(false);
		btn_8.setEnabled(false);
		btn_9.setEnabled(false);
		btn_Suma.setEnabled(false);
		btn_Resta.setEnabled(false);
		btn_Divide.setEnabled(false);
		btn_Multiplica.setEnabled(false);
		btn_Par.setEnabled(false);
		btn_Result.setEnabled(false);
	}
	
	private void enableBtns() {
	/*
	 * Método para habilitar botones 
	 */
		btn_0.setEnabled(true);
		btn_1.setEnabled(true);
		btn_2.setEnabled(true);
		btn_3.setEnabled(true);
		btn_4.setEnabled(true);
		btn_5.setEnabled(true);
		btn_6.setEnabled(true);
		btn_7.setEnabled(true);
		btn_8.setEnabled(true);
		btn_9.setEnabled(true);
		btn_Suma.setEnabled(true);
		btn_Resta.setEnabled(true);
		btn_Divide.setEnabled(true);
		btn_Multiplica.setEnabled(true);
		btn_Par.setEnabled(true);
		btn_Result.setEnabled(true);
	}
}
