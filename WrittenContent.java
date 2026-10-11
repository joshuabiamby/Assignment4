public class WrittenContent extends StaticContent{
    private int words;

    public WrittenContent(String name, String description, String location, String author, int words){
        super(name, description, location, author);
        if(words > 0){
            this.words = words;
        }
        else{
            this.words = 0;
        }
    }

    // Getter 
    public int getWords(){return words;}    

    //Setter
    public void setWords(int words){
        if(words >= 0){
            this.words = words;
        }
        else{
           this.words = 0;
        }
    }

    private String getReadTime(){
        int readTime = getWords()/180;

        if (readTime < 1){
            return "Less than a minute";
        }
        else{
            return "Around " + readTime + " minutes";
        }
    }

    @Override 
    public String toString(){
        return "#" + getId()+ ": " 
        + getName() + "\n" 
        + getDescription() + "\n" 
        + getLocation() + "\n" 
        + "by " + getAuthor() + "\n" 
        + "Read time: " + getReadTime();
    }
}