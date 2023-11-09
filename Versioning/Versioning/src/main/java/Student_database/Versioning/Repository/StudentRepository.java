package Student_database.Versioning.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Student_database.Versioning.pojo.Student;

public interface StudentRepository extends JpaRepository<Student ,Integer> {

}
