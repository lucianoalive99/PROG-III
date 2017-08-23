package Clases;

import java.util.List;

public class Permiso {

	int idPersmiso;
	Accion accion;
	Entidad entidad;
	
	
	List<Rol> roles;
	public int getIdPersmiso() {
		return idPersmiso;
	}
	public void setIdPersmiso(int idPersmiso) {
		this.idPersmiso = idPersmiso;
	}
	public Accion getAccion() {
		return accion;
	}
	public void setAccion(Accion accion) {
		this.accion = accion;
	}
	public Entidad getEntidad() {
		return entidad;
	}
	public void setEntidad(Entidad entidad) {
		this.entidad = entidad;
	}
	public List<Rol> getRoles() {
		return roles;
	}
	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
	
	
	public Permiso(int idPersmiso, Accion accion, Entidad entidad, List<Rol> roles) {
		super();
		this.idPersmiso = idPersmiso;
		this.accion = accion;
		this.entidad = entidad;
		this.roles = roles;
	}
	
	
	
}
