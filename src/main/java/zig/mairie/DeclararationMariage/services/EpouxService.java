package zig.mairie.DeclararationMariage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import zig.mairie.DeclararationMariage.entite.Epoux;
import zig.mairie.DeclararationMariage.repositories.EpouxRepository;


@Service
@Data
public class EpouxService implements IEpouxService {
	
	@Autowired
	EpouxRepository epouxRepository;

	@Override
	public Epoux save(Epoux epoux) {
		// TODO Auto-generated method stub
		return epouxRepository.save(epoux);
	}

	@Override
	public List<Epoux> liste() {
		// TODO Auto-generated method stub
		return epouxRepository.findAll();
	}

	@Override
	public String remove(Long id) {
		// TODO Auto-generated method stub
		epouxRepository.deleteById(id);
		return "Suprresion Reussie";
	}

	@Override
	public Epoux search(Long id) {
		// TODO Auto-generated method stub
		return epouxRepository.findById(id).get();
	}

	@Override
	public String update(Long id, Epoux epoux) {
		// TODO Auto-generated method stub
		Epoux existe = epouxRepository.findById(id).get();
		
		if(existe != null) {
			if(epoux.getAdresse() != null) existe.setAdresse(epoux.getAdresse());
			if(epoux.getDateNaissance() != null) existe.setDateNaissance(epoux.getDateNaissance());
			if(epoux.getLieuNaissance() != null) existe.setLieuNaissance(epoux.getLieuNaissance());
			if(epoux.getNationalite() != null) existe.setNationalite(epoux.getNationalite());
			if(epoux.getNom() != null) existe.setNom(epoux.getNom()); 
			if(epoux.getPrenom() != null) existe.setPrenom(epoux.getPrenom());
			if(epoux.getNumeroPiece() != null) existe.setNumeroPiece(epoux.getNumeroPiece());
			if(epoux.getTypePiece() != null) existe.setTypePiece(epoux.getTypePiece());
			
			epouxRepository.save(existe);
			return "Modification Echouée";
		}
		
		return "Modification Echouée";
	}

}
