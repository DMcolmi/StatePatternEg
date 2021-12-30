package com.statepattern.service;

import com.statepattern.pojo.Gate;
import com.statepattern.pojo.GateInputMessage;

import static com.statepattern.pojo.GateInputMessage.InputMessage.*;

public class NoPatternGateStateService {

    public void hendleStateService(Gate gate, GateInputMessage inputMessage) {
        Gate.GateStatus status = gate.getGateState();
        GateInputMessage.InputMessage message = inputMessage.getMessageToGate();

        switch (status){
            case ELAB:
                if(message == PAY_OK){
                    gate.setGateState(Gate.GateStatus.OPEN);
                    break;
                } else if (message == PAY_KO) {
                    gate.setGateState(Gate.GateStatus.CLOSE);
                    break;
                } else if (message == PAY) {
                    break;
                }else if (message == GO_THROUGH) {
                    break;
                } //V 1.0 -> da qui aggiungo nuovi requisiti per valutare facilità di modifica con o senza sate pattern
                break;
            case OPEN:
                if(message == PAY_OK){
                    break;
                } else if (message == PAY_KO) {
                    break;
                } else if (message == PAY) {
                    break;
                }else if (message == GO_THROUGH) {
                    gate.setGateState(Gate.GateStatus.CLOSE);
                    break;
                }
                break;
            case CLOSE:
                if(message == PAY_OK){
                    break;
                } else if (message == PAY_KO) {
                    break;
                } else if (message == PAY) {
                    gate.setGateState(Gate.GateStatus.ELAB);
                }else if (message == GO_THROUGH) {
                    break;
                }
                break;
            default:
                break;

        }

    }



}
