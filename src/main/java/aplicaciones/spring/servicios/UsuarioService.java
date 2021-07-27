package aplicaciones.spring.servicios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import aplicaciones.spring.modelo.Usuario;
import aplicaciones.spring.repositorios.IUsuario;
@Service("usuario")
public class UsuarioService {
	@Autowired
	IUsuario IUsuario;	
	public void guardar(Usuario usuario) {		
		IUsuario.save(usuario);
	}
	
	public List<Usuario> listar(){		
		return IUsuario.findAll();
	}
	
	public Usuario buscar(Long id) {
		return IUsuario.findById(id);
	}
	
	public boolean eliminar(Long id) {
		try {
			IUsuario.delete(IUsuario.findById(id));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
