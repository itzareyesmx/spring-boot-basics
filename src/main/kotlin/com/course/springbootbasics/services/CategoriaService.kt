package com.course.springbootbasics.services

import com.course.springbootbasics.dto.CategoriaDTO

interface CategoriaService {
  fun save(categoriaDTO: CategoriaDTO)
}
