package zig.mairie.DeclararationMariage.services;

import java.util.List;

import zig.mairie.DeclararationMariage.entite.Epouse;

public interface IEpouseService {
	public Epouse save(Epouse epouse);
	public List<Epouse> list();
	
	public String remove(Long id);
	
	public Epouse search(Long id);
	
	public String update(Long id,Epouse epouse);
}
