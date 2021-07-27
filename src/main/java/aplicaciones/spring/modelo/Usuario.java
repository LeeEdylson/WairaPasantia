package aplicaciones.spring.modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.sun.istack.NotNull;
@Entity
@Table(name="USUARIOS")
public class Usuario {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		@NotNull
		private String nombreuser;
		@NotNull
		private Integer dni;	
		@NotNull
		private String nombres;
		@NotNull
		private String apellidos;
		@NotNull
		private String correo;
		@NotNull
		private String fechan;
		@NotNull
		private String telefono;
		@NotNull
		private String direccion;
		@NotNull
		private String rol;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNombreuser() {
			return nombreuser;
		}
		public void setNombreuser(String nombreuser) {
			this.nombreuser = nombreuser;
		}
		public Integer getDni() {
			return dni;
		}
		public void setDni(Integer dni) {
			this.dni = dni;
		}
		public String getNombres() {
			return nombres;
		}
		public void setNombres(String nombres) {
			this.nombres = nombres;
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public String getCorreo() {
			return correo;
		}
		public void setCorreo(String correo) {
			this.correo = correo;
		}
		public String getFechan() {
			return fechan;
		}
		public void setFechan(String fechan) {
			this.fechan = fechan;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getRol() {
			return rol;
		}
		public void setRol(String rol) {
			this.rol = rol;
		}
		@Override
		public String toString() {
			return "Usuario [id=" + id + ", nombreuser=" + nombreuser + ", dni=" + dni + ", nombres=" + nombres
					+ ", apellidos=" + apellidos + ", correo=" + correo + ", fechan=" + fechan + ", telefono="
					+ telefono + ", direccion=" + direccion + ", rol=" + rol + "]";
		}
}
