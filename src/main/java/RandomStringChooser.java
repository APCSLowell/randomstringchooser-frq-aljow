import java.util.*;
public class RandomStringChooser
{
  private ArrayList<Integer> arr; 
  public RandomStringChooser(int[] wordArray) {
    arr = new ArrayList<Integer>();
    for(int i = 0; i < wordArray.length; i++) {
      arr.get(i) = wordArray[i];
    }
  }
  public String getNext() {
    int randomNum = (int)Math.random()*arr.length+1;
    if (randomNum == arr.length) {
      return "NONE";
    } 
    int element = arr.get(randomNum);
    arr.remove(randomNum);
    return element; 
  }
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
