package controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import interfaces.IServiceContactos;
import model.Contacto;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/contactos")
public class ContactosControllador {

	@Autowired
	IServiceContactos servicio;
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Contacto obtenerContacto(@PathVariable("id") int id) {
		return servicio.obtieneContacto(id);
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void modificarContacto(@RequestBody Contacto contacto) {
		servicio.modificaContacto(contacto);
	}

	@DeleteMapping(value = "/{id}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String eliminarContactos(@PathVariable("id") int id) {
		return String.valueOf(servicio.eliminaContacto(id));
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Contacto> contactos() {
		return servicio.listarContactos();
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void nuevoContacto(@RequestBody Contacto contacto) {
		servicio.ingresaContacto(contacto);
	}
}