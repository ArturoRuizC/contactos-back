package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import interfaces.IContactosDAO;
import interfaces.IContactosJpaDAO;
import model.Contacto;

@Repository
public class ContactoDAO implements IContactosDAO{

	@Autowired
	IContactosJpaDAO contactos;
	
	@Override
	public Contacto consultarContacto(int id) {
		return contactos.findById(id).orElse(null);
	}

	@Override
	public void actualizarContacto(Contacto contacto) {
		contactos.save(contacto);
	}

	@Override
	public void eliminarContacto(int id) {
		contactos.deleteById(id);
	}

	@Override
	public List<Contacto> consultarContactos() {
		return contactos.findAll();
	}

	@Override
	public void agregarContactos(Contacto contacto) {
		contactos.save(contacto);
	}

}
