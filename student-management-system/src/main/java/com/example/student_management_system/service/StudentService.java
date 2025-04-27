package com.example.student_management_system.service;

import com.example.student_management_system.domain.Student;
import com.example.student_management_system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }

    public Iterable<Student> getStudentsByName(String name) {
        return studentRepository.findByName(name);
    }

    public boolean updateStudent(Student student) {
        if(studentRepository.existsById(student.getId())){
            studentRepository.save(student);
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteStudent(int id) {
        if(studentRepository.existsById(id)){
            studentRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
