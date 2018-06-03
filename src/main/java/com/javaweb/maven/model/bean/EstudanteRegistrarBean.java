package com.javaweb.maven.model.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.javaweb.maven.model.Estudante;

@Named
@SessionScoped
public class EstudanteRegistrarBean implements Serializable {
	private static final long serialVersionUID = -4309459228383308986L;
	private Estudante estudante =  new Estudante();

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

}
