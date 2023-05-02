public class MyFarm {

    public static void main(String[] args) {
        MyFarm charlie = new MyFarm();
        plot ryan = new plot();
        ryan.printPlot();
    }

    public plot[][] grid;

    public MyFarm() {
        System.out.print("hello from my farm!");

        grid = new plot[4][3];
        for (int p = 0; p < grid.length; p++) {
            for (int h = 0; h < grid[p].length; h++) {
                grid[p][h] = new plot();
                grid[p][h].printPlot();
            }
        }
        // call methods here
        totalplants();
        printplantnames();
        totalcarrots();
        averageNumberOfPlants();
    }

    public void totalplants() {
        //how many plants are in the grid?
        int sumofplants = 0;
        for (int e = 0; e < grid.length; e++) {
            for (int c = 0; c < grid[e].length; c++) {
                sumofplants += grid[e][c].numberofplants;
            }
        }
        System.out.println("the total number of plants is " + sumofplants);
    }

    public void printplantnames() {
        String names;
        for (int r = 0; r < grid.length; r++) {
            for (int h = 0; h < grid[r].length; h++) {
                names = grid[r][h].plantname;
                System.out.println("row:" + r + " col:" + h + "  " + names);
            }
        }
    }

    public void totalcarrots() {
        int sumofcarrots = 0;
        for (int h = 0; h < grid.length; h++) {
            for (int k = 0; k < grid[h].length; k++) {
                if (grid[h][k].plantname.equals("carrot")) {
                    sumofcarrots += grid[h][k].numberofplants;
                }
            }
        }
        System.out.println("the total number of carrots are " + sumofcarrots);
    }

    public void averageNumberOfPlants() {
        int sumofallplants = 0;
        for(int w=0; w< grid.length; w++){
            for(int q = 0; q<grid[w].length; q++){
                sumofallplants += grid[w][q].numberofplants;
// divide to get average
            }
        }
        System.out.println("the sum of all the plants is " + sumofallplants);
    }
}