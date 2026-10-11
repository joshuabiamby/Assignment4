public abstract class Content{
    private String name;
    private String description;
    private String location;
    private int id;
    private static int nextId = 1;

    public Content(String name, String description, String location){
        id = nextId;
        nextId++;
        if(name.isEmpty()){
            this.name = "No name";
        }
        else{
            this.name = name;
        }

        if(description.isEmpty()){
            this.description = "No description";
        }
        else{
            this.description = description;
        }

        if(location.isEmpty()){
            this.location = "Unknown location";
        }
        else{
            this.location = location;
        }
    }

    //Getters 
    public String getName(){return name;}
    public String getDescription(){return description;}
    public String getLocation(){return location;}
    public int getId(){return id;}

    //Setters 
    public void setName(String name){
        if(name.equals("")){
            this.name = "No name";
        }
        else{
            this.name = name;
        }
    }
    public void setDescription(String description){
         if(description.equals("")){
            this.description = "No description";
        }
        else{
            this.description = description;
        }
    }
    public void setLocation(String location){
      if(location.equals("")){
            this.location = "Unknown location";
        }
        else{
            this.location = location;
        }
    }

    @Override 
    public String toString(){
        return "#" + id + ": " +name +"\n"+ description + "\n" + location;
    }

}

