package com.epam.jwd.entity;

import com.epam.jwd.util.IdGenerator;

public class Terminal {

	private int idTerminal;

	public Terminal() {
		this.idTerminal = IdGenerator.generate();
	}

	public int getIdTerminal() {
		return idTerminal;
	}

	public void setIdTerminal(int idTerminal) {
		this.idTerminal = idTerminal;
	}

}
