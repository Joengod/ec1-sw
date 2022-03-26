package com.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.model.Curso;
import com.idat.repository.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {
	
	@Autowired
	private CursoRepository repository;

	@Override
	public void guardarCurso(Curso c) {
		// TODO Auto-generated method stub
		repository.guardarCurso(c);
	}

	@Override
	public void eliminarCurso(Integer id) {
		// TODO Auto-generated method stub
		repository.eliminarCurso(id);	
	}

	@Override
	public void editarCurso(Curso c) {
		// TODO Auto-generated method stub
		repository.editarCurso(c);
	}

	@Override
	public List<Curso> listarCurso() {
		// TODO Auto-generated method stub
		return repository.listarCurso();
	}

	@Override
	public Curso cursoById(Integer id) {
		// TODO Auto-generated method stub
		return repository.cursoById(id);
	}

}
