
package examen.web.ExamenWeb.Instancias;

import examen.web.ExamenWeb.Usuario.Usuario;
import examen.web.ExamenWeb.Usuario.UsuarioDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author marco
 */
@Service
public class UsuarioImp implements UsuarioService{

    @Autowired
    private UsuarioDao usuarioDao;
    @Override
    public List<Usuario> listausu() {
     return (List<Usuario>)usuarioDao.findAll();
  
   
    }


    @Override
    public void guardarusu(Usuario usuario) {
        usuarioDao.save(usuario);
    }

    @Override
    public void eliminarusu(Usuario usuario) {
       usuarioDao.delete(usuario);
    }

    @Override
    public Usuario encontrarusu(Usuario usuario) {
       return usuarioDao.findById(usuario.getIdusuario()).orElse(null);
    }
    
}
