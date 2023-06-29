package interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Contacto;

public interface IContactosJpaDAO extends JpaRepository<Contacto, Integer>{

}
