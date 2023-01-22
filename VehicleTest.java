package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VehicleTest {

    private Car getDefaultCar() {
        return new Car("Dodge", "Ram", 2010);
    }
    private Motorcycle getDefaultMot() {
        return new Motorcycle("Yamaha", "R1", 2012);
    }

    @Test
    public void testCarBaseAttributes() {
        Car car = getDefaultCar();
        assertTrue(car instanceof Vehicle);
        assertEquals(car.getNumWheels(), 4);
    }

    @Test
    public void testMotBaseAttributes() {
        Motorcycle mot = getDefaultMot();
        assertEquals(mot.getNumWheels(), 2);
    }

    @Test
    public void testCarTestDrive() {
        Car car = getDefaultCar();
        car.testDrive();
        assertTrue(car.getSpeed() >= 60);
    }

    @Test
    public void testMotTestDrive() {
        Motorcycle mot = getDefaultMot();
        mot.testDrive();
        assertTrue(mot.getSpeed() >= 75);
    }

    @Test
    public void testCarParking() {
        Car car = getDefaultCar();
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    @Test
    public void testMotParking() {
        Motorcycle mot = getDefaultMot();
        mot.testDrive();
        mot.park();
        assertEquals(mot.getSpeed(), 0);
    }

}