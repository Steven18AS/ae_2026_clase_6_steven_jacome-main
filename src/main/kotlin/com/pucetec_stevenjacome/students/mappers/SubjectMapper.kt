package com.pucetec_stevenjacome.students.mappers

import com.pucetec_stevenjacome.students.dto.SubjectRequest
import com.pucetec_stevenjacome.students.dto.SubjectResponse
import com.pucetec_stevenjacome.students.entities.Professor
import com.pucetec_stevenjacome.students.entities.Subject

fun SubjectRequest.toEntity(professor: Professor) = Subject(
    name = this.name,
    code = this.code,
    professor = professor
)

fun Subject.toResponse() = SubjectResponse(
    id = this.id,
    name = this.name,
    code = this.code,
    professor = this.professor.toResponse()
)
