package oop.inheritance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TeacherTest {
    @Test
    public void firstTest(){
        PhysicsTeacher obj = new PhysicsTeacher();
        assertEquals("Teacher", obj.designation);
        assertEquals("Beginnersbook", obj.collegeName);
        assertEquals("Physics", obj.mainSubject);
    }

}
