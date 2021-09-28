/*
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.0
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
import com.spoonacular.client.model.FoodIngredientsMapProducts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20034
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-28T20:40:32.759+02:00[Europe/Berlin]")
public class InlineResponse20034 {
  public static final String SERIALIZED_NAME_ORIGINAL = "original";
  @SerializedName(SERIALIZED_NAME_ORIGINAL)
  private String original;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME = "originalName";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME)
  private String originalName;

  public static final String SERIALIZED_NAME_INGREDIENT_IMAGE = "ingredientImage";
  @SerializedName(SERIALIZED_NAME_INGREDIENT_IMAGE)
  private String ingredientImage;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private List<String> meta = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<FoodIngredientsMapProducts> products = new ArrayList<>();

  public InlineResponse20034 original(String original) {
    this.original = original;
    return this;
  }

   /**
   * Get original
   * @return original
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOriginal() {
    return original;
  }

  public void setOriginal(String original) {
    this.original = original;
  }

  public InlineResponse20034 originalName(String originalName) {
    this.originalName = originalName;
    return this;
  }

   /**
   * Get originalName
   * @return originalName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOriginalName() {
    return originalName;
  }

  public void setOriginalName(String originalName) {
    this.originalName = originalName;
  }

  public InlineResponse20034 ingredientImage(String ingredientImage) {
    this.ingredientImage = ingredientImage;
    return this;
  }

   /**
   * Get ingredientImage
   * @return ingredientImage
  **/
  @ApiModelProperty(required = true, value = "")
  public String getIngredientImage() {
    return ingredientImage;
  }

  public void setIngredientImage(String ingredientImage) {
    this.ingredientImage = ingredientImage;
  }

  public InlineResponse20034 meta(List<String> meta) {
    this.meta = meta;
    return this;
  }

  public InlineResponse20034 addMetaItem(String metaItem) {
    this.meta.add(metaItem);
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getMeta() {
    return meta;
  }

  public void setMeta(List<String> meta) {
    this.meta = meta;
  }

  public InlineResponse20034 products(List<FoodIngredientsMapProducts> products) {
    this.products = products;
    return this;
  }

  public InlineResponse20034 addProductsItem(FoodIngredientsMapProducts productsItem) {
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @ApiModelProperty(required = true, value = "")
  public List<FoodIngredientsMapProducts> getProducts() {
    return products;
  }

  public void setProducts(List<FoodIngredientsMapProducts> products) {
    this.products = products;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20034 inlineResponse20034 = (InlineResponse20034) o;
    return Objects.equals(this.original, inlineResponse20034.original) &&
        Objects.equals(this.originalName, inlineResponse20034.originalName) &&
        Objects.equals(this.ingredientImage, inlineResponse20034.ingredientImage) &&
        Objects.equals(this.meta, inlineResponse20034.meta) &&
        Objects.equals(this.products, inlineResponse20034.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(original, originalName, ingredientImage, meta, products);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20034 {\n");
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
    sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
    sb.append("    ingredientImage: ").append(toIndentedString(ingredientImage)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
