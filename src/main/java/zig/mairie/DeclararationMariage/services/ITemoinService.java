package zig.mairie.DeclararationMariage.services;

import java.util.List;

import zig.mairie.DeclararationMariage.entite.Epoux;
import zig.mairie.DeclararationMariage.entite.Temoin;


public interface ITemoinService {
	public Temoin save(Temoin temoin);
	public List<Temoin> list();
	public String remove(Long id);
	public Temoin search(Long id);
	public String update(Long id,Temoin p);
}
