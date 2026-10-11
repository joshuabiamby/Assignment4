import java.util.*;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Content> contents = new ArrayList<>();

        while (true) {
            System.out.println("[Content Manager]");
            System.out.println("1. Add written content");
            System.out.println("2. Add image content");
            System.out.println("3. Add audio content");
            System.out.println("4. Add video content");
            System.out.println("5. List Content");
            System.out.println("0. Quit");
            System.out.print("Enter option: ");

            int option = Integer.parseInt(scanner.nextLine());

            if (option == 0) {
                System.out.println("Shutting off...");
                break;
            }

            switch (option) {
                case 1: // WrittenContent
                    System.out.print("Enter content's name: ");
                    String wName = scanner.nextLine();
                    System.out.print("Enter content's description: ");
                    String wDesc = scanner.nextLine();
                    System.out.print("Where is the content stored? ");
                    String wLoc = scanner.nextLine();
                    System.out.print("Enter author's name: ");
                    String wAuth = scanner.nextLine();
                    System.out.print("Enter number of words: ");
                    int wWords = Integer.parseInt(scanner.nextLine());

                    contents.add(new WrittenContent(wName, wDesc, wLoc, wAuth, wWords));
                    System.out.println("Content added.");
                    break;

                case 2: // ImageContent
                    System.out.print("Enter content's name: ");
                    String iName = scanner.nextLine();
                    System.out.print("Enter content's description: ");
                    String iDesc = scanner.nextLine();
                    System.out.print("Where is the content stored? ");
                    String iLoc = scanner.nextLine();
                    System.out.print("Enter author's name: ");
                    String iAuth = scanner.nextLine();
                    System.out.print("Enter image's width: ");
                    int iWidth = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter image's height: ");
                    int iHeight = Integer.parseInt(scanner.nextLine());

                    contents.add(new ImageContent(iName, iDesc, iLoc, iAuth, new int[]{iWidth, iHeight}));
                    System.out.println("Content added.");
                    break;

                case 3: // AudioContent
                    System.out.print("Enter content's name: ");
                    String aName = scanner.nextLine();
                    System.out.print("Enter content's description: ");
                    String aDesc = scanner.nextLine();
                    System.out.print("Where is the content stored? ");
                    String aLoc = scanner.nextLine();
                    System.out.print("Enter duration, in milliseconds: ");
                    int aDur = Integer.parseInt(scanner.nextLine());

                    ArrayList<String> participants = new ArrayList<>();
                    System.out.println("Enter the name of every participant, or blank to finish.");
                    while (true) {
                        System.out.print("Enter participant: ");
                        String pName = scanner.nextLine();
                        if (pName.isEmpty()) break;
                        participants.add(pName);
                    }

                    contents.add(new AudioContent(aName, aDesc, aLoc, aDur, participants));
                    System.out.println("Content added.");
                    break;

                case 4: // VideoContent
                    System.out.print("Enter content's name: ");
                    String vName = scanner.nextLine();
                    System.out.print("Enter content's description: ");
                    String vDesc = scanner.nextLine();
                    System.out.print("Where is the content stored? ");
                    String vLoc = scanner.nextLine();
                    System.out.print("Enter duration, in milliseconds: ");
                    int vDur = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter resolution: ");
                    int vRes = Integer.parseInt(scanner.nextLine());

                    contents.add(new VideoContent(vName, vDesc, vLoc, vDur, vRes));
                    System.out.println("Content added.");
                    break;

                case 5: // List Content
                    if (contents.isEmpty()) {
                        System.out.println("List of contents is empty.");
                    } else {
                        System.out.println("STATIC, \nDYNAMIC, \nWRITTEN, \nIMAGE, \nAUDIO, \nVIDEO, \nWIDESCREEN, \nALL");
                        System.out.println("Which content do you want shown? " );
                        String cName = scanner.nextLine();
                        boolean found = false;
    
                        for (Content c: contents){
                            boolean match = false;

                            if(cName.equals("ALL")){
                                match = true;
                            }
                            else if(cName.equals("STATIC") && c instanceof StaticContent){
                                match = true;
                            }
                            else if(cName.equals("DYNAMIC") && c instanceof DynamicContent){
                                match = true;
                            }
                            else if(cName.equals("WRITTEN") && c instanceof WrittenContent){
                                match = true;
                            }
                            else if(cName.equals("IMAGE") && c instanceof ImageContent){
                                match = true;
                            }
                            else if(cName.equals("AUDIO") && c instanceof AudioContent){
                                match = true;
                            }
                            else if(cName.equals("VIDEO") && c instanceof VideoContent){
                                match = true;
                            }
                            else if(cName.equals("WIDESCREEN")){
                                if(c instanceof WidescreenSupport){
                                    match = ((WidescreenSupport) c).hasWidescreenSupport();
                                }
                            }

                            if(match){
                                System.out.print(c.toString());
                                found = true;
                                System.out.println();
                            }
                        }
                        if(!found){
                            System.out.println("No content of that type found.");
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
