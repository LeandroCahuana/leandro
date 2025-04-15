package pe.edu.vallegrande.project.service;

import pe.edu.vallegrande.project.model.Advisor;
import java.util.List;
import java.util.Optional;

public interface AdvisorService {
    
    List<Advisor> findAll();

    Optional<Advisor> findById(Long id);

    Advisor save(Advisor advisor);

    Advisor update(Advisor advisor);
}
