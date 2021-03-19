package com.course.springbootbasics.services

import com.course.springbootbasics.dto.CategoryDTO

interface CategoriaService {
  fun save(categoryDTO: CategoryDTO)
  fun find(id: Int): CategoryDTO
}
