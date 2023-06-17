package UNISH.proco;
import java.util.Scanner;
public class Species {
    String Name;
    int Population;
    double growthRate;
    Species(){
        Name = "";
        Population = 0;
        growthRate= 0;
    }
    Species(String Name, int Population, double growthRate){
        this.Name =Name;
        this.Population = Population;
        this.growthRate = growthRate;
    }
    void readInput(){
        var f = new Scanner(System.in);
        System.out.print("Enter the Species Name: ");
        String Name = f.nextLine();
        System.out.print("Enter the Population: ");
        int Population = f.nextInt();
        while(Population < 0) {
            System.out.println("Enter a VALID Population Growth Rate !!!.");
            System.out.print("Enter the Population: ");
            Population = f.nextInt();
        }
        System.out.print("Enter the Growth Rate: ");
        double growthRate = f.nextDouble();
        this.Name = Name;
        this.Population = Population;
        this.growthRate = growthRate;

    }
    double predictPopulation(double years){
        return this.Population + ((this.growthRate) * years);
    }
   String getName(){
        return Name;
   }
   int getPopulation(){
        return Population;
   }
   double getGrowthRate(){
        return growthRate;
   }
   public String writeOutput(){
      return "Name of the Population: " + Name + "\n" +
               "Number of Population: " + Population + "\n" +
              "the Growth Rate of the Population: " + growthRate;
   }
   void setSpecies(String Name, int Population, double growthRate){
       if (growthRate < 0){
           System.out.println("You Done Messed Up Aa-Ay-Roon");
           return;
       }else{
           this.Name = Name;
           this.Population = Population;
           this.growthRate = growthRate;
       }


   }
    boolean equals(Species otherObject){
        return this.Name.equals(otherObject);
    }
    boolean isPopulationLargerThan(Species otherObject){
        return this.Population > otherObject.Population;
    }
    boolean isExtinct(){
        return this.Population == 0;
    }
}
