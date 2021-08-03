public class ProjectClassTest {
    public static void main(String[] args) {
        
        // ProjectClass elevatorPitchName = new ProjectClass("Cars");
        ProjectClass elevatorPitchAll = new ProjectClass("Cars", "things about cars");
        String name = elevatorPitchAll.getName();
        String description = elevatorPitchAll.getDescription();
        

        // System.out.println(elevatorPitchName.twoString()); //this is test code
        System.out.println("The name of this project is: " + name);
        System.out.println("The name of this project is: " + elevatorPitchAll.getName()); //secondary way of printing name
        System.out.println("Name of project: " + name + "Description of project: " + description);
    }
}