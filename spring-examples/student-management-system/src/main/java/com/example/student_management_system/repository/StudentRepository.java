package com.example.student_management_system.repository;

import com.example.student_management_system.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Iterable<Student> findByName(String name);
}
