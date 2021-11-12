/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.web.ExamenWeb.preguntas;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author marco
 */
@Service
public class preguntasImplementacio implements preguntasInterface{
    @Autowired
    private preguntasCrud preCrud;

    @Override
    public void agregarpreguntas(Preguntas preguntas) {
      preCrud.save(preguntas);
    }

    @Override
    public List<Preguntas> listapregunas() {
     return (List<Preguntas>) preCrud.findAll();
     }
    
    @Override
    public void eliminarpreguntas(Preguntas preguntas) {
     preCrud.delete(preguntas);
    }

    @Override
    public Preguntas encontrarpreguntas(Preguntas preguntas) {
        return preCrud.findById(preguntas.getIdpreguntas()).orElse(null);
    }
}
