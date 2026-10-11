public abstract class StaticContent extends Content{
private String author;

public StaticContent(String name, String description, String location, String author){
    super(name, description, location);
    if(!author.equals("")){
        this.author = author;
    }
    else{
        this.author = "Unknown author";
    }
    
}

//Getter
public String getAuthor(){
    return author;
}

// Setter
public void setAuthor(String author){
    if(author.equals("")){
        this.author = "Unknown author";
    }
    else{
        this.author = author;
    }
}

@Override
public String toString(){
    return "#" + getId()+ ": " + getName() +"\n"+ getDescription() + "\n"+ getLocation() + "\n" + "by " + getAuthor(); 
    
}
}