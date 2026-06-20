package com.pucetec_stevenjacome.students.repositories

import com.pucetec_stevenjacome.students.entities.Student
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface StudentRepository: JpaRepository<Student, Long>{

    fun existsByEmail(email: String): Boolean
}