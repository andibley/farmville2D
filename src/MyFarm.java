public class MyFarm {

    public static void main(String[] args) {
        MyFarm charlie = new MyFarm();
        plot ryan = new plot();
        ryan.printPlot();
    }

    public MyFarm() {
        System.out.print("hello from my farm!");


        plot[][] grid = new plot[10][10];
        for (int p = 0; p < grid.length; p++) {
            for (int h = 0; h < grid[p].length; h++) {
                grid[p][h] = new plot();
                grid[p][h].printPlot();
            }
        }
    }
}
