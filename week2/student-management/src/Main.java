import model.Course;
import repository.CourseRepository;

public class Main {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     STUDENT MANAGEMENT SYSTEM");
        System.out.println("=================================");

        CourseRepository courseRepository = new CourseRepository();

        Course java = new Course(
                1,
                "Java Programming",
                4
        );

        Course networking = new Course(
                2,
                "Computer Networking",
                3
        );

        Course embedded = new Course(
                3,
                "Embedded Systems",
                5
        );

        courseRepository.addCourse(java);
        courseRepository.addCourse(networking);
        courseRepository.addCourse(embedded);

        System.out.println();
        System.out.println("All Courses:");

        courseRepository.displayAllCourses();

        System.out.println();
        System.out.println("Searching for course ID 2:");

        Course foundCourse = courseRepository.findById(2);

        if (foundCourse != null) {
            foundCourse.displayCourse();
        } else {
            System.out.println("Course not found.");
        }

        System.out.println();
        System.out.println("Removing course ID 3:");

        boolean removed = courseRepository.removeCourse(3);

        if (removed) {
            System.out.println("Course removed successfully.");
        } else {
            System.out.println("Course not found.");
        }

        System.out.println();
        System.out.println("Courses after removal:");

        courseRepository.displayAllCourses();

        System.out.println();
        System.out.println(
                "Total courses: " +
                courseRepository.getCourseCount()
        );
    }
}