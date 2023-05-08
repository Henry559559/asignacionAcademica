package com.proyectoUni.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona_per")
public class Persona {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long llave;
	    
	    private String identificacion;
	    
	    private String nombre;

	    private String apellido;
	    
	    private String tipoPer;
	    
	    private String curso;
	    // getters y setters
	    @Column(name = "LLAVE_CPER")
		public Long getLlave() {
			return llave;
		}
		
		public void setLlave(Long llave) {
			this.llave = llave;
		}
		@Column(name = "identificacion_CPER")
		public String getIdentificacion() {
			return identificacion;
		}

		public void setIdentificacion(String identificacion) {
			this.identificacion = identificacion;
		}
		@Column(name = "nombre_CPER")
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		@Column(name = "apellido_CPER")
		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		@Column(name = "tipoPer_CPER")
		public String getTipoPer() {
			return tipoPer;
		}

		public void setTipoPer(String tipoPer) {
			this.tipoPer = tipoPer;
		}
		
		@Column(name = "CURSO_CPER")
		public String getCurso() {
			return curso;
		}

		public void setCurso(String curso) {
			this.curso = curso;
		}
	    
	   
}
