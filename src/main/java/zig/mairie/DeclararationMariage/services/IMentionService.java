package zig.mairie.DeclararationMariage.services;

import java.util.List;

import zig.mairie.DeclararationMariage.entite.Mention;


public interface IMentionService {

public Mention save(Mention mention);
	
	public List<Mention> list();
	
	public String remove(Long id);
	
	public Mention search(Long id);
	
	public String update(Long id,Mention mention);
}
