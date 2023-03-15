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

import zig.mairie.DeclararationMariage.entite.Epouse;
import zig.mairie.DeclararationMariage.services.IEpouseService;

@RestController
@RequestMapping("/epouses" )
public class EpouseController {
	@Autowired
	private IEpouseService epouseService;
	
	@PostMapping("/create")
	public Epouse save( @RequestBody Epouse m) {
		return epouseService.save(m);
	}
	
	@GetMapping("/read")
	public List<Epouse> listMeres() {
		return epouseService.list();
	}
	
	@DeleteMapping("/delete/{id}")
	public String remove(@PathVariable Long id) {
		return epouseService.remove(id);
	}
	@GetMapping("/search/{id}")
	public Epouse search(@PathVariable Long id) {
		return epouseService.search(id);
	}
	@PutMapping("/update/{id}")
	public String update(@PathVariable Long id, @RequestBody Epouse mere) {
		return epouseService.update(id, mere);
	}
	
}
