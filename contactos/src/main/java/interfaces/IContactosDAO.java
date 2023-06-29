package interfaces;

import java.util.List;

import model.Contacto;

public interface IContactosDAO {
	
	Contacto consultarContacto(int id);

	void actualizarContacto(Contacto contacto);
	
	void eliminarContacto (int id);
	
	List<Contacto> consultarContactos();
	
	void agregarContactos(Contacto contacto);
}