import java.util.ArrayList;

public class AudioContent extends DynamicContent{
    private ArrayList<String> participants = new ArrayList<>();

    public AudioContent(String name, String description, String location, int duration, ArrayList<String> participants){
        super(name, description, location, duration);
        //this.participant is passed by reference 
        this.participants = participants;
    }

    //getter
    public ArrayList<String> getParticipants(){
        return participants;
    }

    //setter
    public void setParticipants(ArrayList<String> participants){
        this.participants = participants;
    }

    public String listParticipants(){
        if(participants.isEmpty()){
            return "Unknown participants";
        }
        else{
            String get_string = participants.get(0); // Already on one line.
            for (int i = 1; i < participants.size(); i++ ){
                get_string += "\n" + participants.get(i); // Start with new line for second index conacat to participant
            }
            return get_string;
        }
    }

    public String toString(){
        return "#" + getId() + getName() 
        + "\n" + getDescription()
        + "\n" + getLocation()
        + "\n" + "Duration: " + (getDuration()/1000) + " seconds"
        + "\n" + "Participants: "
        + "\n" + listParticipants();
    }
}