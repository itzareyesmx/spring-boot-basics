package com.course.springbootbasics.services

import com.course.springbootbasics.dto.CategoriaDTO
import com.course.springbootbasics.entities.Categoria
import com.course.springbootbasics.repository.CategoriaRepository
import org.springframework.stereotype.Service

@Service
class CategoriaServiceImpl(
  val categoriaRepository: CategoriaRepository
) : CategoriaService {

  override fun save(categoriaDTO: CategoriaDTO){
    val categoria = Categoria()
    categoria.descripcion = categoriaDTO.descripcion
    categoria.estado = categoriaDTO.estado
    categoriaRepository.save(categoria)
  }
}