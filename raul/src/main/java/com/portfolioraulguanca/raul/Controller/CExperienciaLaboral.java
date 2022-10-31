/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioraulguanca.raul.Controller;


import com.portfolioraulguanca.raul.Dto.dtoExperienciaLaboral;
import com.portfolioraulguanca.raul.Entity.Experiencia_laboral;
import com.portfolioraulguanca.raul.Security.Controller.Mensaje;
import com.portfolioraulguanca.raul.Service.SExperiencia_laboral;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("explab")
@CrossOrigin(origins = "http://localhost:4200")
public class CExperienciaLaboral {
    @Autowired
    SExperiencia_laboral sExperienciaLaboral;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Experiencia_laboral>> list() {
        List<Experiencia_laboral> list = sExperienciaLaboral.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/lista")
    public ResponseEntity<?> create(@RequestBody dtoExperienciaLaboral dtoexp) {
        if(StringUtils.isBlank(dtoexp.getNombreE()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
    }
}
