package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void shouldBuildStudentObject(){
        Student student = new Student.StudentBuilder()
                .name("Student name")
                .age(18)
                .level("Second grade")
                .address("Address")
                .email("student@school.com")
                .build();

        assertEquals(student.getName(), "Student name");
        assertEquals(student.getAge(), 18);
        assertEquals(student.getLevel(), "Second grade");
        assertEquals(student.getAddress(), "Address");
        assertEquals(student.getEmail(), "student@school.com");
    }

}