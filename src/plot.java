public class plot {
   public String plantname;
   public int numberofplants;
   public boolean needswater;


   public plot() {
      needswater = false;
     numberofplants = (int)(Math.random() * 100) +10;
int num = (int)(Math.random()*5);
      if (num == 0) {
         plantname = "sunflower";
      }
      else if(num == 1){
            plantname = "corn";
         }
      else if(num ==2){
          plantname = "carrot";
      }
      else if(num == 3){
          plantname = "tomato";
      }
      else{
          plantname = "empty";
          numberofplants =0;
      }
      }

      public void printPlot(){
System.out.println("the plot has " + numberofplants + " of "+ plantname+ " and it is "+ needswater+ " that it needs water.");

      }
   }
