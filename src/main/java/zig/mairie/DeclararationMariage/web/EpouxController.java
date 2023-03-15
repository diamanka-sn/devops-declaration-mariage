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

import zig.mairie.DeclararationMariage.entite.Epoux;
import zig.mairie.DeclararationMariage.repositories.EpouxRepository;
import zig.mairie.DeclararationMariage.services.IEpouxService;

@RestController
@RequestMapping("/epoux")
public class EpouxController {
	
	@Autowired
	IEpouxService epouxService;
	
	@PostMapping("/create")
	public Epoux save(@RequestBody Epoux epoux) {
		return epouxService.save(epoux);
	}
	
	@GetMapping("/read")
	public List<Epoux> liste() {
		return epouxService.liste();
	}
	@DeleteMapping("/delete/{id}")
	public String remove(@PathVariable Long id) {
		return epouxService.remove(id);
	}
	@GetMapping("/research/{id}")
	public Epoux search(@PathVariable Long id) {
		return epouxService.search(id);
	}

}
