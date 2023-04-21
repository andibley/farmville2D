public class plot {
   public String plantname;
   public int numberofplants;
   public boolean needswater;

   public plot() {
      // plantname = "sunflower";
      needswater = true;
     int num = (int) (Math.random() * 5);
     
      if (num == 0) {
         plantname = "sunflower";
      }
      else if(num == 1){
            plantname = "corn";
         }
      }
   }
