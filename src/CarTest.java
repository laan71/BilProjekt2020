public class CarTest {

    public static void main(String[] args) {
        testSuite();
    }

    private static void testSuite() {
        System.out.println("Testsuiten kører.");
        System.out.print("Test 1 (bilen skal være tændt): ");
        testStartCarWithCorrectKey();
        System.out.print("Test 2 (bilen skal ikke være tændt): ");
        testStartCarWithWrongKey();
        System.out.println("Test 3 (kørelyset skal være tændt): ");
        testDrivingLight();
    }

    private static void testDrivingLight() {
        Car lailasCar = new Car();
        lailasCar.lights(true, 1);
        System.out.println("Kørelyset er tændt: " + lailasCar.lights[0][1]);

    }

    private static void testStartCarWithCorrectKey() {
        Car lailasCar = new Car();
        CarKey key = new CarKey("password1234");
        lailasCar.turnEngineOn(key);
    }

    private static void testStartCarWithWrongKey() {
        Car lailasCar = new Car();
        CarKey key = new CarKey("password234");
        lailasCar.turnEngineOn(key);
    }

    private static void testStartCarCanDrive() {
        Car lailasCar = new Car();
        CarKey key = new CarKey("password1234");
        lailasCar.turnEngineOn(key);
        // Tag håndbremsen fra
        lailasCar.releaseHandbreak();
        // Sæt bilen i frigear
        lailasCar.changeToGear(0);
        // Hvis den er i frigear, tryk kobling ned
        lailasCar.pressClutch();
        // Skift gear til 1
        lailasCar.changeToGear(1);
        // Slip koblingen
        lailasCar.releaseClutch();
        // Tryk gaspadelane (halvt) ned
        lailasCar.pressSpeeder(3);


    }

}


