package com.portfolioraulguanca.raul.Service;

import com.portfolioraulguanca.raul.Entity.Persona;
import com.portfolioraulguanca.raul.Inteface.IPersonaService;
import com.portfolioraulguanca.raul.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService {
    @Autowired IPersonaRepository ipersonaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona per) {
       ipersonaRepository.save(per);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona pers = ipersonaRepository.findById(id).orElse(null);
        return pers;
    }
    
}
