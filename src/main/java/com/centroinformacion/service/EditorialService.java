package com.centroinformacion.service;

import java.util.List;

import com.centroinformacion.entity.Editorial;

public interface EditorialService {

	public abstract Editorial insertaActualizaEditorial(Editorial obj);
//Buscar RUC
	public abstract List<Editorial> listaPorRuc(String ruc);

}
