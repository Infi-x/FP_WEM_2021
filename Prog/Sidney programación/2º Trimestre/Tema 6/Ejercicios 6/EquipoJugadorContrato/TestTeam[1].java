/**
 * Class used for testing
 */

public class TestTeam
{
    // Create a Team instance
    private Team team = new Team();
    
    public TestTeam() {
        // Create a few players and add them to the team
        String[] names = {"John", "Anne", "Pete", "Serena", "Rick" };
        int[] ages = {25, 24, 26, 22, 21 };
        int[] salaries = {7, 3, 4, 8, 5};
        team.signContracts(names, ages, salaries);
    }

    public void doTest() {
        
        // Print the number of players (0.25p)
        //int nbOfPlayers = 0; // !! Replace "0" with a method call !!
        int nbOfPlayers = team.numberOfPlayers();
        System.out.println("There are " + nbOfPlayers + " players in the team.");
        
        // List the names of all players in the team.
        team.printPlayerNames();
        System.out.println();
        
        // Look up a player and print his/her age (0.5p)
        String peteName = "Pete";
        //int age = 0;    // !! Replace "0" with your code !!
        int age = team.getPlayer(peteName).getAge();
        System.out.println(peteName + "\'s age: " + age);
        
        // Print his/her salary (1p)
        //int salary = 0;    // !! Replace "0" with your code !!
        int salary = team.getSalary(peteName);
        System.out.println(peteName + "\'s salary: " + salary);
        
        // Remove that player (with the name peteName) from the team (0.25p)
        // !! Your code here !!
        team.removePlayer(peteName);
        
        // List the names of all players in the team.
        team.printPlayerNames();
        System.out.println();
        
        // Find the "highest" contract (contract with highest salary) (1p)
        Contract contract = team.getHighestContract();
        
        // Print details of the highest contract (name, age, salary) (1p)
        System.out.println("Highest contract:");
        // !! Your code here !!
        if(contract != null) {
            System.out.println(contract);
        }
        System.out.println();
        
        // The stars of the team, indicated by their position in the team
        int[] stars = {1, 3};
        // Print details about the stars (name and age).
        // !! Your code here !!
        team.printPlayerDetails(stars);
        
    }
}
