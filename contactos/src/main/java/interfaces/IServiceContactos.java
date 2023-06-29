package interfaces;

import java.util.List;

import model.Contacto;

public interface IServiceContactos {

	Contacto obtieneContacto(int id);
	void modificaContacto(Contacto contacto);
	boolean eliminaContacto(int id);
	List<Contacto> listarContactos();
	void ingresaContacto(Contacto contacto);
}