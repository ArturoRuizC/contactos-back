package servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import interfaces.IContactosDAO;
import interfaces.IServiceContactos;
import model.Contacto;

@Service
public class ServiceContactos implements IServiceContactos{

	@Autowired
	IContactosDAO contactosDao;
	
	@Override
	public Contacto obtieneContacto(int id) {
		return contactosDao.consultarContacto(id);
	}

	@Override
	public void modificaContacto(Contacto contacto) {
		contactosDao.actualizarContacto(contacto);
	}

	@Override
	public boolean eliminaContacto(int id) {
		contactosDao.eliminarContacto(id);
		if (contactosDao.consultarContacto(id) == null) {
			return true;
		}
		return false;
	}

	@Override
	public List<Contacto> listarContactos() {
		return contactosDao.consultarContactos();
	}

	@Override
	public void ingresaContacto(Contacto contacto) {
		contactosDao.agregarContactos(contacto);
	}
}
