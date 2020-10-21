public class Car {

    /*
    Opgaven skal helst udføres i grupper af 2, hvor den ene skriver klassen, den anden skriver testen.

Vi vil modellere en bil mhp. at kunne gøre den selvkørende på sigt.

I skal udvikle 2 klasser, Car.java og CarTest.java, som hhv. repræsenterer en bil og tester en bil.

Bil-klassen skal have fields, som kan repræsenter bilens SAMLEDE TILSTAND, f.eks. :


Udlæsning af currentSpeed, currentRpm, maxRpm, currentGear, odometer
Pedals: accelerator, footBrake, clutch pedals, hvor meget er de presset ned?
Rattets position
Tænding, er den tændt eller slukket?
Håndbremse
Udstyr: lys for og bag, vinduesviskere for og  bag
Varme og aircon?
Sikkerhedsudstyr?
Andre ting?
Constructor skal sørge for at fremstille en stillestående, slukket bil med realistiske egenskaber.
Eksempler på metoder, som i kan fremstille:


startEngine(String keyCode)
stopEngine()
accelerate(...)
break(...)
clutch(...)
changeGear(...)
turnOn(...)
turnOff(...)
airconOn()
Til sidst   Bilen bør testes fra starten af med en så detaljeret test som muligt.
     */

    private String password;
    public boolean engineOn = false;
    String[][] lights = {
            {String.valueOf(LightType.FRONTLIGHT), "false"},
            {String.valueOf(LightType.BACKLIGHT), "false"},
            {String.valueOf(LightType.BREAKLIGHT), "false"},
            {String.valueOf(LightType.LONGLIGHT), "false"},
            {String.valueOf(LightType.TURNLIGHTRIGHT), "false"},
            {String.valueOf(LightType.TURNLIGHTLEFT), "false"}
    };

    Car() {
        this.password = "password1234";
        this.engineOn = false;
    }

    public void turnEngineOn(CarKey key) {
        if (key.password.equals(password)) {
            System.out.println("Bilen er tændt.");
            engineOn = true;
            lights(true, 1);
        } else {
            System.out.println("Bilen kan ikke tænde, pga. forkert nøgle.");
        }
    }

    public void lights(boolean status, int changes) {




        switch (changes) {
            case 1:
                // håndter kørelys
                if (status) {
                    lights[0][1] = "true";
                    lights[1][1] = "true";
                }
                else {
                    lights[0][1] = "false";
                    lights[1][1] = "false";
                }
            break;
            case 2:
                // håndter bremselys
                if (status) {
                    lights[2][1] = "true";
                }
                else {
                    lights[2][1] = "false";
                }
                break;
            case 3:
                // blinker til højre
                if (status) {
                    lights[4][1] = "true";
                }
                else {
                    lights[4][1] = "false";
                }
                break;
            case 4:
                // blinker til venstre
                if (status) {
                    lights[5][1] = "true";
                }
                else {
                    lights[5][1] = "false";
                }
                break;
            case 5:
                // langt lys
                if (status) {
                    lights[3][1] = "true";
                }
                else {
                    lights[3][1] = "false";
                }
                break;
            case 6:
                // alle lygter
                if (status) {
                    lights[0][1] = "true";
                    lights[1][1] = "true";
                    lights[2][1] = "true";
                    lights[3][1] = "true";
                    lights[4][1] = "true";
                    lights[5][1] = "true";
                }
                else {
                    lights[0][1] = "false";
                    lights[1][1] = "false";
                    lights[2][1] = "false";
                    lights[3][1] = "false";
                    lights[4][1] = "false";
                    lights[5][1] = "false";
                }
                break;

            default:
                // no change

                break;
        }
    }

    public void releaseHandbreak() {
    }

    public void changeToGear(int i) {
    }

    public void pressClutch() {
    }

    public void releaseClutch() {
    }

    public void pressSpeeder(int i) {
    }
}