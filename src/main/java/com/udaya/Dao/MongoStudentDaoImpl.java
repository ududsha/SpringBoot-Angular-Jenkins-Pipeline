package com.udaya.Dao;

import com.udaya.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by udaya_s on 1/14/2017.
 */
@Repository
@Qualifier("mongoData")
public class MongoStudentDaoImpl implements StudentDao{


    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>(){
            {
                add(new Student(1,"Mario", "Nothing"));
            }
        };

    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudent(Student student) {

    }
}
