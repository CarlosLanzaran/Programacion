package es.studium.tema5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EjVentanaCerrar implements WindowListener{
	
	Frame ventana = new Frame("ventana que se cierra de verdad");
	
	
	public EjVentanaCerrar() {
		
		ventana.setLayout(new FlowLayout());
		ventana.setSize(270,220);
		
		ventana.addWindowListener(this);
		
		ventana.setBackground(Color.gray);
		
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new EjVentanaCerrar();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("La ventana se abrió");		
	}

	@Override
	public void windowClosing(WindowEvent e) {

		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("Se cerró");		
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Se minimizó");		
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Se restarua");		
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("La ventana se activó");		
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("La ventana se desactivó");		
		
	}

}
