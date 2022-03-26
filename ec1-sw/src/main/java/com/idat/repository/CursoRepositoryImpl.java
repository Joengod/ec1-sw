package com.idat.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.model.Curso;

@Repository
public class CursoRepositoryImpl implements CursoRepository {
	public List<Curso> listar = new ArrayList<Curso>();

	
	@Override
	public void guardarCurso(Curso c) {
		// TODO Auto-generated method stub
		listar.add(c);

	}

	
	@Override
	public void eliminarCurso(Integer id) {
		// TODO Auto-generated method stub
		listar.remove(cursoById(id));
	}

	@Override
	public void editarCurso(Curso c) {
		// TODO Auto-generated method stub
		listar.remove(cursoById(c.getIdCurso()));
		listar.add(c);
	}

	@Override
	public List<Curso> listarCurso() {
		// TODO Auto-generated method stub
		return listar;
	}

	@Override
	public Curso cursoById(Integer id) {
		// TODO Auto-generated method stub
		return listar.stream().filter(p->p.getIdCurso()==id).findFirst().orElse(null);
	}



}
