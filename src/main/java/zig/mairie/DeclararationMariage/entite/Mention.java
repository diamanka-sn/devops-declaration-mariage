package zig.mairie.DeclararationMariage.entite;

import java.util.Collection;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Table(name = "mentions")
@Entity
public class Mention {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMention;
	private String apposition;
	private String libele;
	private String reference;
	
	@ManyToMany
	@JoinTable(name = "T_mention_declarationMariage",
	joinColumns = @JoinColumn(name= "idMention"),
	inverseJoinColumns = @JoinColumn(name="idDeclaration"))
	private Collection<DeclarationMariage> declarationMariages;
}
