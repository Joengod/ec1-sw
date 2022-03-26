package com.idat.repository;

import java.util.List;

import com.idat.model.Curso;

public interface CursoRepository {

	public void guardarCurso(Curso c);
	public void eliminarCurso(Integer id);
	public void editarCurso(Curso c);
	public List<Curso> listarCurso();
	public Curso cursoById(Integer id);


}
