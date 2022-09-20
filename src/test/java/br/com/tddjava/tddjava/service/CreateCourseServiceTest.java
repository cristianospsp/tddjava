package br.com.tddjava.tddjava.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

import br.com.tddjava.tddjava.modules.course.services.*;

public class CreateCourseServiceTest {

	@Test
	public void should_be_able_to_create_a_new_course() {
		// Criar um novo curso

		// Criar table curso (Entidade)
		// ID, description, name, workload
		Course course = new Course();
		course.setDescription("Curso_Description_Teste");
		course.setName("Curso_Name");
		course.setWorkLoad(100);

		// Criar um novo service
		CreateCourseService createCourseService new CreateCourseServiceTest();
		Course createCourse = createCourseService.execute();

		// Criar repositorio de curso
		assertNotNull(createCourse.getId());
	}

}
