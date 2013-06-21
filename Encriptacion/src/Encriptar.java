import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Encriptar extends JFrame {
	
	JLabel lblingrese, lblMuestraEncrip,lblDesencriptada;
	JTextField txtIngrese,txtMuestra,txtDesencriptada;
	JButton btnEncriptar, btnDesencriptar,btnLimpiar;
	String []palabras = new String[1];

	public Encriptar() {
		// TODO Auto-generated constructor stub
		this.setTitle("Encriptación");
		this.setSize(400,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(500,60);
		
		Botones();
	}
	
	public void Botones(){
		this.setLayout(null);
		
		add(lblingrese = new JLabel("Ingrese la cadena a encriptar:"));
		lblingrese.setBounds(10,20,200,20);
		add(txtIngrese = new JTextField());
		txtIngrese.setBounds(10,50,200,20);
		
		
		add(lblMuestraEncrip = new JLabel("Cadena Encriptada"));
		lblMuestraEncrip.setBounds(10,100,200,20);
		add(txtMuestra = new JTextField());
		txtMuestra.setBounds(10,130,200,20);
		
		
		add(lblDesencriptada = new JLabel("Cadena Desencriptada"));
		lblDesencriptada.setBounds(10,180,200,20);
		add(txtDesencriptada = new JTextField());
		txtDesencriptada.setBounds(10,210,200,20);
		
		
		add(btnEncriptar = new JButton("Encriptar"));
		btnEncriptar.setBounds(250,50,120,20);
		btnEncriptar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				String mensaje = txtIngrese.getText();
				char[]array = mensaje.toCharArray();
				
				for(int i = 0; i<array.length;i++){
					
					array[i]= (char)(array[i] + (char)4);
				}
				
				String encriptado = String.valueOf(array);
				
				txtMuestra.setText(encriptado);
				palabras[0]= txtMuestra.getText();
			}
		});
		
		add(btnDesencriptar = new JButton("Desencriptar"));
		btnDesencriptar.setBounds(250,130,120,20);
		btnDesencriptar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String encriptado = palabras[0];
				
				char[]arrayd = encriptado.toCharArray();
				
				for(int a = 0; a < arrayd.length; a++){
					
					arrayd[a]= (char)(arrayd[a] - (char)4);
				}
				
				String desencriptado = String.valueOf(arrayd);
				
				txtDesencriptada.setText(desencriptado);
			}
		});
			
		add(btnLimpiar = new JButton("Limpiar"));
		btnLimpiar.setBounds(250,210,120,20);
		btnLimpiar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtIngrese.setText(null);
				txtMuestra.setText(null);
				txtDesencriptada.setText(null);
				
				
			}
		});
		
		
	
		
		
		
	}

}
