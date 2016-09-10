package org.twgogo.jimwayne.gson.deserialization;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Hello world!
 *
 */
public class App {
  private static JsonParser parser = new JsonParser();
  
  private static Gson gson = new GsonBuilder()
      .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
      .create();
  
  public static void main(String[] args) {
    testDifferentName();
  }
  
  /**
   * Test to serialize and de-serialize JSON in different name.
   */
  private static void testDifferentName () {
    Gson gson = new GsonBuilder()
        .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        .create();
    
    JsonObject json = new JsonObject();
    json.addProperty("symbol_mic", "2331.XTAI");
    json.addProperty("epoch_day", 16960);
    
    Quote quote = gson.fromJson(json, Quote.class);
    System.out.println("To Object (symbolMic): " + quote.getSymbolMic());
    System.out.println("To Object (epochDat): " + quote.getEpochDay());
    
    JsonObject deJson = parser.parse(gson.toJson(quote)).getAsJsonObject();
    System.out.println("To Json: " + deJson);
  }
}
