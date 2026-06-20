package com.pucetec_stevenjacome.students.repositories

import com.pucetec_stevenjacome.students.entities.Subject
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SubjectRepository : JpaRepository<Subject, Long>
