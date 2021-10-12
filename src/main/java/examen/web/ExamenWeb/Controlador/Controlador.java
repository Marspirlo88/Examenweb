
package examen.web.ExamenWeb.Controlador;

import examen.web.ExamenWeb.Instancias.UsuarioImp;
import examen.web.ExamenWeb.Usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Controlador {
  @Autowired
private UsuarioImp usuarioImp;
@GetMapping("/registro")
public String registros (Model model){
var registros = usuarioImp.listausu();
model.addAttribute("registros" ,registros);
    
return "index";
}
@PostMapping("/agregar")
public String agregar(Usuario usuario){
  usuarioImp.guardarusu(usuario);
  return "index";

}
@GetMapping("/formulario")
public String formulario (Usuario usuario){
return "Registro";
}
@GetMapping("/editar/{idusuario}")
public String editar(Usuario usuario , Model model){
    var editar = usuarioImp.encontrarusu(usuario);
    model.addAttribute("usuario", editar);
    
return "Registro";
}
@GetMapping("/eliminar/{idusuario}")

public String eliminar(Usuario usuario){
usuarioImp.eliminarusu(usuario);
return "index";
}

  
  
}
