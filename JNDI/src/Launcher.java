
public class Launcher {
	public static void main(String[] args) {
	
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador();
		JNDIVista vista = new JNDIVista();
		
		modelo.setVista(vista);
		vista.setControlador(controlador);
		vista.setModelo(modelo);
		controlador.setModelo(modelo);
		controlador.setVista(vista);
		
		
		vista.setVisible(true);
	}
}
