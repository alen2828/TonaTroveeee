package models;
import jakarta.persistence.*;

@Entity
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ciudad;
    private String pais;
    private String codigoPostal;
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Direccion() {
    }

    public Direccion(Long id, String ciudad, String pais, String codigoPostal, String direccion, Usuario usuario) {
        this.id = id;
        this.ciudad = ciudad;
        this.pais = pais;
        this.codigoPostal = codigoPostal;
        this.direccion = direccion;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
}