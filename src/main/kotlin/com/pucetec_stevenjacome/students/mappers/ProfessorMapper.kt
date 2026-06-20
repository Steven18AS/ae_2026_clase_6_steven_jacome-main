package com.pucetec_stevenjacome.students.mappers

import com.pucetec_stevenjacome.students.dto.ProfessorRequest
import com.pucetec_stevenjacome.students.dto.ProfessorResponse
import com.pucetec_stevenjacome.students.entities.Professor

fun ProfessorRequest.toEntity() = Professor(
    name = this.name,
    email = this.email
)

fun Professor.toResponse() = ProfessorResponse(
    id = this.id,
    name = this.name,
    email = this.email
)
