package B.Inheritance;

public class RunTest {
    public static void main(String[] args) {
        MobileBrand M = new MobileBrand();
        M.TurnOn();
        M.OpneCallLog();
        M.DialNumber();
        M.Call();
        M.EndCall();

        System.out.println("Iphone");
           Iphone I=new Iphone();
           I.TurnOn();
           I.OpneCallLog();
           I.DialNumber();
           I.Call();
           I.EndCall();
           I.Mobile2Charge();
           I.speedOfMobile2();
           I.TypeofMobile2();

        System.out.println("Samsung");
        Samsung s= new Samsung();
        s.TurnOn();
        s.OpneCallLog();
        s.DialNumber();
        s.Call();
        s.EndCall();
        s.TypeofMobile2();
        s.speedOfMobile2();
        s.Mobile2Charge();
    }
}