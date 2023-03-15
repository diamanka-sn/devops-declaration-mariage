package zig.mairie.DeclararationMariage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import zig.mairie.DeclararationMariage.entite.Epoux;

@RepositoryRestController
@RepositoryRestResource
public interface EpouxRepository extends JpaRepository<Epoux, Long> {

}
