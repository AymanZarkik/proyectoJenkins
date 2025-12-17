/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import org.junit.jupiter.api.Test;
import com.mycompany.mavenproject1.Mavenproject1;
import static org.junit.jupiter.api.Assertions.assertEquals;

//@author Ayman
public class NewEmptyJUnitTest {
    @Test
    public void Lunes() {
        Mavenproject1 n = new Mavenproject1();
        assertEquals(n.dia_laboral("Lunes"),true);
        assertEquals(n.dia_laboral("lunes"),false);
    }
    @Test
    public void Martes() {
        Mavenproject1 n = new Mavenproject1();
        assertEquals(n.dia_laboral("Martes"),true);
        assertEquals(n.dia_laboral("martes"),false);
    }
    @Test
    public void Miercoles() {
        Mavenproject1 n = new Mavenproject1();
        assertEquals(n.dia_laboral("Miercoles"),true);
        assertEquals(n.dia_laboral("miercoles"),false);
    }
    @Test
    public void Jueves() {
        Mavenproject1 n = new Mavenproject1();
        assertEquals(n.dia_laboral("Jueves"),true);
        assertEquals(n.dia_laboral("jueves"),false);
    }
    @Test
    public void Viernes() {
        Mavenproject1 n = new Mavenproject1();
        assertEquals(n.dia_laboral("Viernes"),true);
        assertEquals(n.dia_laboral("viernes"),false);
    }
    @Test
    public void Sabado() {
        Mavenproject1 n = new Mavenproject1();
        assertEquals(n.dia_laboral("Sabado"),false);
        assertEquals(n.dia_laboral("sabado"),false);
    }
    @Test
    public void Domingo() {
        Mavenproject1 n = new Mavenproject1();
        assertEquals(n.dia_laboral("Domingo"),false);
        assertEquals(n.dia_laboral("domingo"),false);
    }
    @Test
    public void dafault() {
        Mavenproject1 n = new Mavenproject1();
        assertEquals(n.dia_laboral(" "),false);
    }

}
