package zig.mairie.DeclararationMariage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import zig.mairie.DeclararationMariage.entite.Epouse;
import zig.mairie.DeclararationMariage.repositories.EpouseRepository;

@Data
@Service
public class EpouseService implements IEpouseService {
	
	@Autowired
	EpouseRepository epouseRepository;
	
	@Override
	public Epouse save(Epouse epouse) {
		// TODO Auto-generated method stub
		return epouseRepository.save(epouse);
	}

	@Override
	public List<Epouse> list() {
		// TODO Auto-generated method stub
		return epouseRepository.findAll();
	}

	@Override
	public String remove(Long id) {
		// TODO Auto-generated method stub
		epouseRepository.deleteById(id);
		return "Suppression réussie";
	}

	@Override
	public Epouse search(Long id) {
		// TODO Auto-generated method stub
		return epouseRepository.findById(id).get();
	}

	@Override
	public String update(Long id, Epouse epouse) {
		// TODO Auto-generated method stub
		Epouse existe = epouseRepository.findById(id).get();
		
		if(existe != null) {
			if(epouse.getAdresse() != null) existe.setAdresse(epouse.getAdresse());
			if(epouse.getDateNaissance() != null) existe.setDateNaissance(epouse.getDateNaissance());
			if(epouse.getLieuNaissance() != null) existe.setLieuNaissance(epouse.getLieuNaissance());
			if(epouse.getNationalite() != null) existe.setNationalite(epouse.getNationalite());
			if(epouse.getNom() != null) existe.setNom(epouse.getNom());
			if(epouse.getPrenom() != null) existe.setPrenom(epouse.getPrenom());
			if(epouse.getTypePiece() != null) existe.setTypePiece(epouse.getTypePiece());
			if(epouse.getNumeroPiece() != null) existe.setNumeroPiece(epouse.getNumeroPiece());
			
			epouseRepository.save(existe);
			return "Modification reussie";
		}
		return "Modification bloquée";
	

	}

			
}
