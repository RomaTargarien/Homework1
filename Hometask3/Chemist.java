package Hometask3;

import Hometask3.Interfaces.ICalc;

public class Chemist <T extends ICalc> {
    private T icalc;

    public void setIcalc(ICalc iCalc){
        this.icalc = icalc;
    }

    public ICalc getIcalc(){
        return icalc;
    }

    public Chemist (T iCalc){
        this.icalc = iCalc;
    }
}
