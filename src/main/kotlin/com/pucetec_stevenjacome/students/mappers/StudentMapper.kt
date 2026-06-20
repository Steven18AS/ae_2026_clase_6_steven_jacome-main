package com.pucetec_stevenjacome.students.mappers

import com.pucetec_stevenjacome.students.dto.StudentRequest
import com.pucetec_stevenjacome.students.dto.StudentResponse
import com.pucetec_stevenjacome.students.entities.Student

fun StudentRequest.toEntity() = Student(
    name = this.name,
    email = this.email
)

fun Student.toResponse() = StudentResponse(
    id = this.id,
    name = this.name,
    email = this.email
)
