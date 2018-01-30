import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Controlador {
	JNDIVista vista;
	Modelo modelo;

	public void setModelo(Modelo modelo) {
		this.modelo = (Modelo) modelo;
	}

	public void setVista(JNDIVista vista) {
		this.vista = (JNDIVista) vista;
	}

	public void buscarFichero() throws NamingException {
		List<String> seleccion = new ArrayList<String>();

		seleccion.add(vista.getCbRutas().getSelectedItem().toString());
		if (vista.getTextField().getText() != null) {
			seleccion.add(vista.getTextField().getText().toString());
		}
		if (vista.getTextField_1().getText() != null) {
			seleccion.add(vista.getTextField_1().getText().toString());
		}
		if (vista.getTextField_2().getText() != null) {
			seleccion.add(vista.getTextField_2().getText().toString());
		}
		// creamos el initial context

		Properties p = new Properties();
		// definimos la clase del driver

		p.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");

		p.put(Context.PROVIDER_URL, seleccion.get(0));
		Context ctx = new InitialContext(p);

		// busca los ficheros dentro del contexto

		for (int i = 1; i < seleccion.size(); i++) {
			try {
				ctx.lookup(seleccion.get(i).toString());
				modelo.setLabelRespuesta(i,true);
				System.out.println(seleccion.get(i).toString() + "  ENCONTRADO!!");
				System.out.println(i);
			} catch (NamingException ex) {
				
				modelo.setLabelRespuesta(i, false);
				System.out.println(seleccion.get(i).toString() + "  NO EXISTE");
			}
		}
	}

}
