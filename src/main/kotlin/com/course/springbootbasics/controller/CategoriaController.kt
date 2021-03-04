package com.course.springbootbasics.controller

import com.course.springbootbasics.dto.CategoriaDTO
import com.course.springbootbasics.services.CategoriaService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/")
class CategoriaController(
  private val categoriaService: CategoriaService
) {

  @PostMapping("/categorias")
  fun postCategoria(@RequestBody categoriaDTO: CategoriaDTO): ResponseEntity<String> {
    categoriaService.save(CategoriaDTO())
    return ResponseEntity(HttpStatus.NO_CONTENT)
  }
}
