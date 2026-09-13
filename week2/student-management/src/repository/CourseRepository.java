package repository;

import model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository {

    private List<Course> courses;

    public CourseRepository() {
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course findById(int id) {

        for (Course course : courses) {
            if (course.getId() == id) {
                return course;
            }
        }

        return null;
    }

    public void displayAllCourses() {

        if (courses.isEmpty()) {
            System.out.println("No courses found.");
            return;
        }

        for (Course course : courses) {
            course.displayCourse();
        }
    }

    public boolean removeCourse(int id) {

        Course course = findById(id);

        if (course == null) {
            return false;
        }

        courses.remove(course);
        return true;
    }

    public int getCourseCount() {
        return courses.size();
    }
}