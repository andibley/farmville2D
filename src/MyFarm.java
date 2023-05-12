public class MyFarm {

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
        plotwithmaxnumber();
        plantwithmaxnumber();

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
        for (int w = 0; w < grid.length; w++) {
            for (int q = 0; q < grid[w].length; q++) {
                sumofallplants += grid[w][q].numberofplants;
            }
        }
        System.out.println("the average number of plants is " + sumofallplants / (grid.length * grid[0].length));
    }

    public void plotwithmaxnumber() {
        int maxnumber = grid[0][0].numberofplants;
        String name = grid[0][0].plantname;
        for (int b = 0; b < grid.length; b++) {
            for (int g = 0; g < grid[b].length; g++) {
                if (grid[b][g].numberofplants > maxnumber) {
                    maxnumber = grid[b][g].numberofplants;
                    name = grid[b][g].plantname;
                }
            }
            System.out.println(name + " has the most plants with a total of " + maxnumber + "plants");
        }
    }

    public void plantwithmaxnumber() {
        int numcarrot = 0;
        int numtomato = 0;
        int numcorn = 0;
        int numsunflower = 0;
        for (int b = 0; b < grid.length; b++) {
            for (int g = 0; g < grid[b].length; g++) {
                switch (grid[b][g].plantname) {
                    case "corn":
                        numcorn += grid[b][g].numberofplants;
                        break;
                    case "sunflower":
                        numsunflower += grid[b][g].numberofplants;
                        break;
                    case "tomato":
                        numtomato += grid[b][g].numberofplants;
                        break;
                    default:
                        numcarrot += grid[b][g].numberofplants;
                        break;
                }
            }
        }
        if (numcorn > numcarrot && numcorn > numsunflower && numcorn > numtomato) {
            System.out.println("Corn has the most plants with " + numcorn + "number of plants");
        }
        if (numtomato > numcarrot && numtomato > numsunflower && numtomato > numcorn) {
            System.out.println("tomato has the most plants with " + numtomato + "number of plants");
        }
        if (numsunflower > numcarrot && numsunflower > numtomato && numsunflower > numcorn) {
            System.out.println("sunflower has the most plants with " + numsunflower + "number of plants");
        }
        if (numcarrot > numcorn && numcarrot > numsunflower && numcarrot > numtomato) {
            System.out.println("tomato has the most plants with " + numtomato + "number of plants");
        }
    }
}








