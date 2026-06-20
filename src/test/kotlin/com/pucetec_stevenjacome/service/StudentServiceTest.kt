package com.pucetec_stevenjacome.service

import com.pucetec_stevenjacome.students.repositories.StudentRepository
import com.pucetec_stevenjacome.students.services.StudentService
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension
import kotlin.test.Test


@ExtendWith(value = [MockitoExtension::class])
class StudentServiceTest {

    //@Mock crea un objeto falso del repositorio
    //No vamos a tocar la base de datos rela sino que simulamos respuestas
    @Mock
    private lateinit var studentRepository: StudentRepository

    //@InjectMocks crea una instnacia real del servicio
    //y lo va a inyectar con todos los mocks declarados con @Mock
    @InjectMocks
    private lateinit var studentService: StudentService

    @Test
    fun 'createStudent should throw BlankNameException wich name is blank' {

    }

}