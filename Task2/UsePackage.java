import java.util.Random;
/**
 * Created by Adam Cowie on 17/09/2016.
 */
public class UsePackage {
    public static void main(String[] args) {
        // Declare vars
        int minWeight=1;
        int maxWeight=30;

        // Build and Display Packages
        Package packagesOne = new Package(randInt(minWeight, maxWeight),'a');
        Package packagesTwo = new Package(randInt(minWeight, maxWeight),'t');
        Package packagesThree = new Package(randInt(minWeight, maxWeight),'m');
        Package iPackagesOne = new InsuredPackage(randInt(minWeight, maxWeight),'a');
        Package iPackagesTwo = new InsuredPackage(randInt(minWeight, maxWeight),'t');
        Package iPackagesThree = new InsuredPackage(randInt(minWeight, maxWeight),'m');
    }
    public static int randInt(int min, int max)
    {
        Random rand = new Random(System.currentTimeMillis());
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}

