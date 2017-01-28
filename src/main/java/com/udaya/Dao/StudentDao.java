package com.udaya.Dao;

import com.udaya.Entity.Student;

import java.util.Collection;

/**
 * Created by udaya_s on 1/14/2017.
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudent(Student student);
}
