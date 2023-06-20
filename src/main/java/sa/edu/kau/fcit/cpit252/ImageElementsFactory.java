package sa.edu.kau.fcit.cpit252;

import java.util.Map;
import java.util.HashMap;

public class ImageElementsFactory {

  private Map<String, ImageElement> flyweights = new HashMap<String, ImageElement>();

  public ImageElement getFlyweight(String name) {
    // return a flyweight if it already exists, otherwise, put it in the map.
    if(flyweights.containsKey(name)) {
      return flyweights.get(name);
    }
    ImageElement imageElement = new ImageElement(name);
    flyweights.put(name, imageElement);
    return imageElement;
  }

  public int numberOfFlyweights() {
    // return the size of the HashMap
    return flyweights.size();
  }

}