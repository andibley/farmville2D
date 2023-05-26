import java.util.ArrayList;

public class MyFarmArraylist {
    public ArrayList<plot> row = new ArrayList<plot>();

    public MyFarmArraylist() {
        System.out.println("my farm using array lists");
        for (int p = 0; p < 10; p++) {
            System.out.println(row.size());
            row.add(new plot());
            row.get(p).printPlot();

        }
        System.out.println(row.size());
        totalPlants();
        addSunflower();
        addcorn();
        printPlantName();
        printrowinfo();
        tomatolocations();
        totalcarrots();
       // averageNumberOfPlants();
        everyotherneedswater();
        printrowinfo();
    }


    public void printPlantName() {
        for (int k = 0; k < row.size(); k++) {
            System.out.print(k + ":" + row.get(k).plantname + "\t");
        }
        System.out.println(" ");
    }

    public void printrowinfo(){
        for(plot a: row){
            a.printPlot();
        }
    }

    public void totalPlants() {
        // how many total plants are there in the row?
        int total = 0;
        for (plot a : row) {
            total += a.numberofplants;
        }
        System.out.println("total plants is " + total);
    }

    public void addSunflower() {
        plot sunflower = new plot();
        sunflower.plantname = "sunflower";
        sunflower.numberofplants = 42;
        sunflower.needswater = true;

        sunflower.printPlot();
        row.add(sunflower);

    }

    public void addcorn() {
        plot corn = new plot();
        corn.plantname = "corn";
        corn.numberofplants = 70;
        corn.needswater = false;
        corn.printPlot();
        row.add(3, corn);

    }

    public void tomatolocations() {
        for (int m = 0; m < row.size(); m++) {
            if (row.get(m).plantname.equals("tomato"))
                System.out.println(m);
        }
    }

    public void totalcarrots(){
       int numberofcarrots = 0;
        for(plot b: row){
            if(b.plantname.equals("carrot"))
            numberofcarrots += b.numberofplants;
        }
        System.out.println("total number of carrots is " + numberofcarrots);
    }

    public void averageNumberOfPlants() {
int averagenumberofplants = 0;
for(plot d: row){
    averagenumberofplants += d.numberofplants/;
    }
    }

    public void everyotherneedswater(){
for(int n = 0; n<row.size(); n++){
    if(n%2 == 1) {
        row.get(n).needswater = false;
    } else {
        row.get(n).needswater = true;
        }
    }
}
    }








