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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.spoonacular.client.model.GetRecipeInformation200ResponseExtendedIngredientsInner;
import com.spoonacular.client.model.GetRecipeInformation200ResponseWinePairing;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for GetRecipeInformation200Response
 */
public class GetRecipeInformation200ResponseTest {
    private final GetRecipeInformation200Response model = new GetRecipeInformation200Response();

    /**
     * Model tests for GetRecipeInformation200Response
     */
    @Test
    public void testGetRecipeInformation200Response() {
        // TODO: test GetRecipeInformation200Response
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'title'
     */
    @Test
    public void titleTest() {
        // TODO: test title
    }

    /**
     * Test the property 'image'
     */
    @Test
    public void imageTest() {
        // TODO: test image
    }

    /**
     * Test the property 'imageType'
     */
    @Test
    public void imageTypeTest() {
        // TODO: test imageType
    }

    /**
     * Test the property 'servings'
     */
    @Test
    public void servingsTest() {
        // TODO: test servings
    }

    /**
     * Test the property 'readyInMinutes'
     */
    @Test
    public void readyInMinutesTest() {
        // TODO: test readyInMinutes
    }

    /**
     * Test the property 'license'
     */
    @Test
    public void licenseTest() {
        // TODO: test license
    }

    /**
     * Test the property 'sourceName'
     */
    @Test
    public void sourceNameTest() {
        // TODO: test sourceName
    }

    /**
     * Test the property 'sourceUrl'
     */
    @Test
    public void sourceUrlTest() {
        // TODO: test sourceUrl
    }

    /**
     * Test the property 'spoonacularSourceUrl'
     */
    @Test
    public void spoonacularSourceUrlTest() {
        // TODO: test spoonacularSourceUrl
    }

    /**
     * Test the property 'aggregateLikes'
     */
    @Test
    public void aggregateLikesTest() {
        // TODO: test aggregateLikes
    }

    /**
     * Test the property 'healthScore'
     */
    @Test
    public void healthScoreTest() {
        // TODO: test healthScore
    }

    /**
     * Test the property 'spoonacularScore'
     */
    @Test
    public void spoonacularScoreTest() {
        // TODO: test spoonacularScore
    }

    /**
     * Test the property 'pricePerServing'
     */
    @Test
    public void pricePerServingTest() {
        // TODO: test pricePerServing
    }

    /**
     * Test the property 'analyzedInstructions'
     */
    @Test
    public void analyzedInstructionsTest() {
        // TODO: test analyzedInstructions
    }

    /**
     * Test the property 'cheap'
     */
    @Test
    public void cheapTest() {
        // TODO: test cheap
    }

    /**
     * Test the property 'creditsText'
     */
    @Test
    public void creditsTextTest() {
        // TODO: test creditsText
    }

    /**
     * Test the property 'cuisines'
     */
    @Test
    public void cuisinesTest() {
        // TODO: test cuisines
    }

    /**
     * Test the property 'dairyFree'
     */
    @Test
    public void dairyFreeTest() {
        // TODO: test dairyFree
    }

    /**
     * Test the property 'diets'
     */
    @Test
    public void dietsTest() {
        // TODO: test diets
    }

    /**
     * Test the property 'gaps'
     */
    @Test
    public void gapsTest() {
        // TODO: test gaps
    }

    /**
     * Test the property 'glutenFree'
     */
    @Test
    public void glutenFreeTest() {
        // TODO: test glutenFree
    }

    /**
     * Test the property 'instructions'
     */
    @Test
    public void instructionsTest() {
        // TODO: test instructions
    }

    /**
     * Test the property 'ketogenic'
     */
    @Test
    public void ketogenicTest() {
        // TODO: test ketogenic
    }

    /**
     * Test the property 'lowFodmap'
     */
    @Test
    public void lowFodmapTest() {
        // TODO: test lowFodmap
    }

    /**
     * Test the property 'occasions'
     */
    @Test
    public void occasionsTest() {
        // TODO: test occasions
    }

    /**
     * Test the property 'sustainable'
     */
    @Test
    public void sustainableTest() {
        // TODO: test sustainable
    }

    /**
     * Test the property 'vegan'
     */
    @Test
    public void veganTest() {
        // TODO: test vegan
    }

    /**
     * Test the property 'vegetarian'
     */
    @Test
    public void vegetarianTest() {
        // TODO: test vegetarian
    }

    /**
     * Test the property 'veryHealthy'
     */
    @Test
    public void veryHealthyTest() {
        // TODO: test veryHealthy
    }

    /**
     * Test the property 'veryPopular'
     */
    @Test
    public void veryPopularTest() {
        // TODO: test veryPopular
    }

    /**
     * Test the property 'whole30'
     */
    @Test
    public void whole30Test() {
        // TODO: test whole30
    }

    /**
     * Test the property 'weightWatcherSmartPoints'
     */
    @Test
    public void weightWatcherSmartPointsTest() {
        // TODO: test weightWatcherSmartPoints
    }

    /**
     * Test the property 'dishTypes'
     */
    @Test
    public void dishTypesTest() {
        // TODO: test dishTypes
    }

    /**
     * Test the property 'extendedIngredients'
     */
    @Test
    public void extendedIngredientsTest() {
        // TODO: test extendedIngredients
    }

    /**
     * Test the property 'summary'
     */
    @Test
    public void summaryTest() {
        // TODO: test summary
    }

    /**
     * Test the property 'winePairing'
     */
    @Test
    public void winePairingTest() {
        // TODO: test winePairing
    }

}
