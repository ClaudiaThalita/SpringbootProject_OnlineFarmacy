package com.claudiathalita.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claudiathalita.domain.Categoria;
import com.claudiathalita.repositories.CategoriaRepository;
import com.claudiathalita.services.exception.ObjectNotFoundException;

@Service 
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName(), null));
		}

}
