package med.voll.api.usuarios;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuariosRepository extends JpaRepository {
    UserDetails findByUsername(String username);
}
