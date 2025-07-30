package com.dj.cruddemo.dao;

import com.dj.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(int id);

}
