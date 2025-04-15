package pe.edu.vallegrande.project.service.impl;

import pe.edu.vallegrande.project.model.Advisor;
import pe.edu.vallegrande.project.repository.AdvisorRepository;
import pe.edu.vallegrande.project.service.AdvisorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service

public class AdvisorServiceImpl implements AdvisorService{
    private final AdvisorRepository advisorRepository;

    @Autowired
    public AdvisorServiceImpl(AdvisorRepository advisorRepository) {
        this.advisorRepository = advisorRepository;
    }

    @Override
    public List<Advisor> findAll() {
        log.info("Listando Datos: ");
        return advisorRepository.findAll();
    }

    @Override
    public Optional<Advisor> findById(Long id) {
        log.info("Listando Datos por ID: ");
        return advisorRepository.findById(id);
    }

    @Override
    public Advisor save(Advisor advisor) {
        log.info("Registrondo Datos: " + advisor.toString());
        advisor.setState("A");
        return advisorRepository.save(advisor);
    }

    @Override
    public Advisor update(Advisor advisor) {
        log.info("Editando Datos: " + advisor.toString());
        advisor.setState("A");
        return advisorRepository.save(advisor);
    }
}
