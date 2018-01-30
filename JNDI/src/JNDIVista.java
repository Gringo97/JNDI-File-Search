
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.awt.event.ActionEvent;

public class JNDIVista extends JFrame {

	private JPanel contentPane;
	private JComboBox cbRutas;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;
	private JLabel lbl1;
	private JButton btnBusqueda;
	private Controlador controlador;
	private Modelo modelo;
	private JLabel lbl2;
	private JLabel lbl3;
	
	

	public void setControlador(Controlador controlador) {

		this.controlador = (Controlador) controlador;
	}
	
	
	public void setModelo(Modelo modelo) {
		this.modelo = (Modelo) modelo;
	}

	
	public JNDIVista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		cbRutas = new JComboBox();
		cbRutas.setModel(new DefaultComboBoxModel(new String[] {"file:c:\\Users\\oscar.fuente\\Pictures", "file:c:\\Users\\oscar.fuente\\Documents", "file:c:\\Users\\oscar.fuente\\Desktop"}));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		lbl1 = new JLabel("");
		
		lbl2 = new JLabel("");
		
		lbl3 = new JLabel("");
		
		btnBusqueda = new JButton("Buscar");
		btnBusqueda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controlador.buscarFichero();
				} catch (NamingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JLabel lblDirectorio = new JLabel("Directorio");
		
		JLabel lblFichero = new JLabel("Fichero");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(cbRutas, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(36)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lbl3)
										.addComponent(lbl2)
										.addComponent(lbl1)))
								.addComponent(btnBusqueda)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(57)
							.addComponent(lblDirectorio)
							.addGap(129)
							.addComponent(lblFichero)))
					.addContainerGap(89, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDirectorio)
						.addComponent(lblFichero))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbRutas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl1))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl2))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl3))
					.addPreferredGap(ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
					.addComponent(btnBusqueda)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}


	public JLabel getLbl1() {
		return lbl1;
	}


	public void setLbl1(String lbl1) {
		this.lbl1.setText(lbl1);
	}


	public JLabel getLbl2() {
		return lbl2;
	}


	public void setLbl2(String lbl2) {
		this.lbl2.setText(lbl2);
	}


	public JLabel getLbl3() {
		return lbl3;
	}


	public void setLbl3(String lbl3) {
		this.lbl3.setText(lbl3);
	}


	public JComboBox getCbRutas() {
		return cbRutas;
	}


	public void setCbRutas(JComboBox cbRutas) {
		this.cbRutas = cbRutas;
	}


	public JTextField getTextField_1() {
		return textField_1;
	}


	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}


	public JTextField getTextField_2() {
		return textField_2;
	}


	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}


	public JTextField getTextField() {
		return textField;
	}


	public void setTextField(JTextField textField) {
		this.textField = textField;
	}
	
	
}
