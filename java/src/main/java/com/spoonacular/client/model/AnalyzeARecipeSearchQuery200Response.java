/*
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
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
import com.spoonacular.client.model.AnalyzeARecipeSearchQuery200ResponseDishesInner;
import com.spoonacular.client.model.AnalyzeARecipeSearchQuery200ResponseIngredientsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-09T18:25:28.115+02:00[Europe/Berlin]")
public class AnalyzeARecipeSearchQuery200Response {
  public static final String SERIALIZED_NAME_DISHES = "dishes";
  @SerializedName(SERIALIZED_NAME_DISHES)
  private Set<AnalyzeARecipeSearchQuery200ResponseDishesInner> dishes = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_INGREDIENTS = "ingredients";
  @SerializedName(SERIALIZED_NAME_INGREDIENTS)
  private Set<AnalyzeARecipeSearchQuery200ResponseIngredientsInner> ingredients = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_CUISINES = "cuisines";
  @SerializedName(SERIALIZED_NAME_CUISINES)
  private List<String> cuisines = new ArrayList<>();

  public static final String SERIALIZED_NAME_MODIFIERS = "modifiers";
  @SerializedName(SERIALIZED_NAME_MODIFIERS)
  private List<String> modifiers = new ArrayList<>();

  public AnalyzeARecipeSearchQuery200Response() { 
  }

  public AnalyzeARecipeSearchQuery200Response dishes(Set<AnalyzeARecipeSearchQuery200ResponseDishesInner> dishes) {
    
    this.dishes = dishes;
    return this;
  }

  public AnalyzeARecipeSearchQuery200Response addDishesItem(AnalyzeARecipeSearchQuery200ResponseDishesInner dishesItem) {
    this.dishes.add(dishesItem);
    return this;
  }

   /**
   * Get dishes
   * @return dishes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Set<AnalyzeARecipeSearchQuery200ResponseDishesInner> getDishes() {
    return dishes;
  }


  public void setDishes(Set<AnalyzeARecipeSearchQuery200ResponseDishesInner> dishes) {
    this.dishes = dishes;
  }


  public AnalyzeARecipeSearchQuery200Response ingredients(Set<AnalyzeARecipeSearchQuery200ResponseIngredientsInner> ingredients) {
    
    this.ingredients = ingredients;
    return this;
  }

  public AnalyzeARecipeSearchQuery200Response addIngredientsItem(AnalyzeARecipeSearchQuery200ResponseIngredientsInner ingredientsItem) {
    this.ingredients.add(ingredientsItem);
    return this;
  }

   /**
   * Get ingredients
   * @return ingredients
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Set<AnalyzeARecipeSearchQuery200ResponseIngredientsInner> getIngredients() {
    return ingredients;
  }


  public void setIngredients(Set<AnalyzeARecipeSearchQuery200ResponseIngredientsInner> ingredients) {
    this.ingredients = ingredients;
  }


  public AnalyzeARecipeSearchQuery200Response cuisines(List<String> cuisines) {
    
    this.cuisines = cuisines;
    return this;
  }

  public AnalyzeARecipeSearchQuery200Response addCuisinesItem(String cuisinesItem) {
    this.cuisines.add(cuisinesItem);
    return this;
  }

   /**
   * Get cuisines
   * @return cuisines
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getCuisines() {
    return cuisines;
  }


  public void setCuisines(List<String> cuisines) {
    this.cuisines = cuisines;
  }


  public AnalyzeARecipeSearchQuery200Response modifiers(List<String> modifiers) {
    
    this.modifiers = modifiers;
    return this;
  }

  public AnalyzeARecipeSearchQuery200Response addModifiersItem(String modifiersItem) {
    this.modifiers.add(modifiersItem);
    return this;
  }

   /**
   * Get modifiers
   * @return modifiers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getModifiers() {
    return modifiers;
  }


  public void setModifiers(List<String> modifiers) {
    this.modifiers = modifiers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyzeARecipeSearchQuery200Response analyzeARecipeSearchQuery200Response = (AnalyzeARecipeSearchQuery200Response) o;
    return Objects.equals(this.dishes, analyzeARecipeSearchQuery200Response.dishes) &&
        Objects.equals(this.ingredients, analyzeARecipeSearchQuery200Response.ingredients) &&
        Objects.equals(this.cuisines, analyzeARecipeSearchQuery200Response.cuisines) &&
        Objects.equals(this.modifiers, analyzeARecipeSearchQuery200Response.modifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dishes, ingredients, cuisines, modifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyzeARecipeSearchQuery200Response {\n");
    sb.append("    dishes: ").append(toIndentedString(dishes)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
    sb.append("    cuisines: ").append(toIndentedString(cuisines)).append("\n");
    sb.append("    modifiers: ").append(toIndentedString(modifiers)).append("\n");
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
    openapiFields.add("dishes");
    openapiFields.add("ingredients");
    openapiFields.add("cuisines");
    openapiFields.add("modifiers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dishes");
    openapiRequiredFields.add("ingredients");
    openapiRequiredFields.add("cuisines");
    openapiRequiredFields.add("modifiers");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AnalyzeARecipeSearchQuery200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AnalyzeARecipeSearchQuery200Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnalyzeARecipeSearchQuery200Response is not found in the empty JSON string", AnalyzeARecipeSearchQuery200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AnalyzeARecipeSearchQuery200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnalyzeARecipeSearchQuery200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AnalyzeARecipeSearchQuery200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArraydishes = jsonObj.getAsJsonArray("dishes");
      if (jsonArraydishes != null) {
        // ensure the json data is an array
        if (!jsonObj.get("dishes").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `dishes` to be an array in the JSON string but got `%s`", jsonObj.get("dishes").toString()));
        }

        // validate the optional field `dishes` (array)
        for (int i = 0; i < jsonArraydishes.size(); i++) {
          AnalyzeARecipeSearchQuery200ResponseDishesInner.validateJsonObject(jsonArraydishes.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayingredients = jsonObj.getAsJsonArray("ingredients");
      if (jsonArrayingredients != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ingredients").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ingredients` to be an array in the JSON string but got `%s`", jsonObj.get("ingredients").toString()));
        }

        // validate the optional field `ingredients` (array)
        for (int i = 0; i < jsonArrayingredients.size(); i++) {
          AnalyzeARecipeSearchQuery200ResponseIngredientsInner.validateJsonObject(jsonArrayingredients.get(i).getAsJsonObject());
        };
      }
      // ensure the json data is an array
      if (jsonObj.get("cuisines") != null && !jsonObj.get("cuisines").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cuisines` to be an array in the JSON string but got `%s`", jsonObj.get("cuisines").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("modifiers") != null && !jsonObj.get("modifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiers` to be an array in the JSON string but got `%s`", jsonObj.get("modifiers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnalyzeARecipeSearchQuery200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnalyzeARecipeSearchQuery200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnalyzeARecipeSearchQuery200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnalyzeARecipeSearchQuery200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<AnalyzeARecipeSearchQuery200Response>() {
           @Override
           public void write(JsonWriter out, AnalyzeARecipeSearchQuery200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnalyzeARecipeSearchQuery200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AnalyzeARecipeSearchQuery200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnalyzeARecipeSearchQuery200Response
  * @throws IOException if the JSON string is invalid with respect to AnalyzeARecipeSearchQuery200Response
  */
  public static AnalyzeARecipeSearchQuery200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnalyzeARecipeSearchQuery200Response.class);
  }

 /**
  * Convert an instance of AnalyzeARecipeSearchQuery200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
