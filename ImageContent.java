public class ImageContent extends StaticContent implements WidescreenSupport{
    private int width;
    private int height;

    public ImageContent(String name, String description, String location, String author, int[] dimensions){
        super(name, description, location, author);
        setDimensions(dimensions);

    }

    public boolean hasWidescreenSupport(){
        if(width/height >= 1.5 || width/height < 2){
            return true;
        }
        else{
            return false;
        }
    }

    //setter first this time
    public void setDimensions(int [] dimensions){
        if(dimensions[0] <= 0){
            this.width = 1;
        } 
        else{
            this.width = dimensions[0];
        }
            
        if (dimensions[1] <= 0){
            this.height = 1;
        }
        else{
            this.height = dimensions[1];
        }
    }

    //getter
    public int[] getDimensions(){
        return new int[]{width, height}; 
    }

    @Override 
    public String toString(){
        int[] dimension = getDimensions();
        String wideScreen;

        if(hasWidescreenSupport()){
            wideScreen = "Has widescreen support.";
        }
        else{
            wideScreen = "Does not have widescreen support";
        }

        return "#" + getId()+ ": " + getName() 
        + "\n" + getDescription()
        + "\n" + getLocation()
        + "\nby " + getAuthor()
        + "\n" + dimension[0] + " x " + dimension[1]
        + "\n" + wideScreen; 
    }
}