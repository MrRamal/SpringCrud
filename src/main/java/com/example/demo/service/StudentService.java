package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {


    private final StudentRepository studentRepository;


    public Student getStudent( Long id){
        return studentRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Student not found"));
    }


    public Student createStudent(Student student){
        return studentRepository.save(student);
    }



    public Student updateStudent( Long id, Student student){
        studentRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Student not found"));
        student.setId(id);
        return studentRepository.save(student);
    }

    public void deleteStudent( Long id){
        studentRepository.deleteById(id);
    }

}
