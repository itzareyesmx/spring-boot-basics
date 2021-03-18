package com.course.springbootbasics.repository

import com.course.springbootbasics.entities.Category
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoriaRepository : CrudRepository<Category, Int>
