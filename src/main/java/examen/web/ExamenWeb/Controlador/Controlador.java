package examen.web.ExamenWeb.Controlador;

import examen.web.ExamenWeb.Instancias.UsuarioImp;
import examen.web.ExamenWeb.Usuario.Usuario;
import examen.web.ExamenWeb.preguntas.Preguntas;
import examen.web.ExamenWeb.preguntas.preguntasImplementacio;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Controlador {

    @Autowired
   
   private UsuarioImp usuarioImp;
    @Autowired
   private preguntasImplementacio preguntasimp;

    @GetMapping("/registro")
    public String registros(Model model) {
        var registros = usuarioImp.listausu();
        model.addAttribute("registros", registros);

        return "index";
    }

    @PostMapping("/agregar")
    public String agregar(@Valid Usuario usuario, Errors errores) {
        if (errores.hasErrors()) {
            return "Registro";
        }

        usuarioImp.guardarusu(usuario);
        return "index";
    }

    @GetMapping("/formulario")
    public String formulario(Usuario usuario) {
        return "Registro";
    }

    @GetMapping("/editar/{idusuario}")
    public String editar(Usuario usuario, Model model) {
        var editar = usuarioImp.encontrarusu(usuario);
        model.addAttribute("usuario", editar);

        return "Registro";
    }
 
    @GetMapping("/eliminar/{idusuario}")

    public String eliminar(Usuario usuario) {
        usuarioImp.eliminarusu(usuario);
        return "index";
    }
    @GetMapping("/Examen")
public String Examen (){
    return "Examen";
}
@GetMapping("/cuestionario")
public String cuestionario (){
return "Cuestionario";
}
@PostMapping("/agregarpregunta")
public String agregarpregunta(Preguntas preguntas ,Model model){
preguntasimp.agregarpreguntas(preguntas);
var listapreguntas=preguntasimp.listapregunas();
model.addAttribute("listapreguntas",listapreguntas);

return "Examen";
}

@GetMapping("/editarpregunta/{idpreguntas}")
public String editarpregunta(Preguntas preguntas ,Model model){
var editarpreguntas = preguntasimp.encontrarpreguntas(preguntas);
model.addAttribute("editarpreguntas",editarpreguntas);
    
    return "Examen";
}


   


}
