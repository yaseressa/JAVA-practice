package UNISH.proco;

public class specname {
    public static void main(String[] args) {
        Species speciesX = new Species();
        speciesX.readInput();
        if (speciesX.isExtinct()) {
            System.out.println("The species that you entered is extinct");
            System.out.println("Enter another: ");
            speciesX.readInput();
        }
        Species arabianOryx = new Species();
        arabianOryx.setSpecies("arabianOryx", 1000, 0.25);
        while (speciesX.Name.equals("arabianOryx")) {
            System.out.println("the values entered equals to the arabianOryx's values \nre-enter Values again again");
            speciesX.readInput();
        }
        if( speciesX.Population >  arabianOryx.Population)
        {
            System.out.println(speciesX.Population + " is greater than " + arabianOryx.Population);
        }else{
            if(speciesX.getGrowthRate() <= arabianOryx.getGrowthRate()) {
                System.out.println(speciesX.Name + " has a lower growthRate than arabianOryx growthRate ");
            }else{
                int years = 1;
                while(speciesX.predictPopulation(years) < arabianOryx.predictPopulation(years)) {
years++;

                }
                System.out.println("it will take " + years + " for speciesX to surpass arabianOryx");
            }
        }
    }
}
