package com.course.springbootbasics.controller

import com.course.springbootbasics.dto.CategoryDTO
import com.course.springbootbasics.services.CategoriaService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/")
class CategoriaController(
  private val categoriaService: CategoriaService
) {

  @PostMapping("/categories")
  fun postCategories(@RequestBody categoryDTO: CategoryDTO): ResponseEntity<String> {
    categoriaService.save(categoryDTO)
    return ResponseEntity(HttpStatus.NO_CONTENT)
  }

  @GetMapping("/categories/{id}")
  fun getCategoria(@PathVariable id: Int): ResponseEntity<CategoryDTO> {
    return ResponseEntity(categoriaService.find(id), HttpStatus.OK)
  }
}
