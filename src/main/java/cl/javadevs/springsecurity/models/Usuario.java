package cl.javadevs.springsecurity.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Long idUsuario;
    private String username;
    private String pass;

    //EAGER indica que cuando se consulte un usuario, se trae todos los roles que tenga
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name="usuarios_roles",
                joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id_usuario"),
                inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id_role")
    )
    private List<Roles> roles = new ArrayList<>();

}
