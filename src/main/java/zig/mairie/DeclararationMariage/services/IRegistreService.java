package zig.mairie.DeclararationMariage.services;

import java.util.List;

import zig.mairie.DeclararationMariage.entite.Registre;

public interface IRegistreService {
public List<Registre> list();
public Registre save(Registre registre);
	public String remove(Long id);
	
	public Registre search(Long id);
	
	public String update(Long id,Registre registre);
}
