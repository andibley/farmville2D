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
            row.add(new plot());
        System.out.println(row.size());
        }
    }
