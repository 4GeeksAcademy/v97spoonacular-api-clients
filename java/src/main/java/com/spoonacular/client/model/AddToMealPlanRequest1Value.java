/*
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.1
 * Contact: mail@spoonacular.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.spoonacular.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.spoonacular.client.model.AddToMealPlanRequest1ValueIngredientsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.spoonacular.client.JSON;

/**
 * AddToMealPlanRequest1Value
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-03T16:53:39.113+01:00[Europe/Berlin]")
public class AddToMealPlanRequest1Value {
  public static final String SERIALIZED_NAME_INGREDIENTS = "ingredients";
  @SerializedName(SERIALIZED_NAME_INGREDIENTS)
  private Set<AddToMealPlanRequest1ValueIngredientsInner> ingredients = new LinkedHashSet<>();

  public AddToMealPlanRequest1Value() { 
  }

  public AddToMealPlanRequest1Value ingredients(Set<AddToMealPlanRequest1ValueIngredientsInner> ingredients) {
    
    this.ingredients = ingredients;
    return this;
  }

  public AddToMealPlanRequest1Value addIngredientsItem(AddToMealPlanRequest1ValueIngredientsInner ingredientsItem) {
    this.ingredients.add(ingredientsItem);
    return this;
  }

   /**
   * Get ingredients
   * @return ingredients
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Set<AddToMealPlanRequest1ValueIngredientsInner> getIngredients() {
    return ingredients;
  }


  public void setIngredients(Set<AddToMealPlanRequest1ValueIngredientsInner> ingredients) {
    this.ingredients = ingredients;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddToMealPlanRequest1Value addToMealPlanRequest1Value = (AddToMealPlanRequest1Value) o;
    return Objects.equals(this.ingredients, addToMealPlanRequest1Value.ingredients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingredients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddToMealPlanRequest1Value {\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ingredients");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ingredients");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddToMealPlanRequest1Value
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AddToMealPlanRequest1Value.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddToMealPlanRequest1Value is not found in the empty JSON string", AddToMealPlanRequest1Value.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddToMealPlanRequest1Value.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddToMealPlanRequest1Value` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddToMealPlanRequest1Value.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArrayingredients = jsonObj.getAsJsonArray("ingredients");
      if (jsonArrayingredients != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ingredients").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ingredients` to be an array in the JSON string but got `%s`", jsonObj.get("ingredients").toString()));
        }

        // validate the optional field `ingredients` (array)
        for (int i = 0; i < jsonArrayingredients.size(); i++) {
          AddToMealPlanRequest1ValueIngredientsInner.validateJsonObject(jsonArrayingredients.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddToMealPlanRequest1Value.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddToMealPlanRequest1Value' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddToMealPlanRequest1Value> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddToMealPlanRequest1Value.class));

       return (TypeAdapter<T>) new TypeAdapter<AddToMealPlanRequest1Value>() {
           @Override
           public void write(JsonWriter out, AddToMealPlanRequest1Value value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddToMealPlanRequest1Value read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddToMealPlanRequest1Value given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddToMealPlanRequest1Value
  * @throws IOException if the JSON string is invalid with respect to AddToMealPlanRequest1Value
  */
  public static AddToMealPlanRequest1Value fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddToMealPlanRequest1Value.class);
  }

 /**
  * Convert an instance of AddToMealPlanRequest1Value to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

