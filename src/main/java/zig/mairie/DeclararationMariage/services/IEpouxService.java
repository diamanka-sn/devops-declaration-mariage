package zig.mairie.DeclararationMariage.services;

import java.util.List;

import zig.mairie.DeclararationMariage.entite.Epoux;


public interface IEpouxService {
	public Epoux save(Epoux epoux);
	public List<Epoux> liste();
	public String remove(Long id);
	public Epoux search(Long id);
	public String update(Long id,Epoux epoux);
}
