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
import com.spoonacular.client.model.GetMealPlanTemplate200ResponseDaysInnerItemsInner;
import com.spoonacular.client.model.GetMealPlanWeek200ResponseDaysInnerNutritionSummary;
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
 * GetMealPlanTemplate200ResponseDaysInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-03T16:53:39.113+01:00[Europe/Berlin]")
public class GetMealPlanTemplate200ResponseDaysInner {
  public static final String SERIALIZED_NAME_NUTRITION_SUMMARY = "nutritionSummary";
  @SerializedName(SERIALIZED_NAME_NUTRITION_SUMMARY)
  private GetMealPlanWeek200ResponseDaysInnerNutritionSummary nutritionSummary;

  public static final String SERIALIZED_NAME_NUTRITION_SUMMARY_BREAKFAST = "nutritionSummaryBreakfast";
  @SerializedName(SERIALIZED_NAME_NUTRITION_SUMMARY_BREAKFAST)
  private GetMealPlanWeek200ResponseDaysInnerNutritionSummary nutritionSummaryBreakfast;

  public static final String SERIALIZED_NAME_NUTRITION_SUMMARY_LUNCH = "nutritionSummaryLunch";
  @SerializedName(SERIALIZED_NAME_NUTRITION_SUMMARY_LUNCH)
  private GetMealPlanWeek200ResponseDaysInnerNutritionSummary nutritionSummaryLunch;

  public static final String SERIALIZED_NAME_NUTRITION_SUMMARY_DINNER = "nutritionSummaryDinner";
  @SerializedName(SERIALIZED_NAME_NUTRITION_SUMMARY_DINNER)
  private GetMealPlanWeek200ResponseDaysInnerNutritionSummary nutritionSummaryDinner;

  public static final String SERIALIZED_NAME_DAY = "day";
  @SerializedName(SERIALIZED_NAME_DAY)
  private String day;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private Set<GetMealPlanTemplate200ResponseDaysInnerItemsInner> items = null;

  public GetMealPlanTemplate200ResponseDaysInner() { 
  }

  public GetMealPlanTemplate200ResponseDaysInner nutritionSummary(GetMealPlanWeek200ResponseDaysInnerNutritionSummary nutritionSummary) {
    
    this.nutritionSummary = nutritionSummary;
    return this;
  }

   /**
   * Get nutritionSummary
   * @return nutritionSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetMealPlanWeek200ResponseDaysInnerNutritionSummary getNutritionSummary() {
    return nutritionSummary;
  }


  public void setNutritionSummary(GetMealPlanWeek200ResponseDaysInnerNutritionSummary nutritionSummary) {
    this.nutritionSummary = nutritionSummary;
  }


  public GetMealPlanTemplate200ResponseDaysInner nutritionSummaryBreakfast(GetMealPlanWeek200ResponseDaysInnerNutritionSummary nutritionSummaryBreakfast) {
    
    this.nutritionSummaryBreakfast = nutritionSummaryBreakfast;
    return this;
  }

   /**
   * Get nutritionSummaryBreakfast
   * @return nutritionSummaryBreakfast
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetMealPlanWeek200ResponseDaysInnerNutritionSummary getNutritionSummaryBreakfast() {
    return nutritionSummaryBreakfast;
  }


  public void setNutritionSummaryBreakfast(GetMealPlanWeek200ResponseDaysInnerNutritionSummary nutritionSummaryBreakfast) {
    this.nutritionSummaryBreakfast = nutritionSummaryBreakfast;
  }


  public GetMealPlanTemplate200ResponseDaysInner nutritionSummaryLunch(GetMealPlanWeek200ResponseDaysInnerNutritionSummary nutritionSummaryLunch) {
    
    this.nutritionSummaryLunch = nutritionSummaryLunch;
    return this;
  }

   /**
   * Get nutritionSummaryLunch
   * @return nutritionSummaryLunch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetMealPlanWeek200ResponseDaysInnerNutritionSummary getNutritionSummaryLunch() {
    return nutritionSummaryLunch;
  }


  public void setNutritionSummaryLunch(GetMealPlanWeek200ResponseDaysInnerNutritionSummary nutritionSummaryLunch) {
    this.nutritionSummaryLunch = nutritionSummaryLunch;
  }


  public GetMealPlanTemplate200ResponseDaysInner nutritionSummaryDinner(GetMealPlanWeek200ResponseDaysInnerNutritionSummary nutritionSummaryDinner) {
    
    this.nutritionSummaryDinner = nutritionSummaryDinner;
    return this;
  }

   /**
   * Get nutritionSummaryDinner
   * @return nutritionSummaryDinner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetMealPlanWeek200ResponseDaysInnerNutritionSummary getNutritionSummaryDinner() {
    return nutritionSummaryDinner;
  }


  public void setNutritionSummaryDinner(GetMealPlanWeek200ResponseDaysInnerNutritionSummary nutritionSummaryDinner) {
    this.nutritionSummaryDinner = nutritionSummaryDinner;
  }


  public GetMealPlanTemplate200ResponseDaysInner day(String day) {
    
    this.day = day;
    return this;
  }

   /**
   * Get day
   * @return day
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDay() {
    return day;
  }


  public void setDay(String day) {
    this.day = day;
  }


  public GetMealPlanTemplate200ResponseDaysInner items(Set<GetMealPlanTemplate200ResponseDaysInnerItemsInner> items) {
    
    this.items = items;
    return this;
  }

  public GetMealPlanTemplate200ResponseDaysInner addItemsItem(GetMealPlanTemplate200ResponseDaysInnerItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new LinkedHashSet<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<GetMealPlanTemplate200ResponseDaysInnerItemsInner> getItems() {
    return items;
  }


  public void setItems(Set<GetMealPlanTemplate200ResponseDaysInnerItemsInner> items) {
    this.items = items;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMealPlanTemplate200ResponseDaysInner getMealPlanTemplate200ResponseDaysInner = (GetMealPlanTemplate200ResponseDaysInner) o;
    return Objects.equals(this.nutritionSummary, getMealPlanTemplate200ResponseDaysInner.nutritionSummary) &&
        Objects.equals(this.nutritionSummaryBreakfast, getMealPlanTemplate200ResponseDaysInner.nutritionSummaryBreakfast) &&
        Objects.equals(this.nutritionSummaryLunch, getMealPlanTemplate200ResponseDaysInner.nutritionSummaryLunch) &&
        Objects.equals(this.nutritionSummaryDinner, getMealPlanTemplate200ResponseDaysInner.nutritionSummaryDinner) &&
        Objects.equals(this.day, getMealPlanTemplate200ResponseDaysInner.day) &&
        Objects.equals(this.items, getMealPlanTemplate200ResponseDaysInner.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nutritionSummary, nutritionSummaryBreakfast, nutritionSummaryLunch, nutritionSummaryDinner, day, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMealPlanTemplate200ResponseDaysInner {\n");
    sb.append("    nutritionSummary: ").append(toIndentedString(nutritionSummary)).append("\n");
    sb.append("    nutritionSummaryBreakfast: ").append(toIndentedString(nutritionSummaryBreakfast)).append("\n");
    sb.append("    nutritionSummaryLunch: ").append(toIndentedString(nutritionSummaryLunch)).append("\n");
    sb.append("    nutritionSummaryDinner: ").append(toIndentedString(nutritionSummaryDinner)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    openapiFields.add("nutritionSummary");
    openapiFields.add("nutritionSummaryBreakfast");
    openapiFields.add("nutritionSummaryLunch");
    openapiFields.add("nutritionSummaryDinner");
    openapiFields.add("day");
    openapiFields.add("items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("day");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetMealPlanTemplate200ResponseDaysInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetMealPlanTemplate200ResponseDaysInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMealPlanTemplate200ResponseDaysInner is not found in the empty JSON string", GetMealPlanTemplate200ResponseDaysInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetMealPlanTemplate200ResponseDaysInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetMealPlanTemplate200ResponseDaysInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetMealPlanTemplate200ResponseDaysInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `nutritionSummary`
      if (jsonObj.getAsJsonObject("nutritionSummary") != null) {
        GetMealPlanWeek200ResponseDaysInnerNutritionSummary.validateJsonObject(jsonObj.getAsJsonObject("nutritionSummary"));
      }
      // validate the optional field `nutritionSummaryBreakfast`
      if (jsonObj.getAsJsonObject("nutritionSummaryBreakfast") != null) {
        GetMealPlanWeek200ResponseDaysInnerNutritionSummary.validateJsonObject(jsonObj.getAsJsonObject("nutritionSummaryBreakfast"));
      }
      // validate the optional field `nutritionSummaryLunch`
      if (jsonObj.getAsJsonObject("nutritionSummaryLunch") != null) {
        GetMealPlanWeek200ResponseDaysInnerNutritionSummary.validateJsonObject(jsonObj.getAsJsonObject("nutritionSummaryLunch"));
      }
      // validate the optional field `nutritionSummaryDinner`
      if (jsonObj.getAsJsonObject("nutritionSummaryDinner") != null) {
        GetMealPlanWeek200ResponseDaysInnerNutritionSummary.validateJsonObject(jsonObj.getAsJsonObject("nutritionSummaryDinner"));
      }
      if (jsonObj.get("day") != null && !jsonObj.get("day").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `day` to be a primitive type in the JSON string but got `%s`", jsonObj.get("day").toString()));
      }
      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      if (jsonArrayitems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("items").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
        }

        // validate the optional field `items` (array)
        for (int i = 0; i < jsonArrayitems.size(); i++) {
          GetMealPlanTemplate200ResponseDaysInnerItemsInner.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetMealPlanTemplate200ResponseDaysInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMealPlanTemplate200ResponseDaysInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMealPlanTemplate200ResponseDaysInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMealPlanTemplate200ResponseDaysInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMealPlanTemplate200ResponseDaysInner>() {
           @Override
           public void write(JsonWriter out, GetMealPlanTemplate200ResponseDaysInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetMealPlanTemplate200ResponseDaysInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetMealPlanTemplate200ResponseDaysInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetMealPlanTemplate200ResponseDaysInner
  * @throws IOException if the JSON string is invalid with respect to GetMealPlanTemplate200ResponseDaysInner
  */
  public static GetMealPlanTemplate200ResponseDaysInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMealPlanTemplate200ResponseDaysInner.class);
  }

 /**
  * Convert an instance of GetMealPlanTemplate200ResponseDaysInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

