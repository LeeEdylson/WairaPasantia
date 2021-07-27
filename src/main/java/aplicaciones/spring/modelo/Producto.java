package aplicaciones.spring.modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.sun.istack.NotNull;
@Entity
@Table(name="PRODUCTOS")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String nombre;
	@NotNull
	private Double peso;
	@NotNull
	private Double unixmed;
	@NotNull
	private String um;
	@NotNull
	private String tmoneda;
	@NotNull
	private Double precio;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getUnixmed() {
		return unixmed;
	}
	public void setUnixmed(Double unixmed) {
		this.unixmed = unixmed;
	}
	public String getUm() {
		return um;
	}
	public void setUm(String um) {
		this.um = um;
	}
	public String getTmoneda() {
		return tmoneda;
	}
	public void setTmoneda(String tmoneda) {
		this.tmoneda = tmoneda;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", peso=" + peso + ", unixmed=" + unixmed + ", um=" + um
				+ ", tmoneda=" + tmoneda + ", precio=" + precio + "]";
	}	
}
