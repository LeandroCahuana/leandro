package pe.edu.vallegrande.project.repository;

import pe.edu.vallegrande.project.model.Advisor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvisorRepository extends JpaRepository<Advisor, Long> {
    
}
