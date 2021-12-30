package com.statepattern.pojo;

public class GateInputMessage {

    public enum InputMessage {
        PAY, PAY_OK, PAY_KO, GO_THROUGH
    }
    //V 1.0 -> da questi 4 messaggi aggiungo nuovi requisiti per valutare facilità di modifica con o senza sate pattern

    private InputMessage messageToGate;

    public InputMessage getMessageToGate() {
        return messageToGate;
    }

    public GateInputMessage(InputMessage messageToGate) {
        this.messageToGate = messageToGate;
    }
}
