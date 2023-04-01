package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService {

	List<Courses> list;

	public CourseServiceImpl() {

		list = new ArrayList<Courses>();
		list.add(new Courses(15, "spring course", "this is spring"));
		list.add(new Courses(145, "java course", "this is basis"));
	}

	@Override
	public List<Courses> getCourses() {
		return list;
	}

	@Override
	public Courses getCourses(long courseId) {

		Courses c = null;

		for (Courses course : list) {
			if (course.getId() == courseId) {
				c = course;
				break;
			}
		}
		return c;
	}

	@Override
	public Courses addCourse(Courses course) {
		list.add(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {

		for (Courses course : list) {
			if (course.getId() == courseId) {
				list.remove(course);

				break;
			}
		}
	}

}
