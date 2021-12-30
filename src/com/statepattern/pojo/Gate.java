package com.statepattern.pojo;

public class Gate {

    public enum GateStatus {
        OPEN, CLOSE, ELAB
    }
    //V 1.0 -> da questi 3 stati aggiungo nuovi requisiti per valutare facilità di modifica con o senza sate pattern


    private GateStatus gateState;

    public GateStatus getGateState() {
        return gateState;
    }

    public Gate(GateStatus gateState) {
        this.gateState = gateState;
    }

    public void setGateState(GateStatus gateState) {
        this.gateState = gateState;
    }

    @Override
    public String toString(){
        return gateState.toString();
    }


}
