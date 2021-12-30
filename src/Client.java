import com.statepattern.pojo.Gate;
import com.statepattern.pojo.GateInputMessage;
import com.statepattern.service.NoPatternGateStateService;

public class Client {
    public static void main(String[] args) {

        Gate gate = new Gate(Gate.GateStatus.CLOSE);

        NoPatternGateStateService serviceN = new NoPatternGateStateService();
        System.out.println("Gate status: "+gate);

        //non succede niente
        serviceN.hendleStateService(gate, new GateInputMessage(GateInputMessage.InputMessage.PAY_KO));
        System.out.println("Gate status: "+gate);


        //attendo ok pagamento
        serviceN.hendleStateService(gate, new GateInputMessage(GateInputMessage.InputMessage.PAY));
        System.out.println("Gate status: "+gate);


        //ricevo ok pagamento
        serviceN.hendleStateService(gate, new GateInputMessage(GateInputMessage.InputMessage.PAY_OK));
        System.out.println("Gate status: "+gate);


        //ricevo ok pagamento
        serviceN.hendleStateService(gate, new GateInputMessage(GateInputMessage.InputMessage.PAY_OK));
        System.out.println("Gate status: "+gate);

        //persona passa
        serviceN.hendleStateService(gate, new GateInputMessage(GateInputMessage.InputMessage.GO_THROUGH));
        System.out.println("Gate status: "+gate);

    }
}
