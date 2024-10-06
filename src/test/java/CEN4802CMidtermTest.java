/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.CEN4802CMidterm.CEN4802CMidterm;  //imports main class

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author robianalabady
 */
public class CEN4802CMidtermTest {
    
    public CEN4802CMidtermTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAddTask() {
        CEN4802CMidterm app = new CEN4802CMidterm();
        app.addTask("Test Task");
        assertTrue(app.getTasks().contains("Test Task"));
    }

    @Test
    public void testRemoveTask() {
        CEN4802CMidterm app = new CEN4802CMidterm();
        app.addTask("Test Task");
        app.removeTask("Test Task");
        assertFalse(app.getTasks().contains("Test Task"));
    }

    @Test
    public void testGetTasks() {
        CEN4802CMidterm app = new CEN4802CMidterm();
        app.addTask("Task 1");
        app.addTask("Task 2");
        assertEquals(2, app.getTasks().size());
    }
    
}//end CEN4802CMidtermTest test class
