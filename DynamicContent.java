public abstract class DynamicContent extends Content{

    private int duration;

    public DynamicContent(String name, String description, String location, int duration){
        super(name, description, location);

        if(duration <= 0){
            this.duration = 0;
        }
        else{
            this.duration = duration;
        }
    }

    //Getter
    public int getDuration(){return duration;}

    //Setter
    public void setDuration(int duration){
        if(duration > 0){
            this.duration = duration;
        }
        else{
            this.duration = 0;
        }
    }

    @Override 
    public String toString(){
        return "#" + getId()+ ": " + getName() 
        + "\n" + getDescription() 
        + "\n" + getLocation() 
        + "\nDuration: " + (getDuration()/1000) + " seconds"; 

    }


}