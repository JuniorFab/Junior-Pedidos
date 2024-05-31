package com.example.demo.Usuarios;
	
public class Usuario {
	/**
	 * Estos son los atributos de la clase usuario y de que esta compuesto el usuario 
	 */
	private Long id;
		private String nombre;
		private String apellido;
		private Long Telefono;
		private String direccion;
	
		/**
		 * 
		 * @param id es para identificar al usuario 
		 * @param nombre nombre de dicho usuario 
		 * @param apellido apellido de dicho usuario
		 * @param telefono telefono de dicho usuario 
		 * @param direccion  dirreccion de dicho usuario 
		 */
		
		/**
		 * 
		 * Esto es un constructor el cual con el podemos crear un usario pasanadole los parametros 
		 */
		
		public Usuario(Long id, String nombre, String apellido, Long telefono, String direccion) {
			this.id = id;
			this.nombre = nombre;
			this.apellido = apellido;
			Telefono = telefono;
			this.direccion = direccion;
		}
		
		/**
		 * 
		 * Estos son todos los getter y setter para a lo hora de ver algo o modificar algo del usuario lo podamos hacer sin problema
		 */
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
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public Long getTelefono() {
			return Telefono;
		}
		public void setTelefono(Long telefono) {
			Telefono = telefono;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		/**
		 * Esto es el to string que sirve para poder ver de una forma toda la informacion del usuario tambien lo puedes cambiar a tu gusto
		 */
		@Override
		public String toString() {
			return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", Telefono=" + Telefono
					+ ", direccion=" + direccion + "]";
		}
		
		
		
		


}
