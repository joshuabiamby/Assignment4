public class VideoContent extends DynamicContent implements WidescreenSupport{

    private int resolution;

    public VideoContent(String name, String description, String location, int duration, int resolution){
        super(name, description, location, duration);
        setResolution(resolution);
    }

    public boolean hasWidescreenSupport(){
        if(resolution == 1440 || resolution == 1920 || resolution == 2048){
            return true;
        }
        else{
            return false;
        }
    }

    //Setter first again.
    public void setResolution(int resolution) {
    if (resolution == 240 ||
        resolution == 320 ||
        resolution == 480 ||
        resolution == 1080 ||
        resolution == 1440 ||
        resolution == 1920 ||
        resolution == 2048) {
        this.resolution = resolution;
    } 
    else {
        this.resolution = -1;
    }
}

    //getter
    public int getResolution(){return resolution;}

    public String toString(){
        String resResponse;
        String wideScreen;

        if(this.resolution == -1){
            resResponse = "Unknown resolution";
        }
        else{
            resResponse = "" + this.resolution; 
        }
        
        if(hasWidescreenSupport()){
            wideScreen = "Has widescreen support.";
        }
        else{
            wideScreen = "Does not have widescreen support";
        }

        return "#" + getId() + " " + getName() 
        + "\n" + getDescription()
        + "\n" + getLocation()
        + "\n" + "Duration: " + (getDuration()/1000) + " seconds"
        + "\n" + "Resolution: " + resResponse
        + "\n" + wideScreen;
    }
}
