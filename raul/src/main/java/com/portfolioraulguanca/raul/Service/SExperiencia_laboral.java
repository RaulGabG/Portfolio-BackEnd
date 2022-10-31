/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioraulguanca.raul.Service;

import com.portfolioraulguanca.raul.Entity.Experiencia_laboral;
import com.portfolioraulguanca.raul.Repository.RExperienciaLaboral;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia_laboral {
    @Autowired
    RExperienciaLaboral rExperienciaLaboral;
    

    public List<Experiencia_laboral> list() {
        return rExperienciaLaboral.findAll();
    }
    
    public Optional<Experiencia_laboral> getOne(int id) {
        return rExperienciaLaboral.findById(id);
    }
    
    public Optional<Experiencia_laboral> getByNombreE(String nombreE) {
        return rExperienciaLaboral.findByNombreE(nombreE);
    }
    
    public void save(Experiencia_laboral expe) {
        rExperienciaLaboral.save(expe);
    }
    
    public void delete(int id) {
        rExperienciaLaboral.deleteById(id);
    }
    
    public boolean existById(int id) {
        return rExperienciaLaboral.existsById(id);
    }
    
    public boolean existByNombreE(String nombreE) {
        return rExperienciaLaboral.existsByNombreE(nombreE);
    }
    
}
