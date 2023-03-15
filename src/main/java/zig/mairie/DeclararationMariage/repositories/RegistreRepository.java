package zig.mairie.DeclararationMariage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import zig.mairie.DeclararationMariage.entite.Registre;

@RepositoryRestController
@RepositoryRestResource
public interface RegistreRepository extends JpaRepository<Registre, Long> {

}

