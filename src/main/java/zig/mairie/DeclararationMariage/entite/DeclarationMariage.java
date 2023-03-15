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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="declarationMariages")
@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class DeclarationMariage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDeclaration;
	
	@ManyToOne
	@JoinColumn(name = "idEpoux")
	private Epoux epoux;
	
	@ManyToOne
	@JoinColumn(name = "idEpouse")
	private Epouse epouse;
	private String regime;
	
	@ManyToOne
	@JoinColumn(name = "idRegistre")
	private Registre registre;
	
	
	@ManyToMany
	@JoinTable(name = "T_Temoin_declarationMariage",
	joinColumns = @JoinColumn(name= "idTemoin"),
	inverseJoinColumns = @JoinColumn(name="idDeclaration"))
	private Collection<Temoin> temoins;
	
	
	
	@ManyToMany
	@JoinTable(name = "T_mention_declarationMariage",
	joinColumns = @JoinColumn(name= "idMention"),
	inverseJoinColumns = @JoinColumn(name="idDeclaration"))
	private Collection<Mention> mentions;
	
	
	private String option;
	private Double montant;
	private String coutume;
	private String declarationMariage;
	private String reference;
	private String scanActe;
	private Date dateModification;
}


