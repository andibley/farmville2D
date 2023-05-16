import java.util.ArrayList;

public class MyFarmArraylist {
    public ArrayList<plot> row = new ArrayList<plot>();

    public MyFarmArraylist() {
        System.out.println("my farm using array lists");
        for(int p = 0; p < 10; p++) {
            System.out.println(row.size());
            row.add(new plot());
            row.get(p).printPlot();

        }
        System.out.println(row.size());
        totalPlants();
    }
        public void totalPlants() {
            // how many total plants are there in the row?
            int total = 0;
        for(plot a: row){
            total+= a.numberofplants;
        }
        System.out.println("total plants is "+total);
        }


    }




