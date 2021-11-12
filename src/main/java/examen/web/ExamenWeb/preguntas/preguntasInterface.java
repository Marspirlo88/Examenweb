/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.web.ExamenWeb.preguntas;

import java.util.List;

/**
 *
 * @author marco
 */
public interface preguntasInterface {
    
    public void agregarpreguntas(Preguntas preguntas);
    public List<Preguntas> listapregunas();
    public void eliminarpreguntas(Preguntas preguntas);
    public Preguntas encontrarpreguntas(Preguntas preguntas);
}
