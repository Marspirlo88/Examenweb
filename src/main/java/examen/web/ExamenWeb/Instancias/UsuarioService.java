
package examen.web.ExamenWeb.Instancias;

import examen.web.ExamenWeb.Usuario.Usuario;
import java.util.List;


public interface UsuarioService {
    public List<Usuario> listausu();
    public void guardarusu(Usuario usuario);
    public void eliminarusu(Usuario usuario);
    
    public Usuario encontrarusu(Usuario usuario);
    
    
    
    
}
