package zig.mairie.DeclararationMariage.entite;

import java.util.Collection;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Table(name = "epoux")
@Entity
public class Epoux {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEpouse;
	private String nom;
	private String prenom;
	private String nationalite;
	private String typePiece;
	private String numeroPiece;
	private String Adresse;
	private Date dateNaissance;
	private String lieuNaissance;
	
	
	@OneToMany(mappedBy = "epoux")
	private Collection<DeclarationMariage> declarationMariages;
}
