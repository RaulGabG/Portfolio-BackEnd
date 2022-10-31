/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioraulguanca.raul.Repository;

import com.portfolioraulguanca.raul.Entity.Experiencia_laboral;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperienciaLaboral extends JpaRepository<Experiencia_laboral, Integer> {
    public Optional<Experiencia_laboral> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
}
