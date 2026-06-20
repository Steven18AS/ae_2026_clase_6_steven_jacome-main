package com.pucetec_stevenjacome.students.repositories

import com.pucetec_stevenjacome.students.entities.Enrollment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EnrollmentRepository : JpaRepository<Enrollment, Long> {

    fun existsByStudent_IdAndSubject_Id(studentId: Long, subjectId: Long): Boolean
}
