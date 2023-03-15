package zig.mairie.DeclararationMariage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import zig.mairie.DeclararationMariage.entite.DeclarationMariage;

@RepositoryRestController
@RepositoryRestResource
public interface DeclarationMariageRepository extends JpaRepository<DeclarationMariage, Long> {
	
}
