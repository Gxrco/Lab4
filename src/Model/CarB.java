package Model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CarB extends CarC implements ICarB{
    ArrayList<String> cards = new ArrayList<>();
    private String LCName;

    public String makeCall(String NameforCall) {
        String message;
        if (getCallStatus()==1 || getCallStatus()==2){
            message= "You are on a call";
        }else {
            setCallStatus(1);
            message= "Calling " + NameforCall;
        }
        LCName = NameforCall;
        return message;
    }

    @Override
    public String getLastContact() {
        return LCName;
    }

    @Override
    public void setLastContact(String LastCalledContact) {
        LCName = LastCalledContact;
    }

    @Override
    public String getPresentationCards() {
        cards.add("Carlos - +502 2280 9876");
        cards.add("Juan - +502 3981 9556");
        cards.add("Pedro - +502 2760 3826");
        cards.add("Nate - +502 2980 8536");
        cards.add("Daniel - +502 1890 4040");
        return "";
    }
}
