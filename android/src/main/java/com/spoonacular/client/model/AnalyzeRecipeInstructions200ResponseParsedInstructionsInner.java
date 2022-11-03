/**
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

import com.spoonacular.client.model.AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class AnalyzeRecipeInstructions200ResponseParsedInstructionsInner {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("steps")
  private Set<AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner> steps = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Set<AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner> getSteps() {
    return steps;
  }
  public void setSteps(Set<AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner> steps) {
    this.steps = steps;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyzeRecipeInstructions200ResponseParsedInstructionsInner analyzeRecipeInstructions200ResponseParsedInstructionsInner = (AnalyzeRecipeInstructions200ResponseParsedInstructionsInner) o;
    return (this.name == null ? analyzeRecipeInstructions200ResponseParsedInstructionsInner.name == null : this.name.equals(analyzeRecipeInstructions200ResponseParsedInstructionsInner.name)) &&
        (this.steps == null ? analyzeRecipeInstructions200ResponseParsedInstructionsInner.steps == null : this.steps.equals(analyzeRecipeInstructions200ResponseParsedInstructionsInner.steps));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.steps == null ? 0: this.steps.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyzeRecipeInstructions200ResponseParsedInstructionsInner {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  steps: ").append(steps).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
