package com.pucetec_stevenjacome.students.repositories

import com.pucetec_stevenjacome.students.entities.Professor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProfessorRepository : JpaRepository<Professor, Long> {

    fun existsByEmail(email: String): Boolean
}
