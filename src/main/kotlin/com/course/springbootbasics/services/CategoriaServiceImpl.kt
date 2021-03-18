package com.course.springbootbasics.services

import com.course.springbootbasics.dto.CategoryDTO
import com.course.springbootbasics.entities.Category
import com.course.springbootbasics.repository.CategoriaRepository
import org.springframework.stereotype.Service

@Service
class CategoriaServiceImpl(
  val categoriaRepository: CategoriaRepository
) : CategoriaService {

  override fun save(categoryDTO: CategoryDTO){
    val category = Category()
    category.description = categoryDTO.description
    category.state = categoryDTO.state
    categoriaRepository.save(category)
  }

  override fun find(id: Int): CategoryDTO {
    val category = categoriaRepository.findById(id).get()
    return CategoryDTO(category.description, category.state)
  }
}