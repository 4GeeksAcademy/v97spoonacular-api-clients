/*
 * spoonacular API
 *
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.1
 * Contact: mail@spoonacular.com
 * Generated by: https://openapi-generator.tech
 */

/// GetIngredientInformation200Response : 



#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct GetIngredientInformation200Response {
    #[serde(rename = "id")]
    pub id: i32,
    #[serde(rename = "original")]
    pub original: String,
    #[serde(rename = "originalName")]
    pub original_name: String,
    #[serde(rename = "name")]
    pub name: String,
    #[serde(rename = "nameClean")]
    pub name_clean: String,
    #[serde(rename = "amount")]
    pub amount: f32,
    #[serde(rename = "unit")]
    pub unit: String,
    #[serde(rename = "unitShort")]
    pub unit_short: String,
    #[serde(rename = "unitLong")]
    pub unit_long: String,
    #[serde(rename = "possibleUnits")]
    pub possible_units: Vec<String>,
    #[serde(rename = "estimatedCost")]
    pub estimated_cost: Box<crate::models::ParseIngredients200ResponseInnerEstimatedCost>,
    #[serde(rename = "consistency")]
    pub consistency: String,
    #[serde(rename = "shoppingListUnits")]
    pub shopping_list_units: Vec<String>,
    #[serde(rename = "aisle")]
    pub aisle: String,
    #[serde(rename = "image")]
    pub image: String,
    #[serde(rename = "meta")]
    pub meta: Vec<serde_json::Value>,
    #[serde(rename = "nutrition")]
    pub nutrition: Box<crate::models::GetIngredientInformation200ResponseNutrition>,
    #[serde(rename = "categoryPath")]
    pub category_path: Vec<String>,
}

impl GetIngredientInformation200Response {
    /// 
    pub fn new(id: i32, original: String, original_name: String, name: String, name_clean: String, amount: f32, unit: String, unit_short: String, unit_long: String, possible_units: Vec<String>, estimated_cost: crate::models::ParseIngredients200ResponseInnerEstimatedCost, consistency: String, shopping_list_units: Vec<String>, aisle: String, image: String, meta: Vec<serde_json::Value>, nutrition: crate::models::GetIngredientInformation200ResponseNutrition, category_path: Vec<String>) -> GetIngredientInformation200Response {
        GetIngredientInformation200Response {
            id,
            original,
            original_name,
            name,
            name_clean,
            amount,
            unit,
            unit_short,
            unit_long,
            possible_units,
            estimated_cost: Box::new(estimated_cost),
            consistency,
            shopping_list_units,
            aisle,
            image,
            meta,
            nutrition: Box::new(nutrition),
            category_path,
        }
    }
}


