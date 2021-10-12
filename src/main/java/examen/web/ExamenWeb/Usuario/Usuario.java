
package examen.web.ExamenWeb.Usuario;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usuariosexamen")
public class Usuario implements Serializable{
  private static final long SerialVersionUID=1L;  
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY) 
 private  long idusuario;
 // esto es para las validaicones pero falta traer las dependecias
// @NotEmpty
 private String usu;
 private String password;
 private String nombre;
 private String apellido;
 private String escuela;
 private String grado;
 
   
  
}
