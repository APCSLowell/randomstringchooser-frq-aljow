import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String> arr; 
  public RandomStringChooser(String[] wordArr) {
    arr = new ArrayList<String>();
    for(String x : wordArr) {
      arr.add(x);
    }
  }
  public String getNext() {
    if (arr.size() == 0) {
      return "NONE";
    }
    int randomNum = (int)(Math.random()*arr.size());
    String element = new String(arr.get(randomNum));
    arr.remove(randomNum);
    return element; 
  }
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
