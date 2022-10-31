package com.portfolioraulguanca.raul.Controller;

import com.portfolioraulguanca.raul.Entity.Persona;
import com.portfolioraulguanca.raul.Inteface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersona() {
        return ipersonaService.getPersona();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona pers) {
        ipersonaService.savePersona(pers);
        return "La persona fue creada con éxito";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/borrar/{id}") 
    public String deletePersona(@PathVariable Long id) {
        ipersonaService.deletePersona(id);
        return "Se eliminó con éxito la persona";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/persona/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("fechaNac") String nuevoFechaNac,
            @RequestParam("celular") String nuevoCelular,
            @RequestParam("correo") String nuevoCorreo,
            @RequestParam("url_foto") String nuevoUrl_Foto,
            @RequestParam("mainSkill") String nuevoMainSkill,
            @RequestParam("acercaDe") String nuevoAcercaDe){
        Persona pers = ipersonaService.findPersona(id);
        
        pers.setNombre(nuevoNombre);
        pers.setApellido(nuevoApellido);
        pers.setFechaNac(nuevoFechaNac);
        pers.setCelular(nuevoCelular);    
        pers.setCorreo(nuevoCorreo);
        pers.setUrl_foto(nuevoUrl_Foto);
        pers.setMainSkill(nuevoMainSkill);
        pers.setAcercaDe(nuevoAcercaDe);        
        
        ipersonaService.savePersona(pers);
        return pers;
    }
            
}


