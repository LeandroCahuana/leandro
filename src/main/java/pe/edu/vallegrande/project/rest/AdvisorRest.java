package pe.edu.vallegrande.project.rest;

import pe.edu.vallegrande.project.model.Advisor;
import pe.edu.vallegrande.project.service.AdvisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/api/advisor")

public class AdvisorRest {
    private final AdvisorService advisorService;

    @Autowired
    public AdvisorRest(AdvisorService advisorService) {
        this.advisorService = advisorService;
    }
    
    @GetMapping
    public List <Advisor> findAll(){
        return advisorService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Advisor> findById(@PathVariable Long id) {
        return advisorService.findById(id);
    }

    @PostMapping("/save")
    public Advisor save(@RequestBody Advisor advisor) {
        return advisorService.save(advisor);
    }

    @PutMapping("/update")
    public Advisor update(@RequestBody Advisor advisor) {
        return advisorService.update(advisor);
    }
}
