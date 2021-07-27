package aplicaciones.spring.modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.sun.istack.NotNull;
@Entity
@Table(name="CLIENTES")
public class Cliente {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		@NotNull
		private String nombres;
		@NotNull
		private Integer ruc;	
		@NotNull
		private String direccion;
		@NotNull
		private String sede;
		@NotNull
		private String movil;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNombres() {
			return nombres;
		}
		public void setNombres(String nombres) {
			this.nombres = nombres;
		}
		public Integer getRuc() {
			return ruc;
		}
		public void setRuc(Integer ruc) {
			this.ruc = ruc;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getSede() {
			return sede;
		}
		public void setSede(String sede) {
			this.sede = sede;
		}
		public String getMovil() {
			return movil;
		}
		public void setMovil(String movil) {
			this.movil = movil;
		}
		@Override
		public String toString() {
			return "Cliente [id=" + id + ", nombres=" + nombres + ", ruc=" + ruc + ", direccion=" + direccion
					+ ", sede=" + sede + ", movil=" + movil + "]";
		}		
}
