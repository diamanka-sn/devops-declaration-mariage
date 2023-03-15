package zig.mairie.DeclararationMariage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import zig.mairie.DeclararationMariage.entite.Registre;
import zig.mairie.DeclararationMariage.repositories.RegistreRepository;

@Service
@Data
public class RegistreService implements IRegistreService{
	@Autowired
	RegistreRepository registreRepository;

	@Override
	public Registre save(Registre registre) {
		// TODO Auto-generated method stub
		return registreRepository.save(registre);
	}

	@Override
	public List<Registre> list() {
		// TODO Auto-generated method stub
		return registreRepository.findAll();
	}

	@Override
	public String remove(Long id) {
		// TODO Auto-generated method stub
		registreRepository.deleteById(id);
		return "Supression Reussie";
	}

	@Override
	public Registre search(Long id) {
		// TODO Auto-generated method stub
		return registreRepository.findById(id).get();
	}

	@Override
	public String update(Long id, Registre registre) {
		// TODO Auto-generated method stub
		Registre existe = registreRepository.findById(id).get();
		if(existe != null) {
			if(registre.getActive() != null) existe.setActive(registre.getActive());
			if(registre.getAnnee() != null) existe.setAnnee(registre.getAnnee());
			if(registre.getNumero() != null) existe.setNumero(registre.getNumero());
			
			registreRepository.save(existe);
			return "Modification reussie";
 		}
		return "Modification bloquée";
	}

}
