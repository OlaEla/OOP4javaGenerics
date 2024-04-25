package view;

import data.Student;
import data.StudentGroup;

import java.util.List;
import java.util.logging.Logger;

// Представление для студентов
public class StudentView implements UserView<Student> {

    // Логгер
    Logger logger = Logger.getLogger(StudentView.class.getName());

    // Метод вывода студентов на консоль
    @Override
    public void sendOnConsole(List<Student> students) {
        for (Student user : students) {
            logger.info(user.toString());
        }
    }

    // Метод вывода группы студентов на консоль
    public void sendOnConsoleUserGroup(StudentGroup studentGroup) {
        logger.info(studentGroup.toString());
    }

}
