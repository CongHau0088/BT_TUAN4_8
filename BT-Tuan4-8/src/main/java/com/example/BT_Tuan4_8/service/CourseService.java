package com.example.BT_Tuan4_8.service;

import com.example.BT_Tuan4_8.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseService {

    private List<Course> listCourse = new ArrayList<>();

    public void add(Course newProduct) {
        listCourse.add(newProduct);
    }

    public List<Course> GetAll() {
        return listCourse;
    }
}
