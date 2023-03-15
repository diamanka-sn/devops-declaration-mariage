package zig.mairie.DeclararationMariage.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import zig.mairie.DeclararationMariage.entite.Registre;
import zig.mairie.DeclararationMariage.services.IRegistreService;

@RestController
@RequestMapping("/registres" )
public class RegistreController {
	@Autowired
	IRegistreService metier;
	
	@PostMapping("/create")
	public Registre save(@RequestBody Registre registre) {
		return metier.save(registre);
	}
	@GetMapping("/read")
	public List<Registre> list() {
		return metier.list();
	}
	@DeleteMapping("/delete/{id}")
	public String remove(@PathVariable Long id) {
		return metier.remove(id);
	}
	@GetMapping("/search/{id}")
	public Registre search(@PathVariable Long id) {
		return metier.search(id);
	}
	@PutMapping("/update/{id}")
	public String update(@PathVariable Long id,@RequestBody Registre registre) {
		return metier.update(id, registre);
	}
}

