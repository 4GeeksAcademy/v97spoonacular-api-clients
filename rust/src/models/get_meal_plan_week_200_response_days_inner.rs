/*
 * spoonacular API
 *
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.1
 * Contact: mail@spoonacular.com
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct GetMealPlanWeek200ResponseDaysInner {
    #[serde(rename = "nutritionSummary", skip_serializing_if = "Option::is_none")]
    pub nutrition_summary: Option<Box<crate::models::GetMealPlanWeek200ResponseDaysInnerNutritionSummary>>,
    #[serde(rename = "nutritionSummaryBreakfast", skip_serializing_if = "Option::is_none")]
    pub nutrition_summary_breakfast: Option<Box<crate::models::GetMealPlanWeek200ResponseDaysInnerNutritionSummary>>,
    #[serde(rename = "nutritionSummaryLunch", skip_serializing_if = "Option::is_none")]
    pub nutrition_summary_lunch: Option<Box<crate::models::GetMealPlanWeek200ResponseDaysInnerNutritionSummary>>,
    #[serde(rename = "nutritionSummaryDinner", skip_serializing_if = "Option::is_none")]
    pub nutrition_summary_dinner: Option<Box<crate::models::GetMealPlanWeek200ResponseDaysInnerNutritionSummary>>,
    #[serde(rename = "date")]
    pub date: f32,
    #[serde(rename = "day")]
    pub day: String,
    #[serde(rename = "items", skip_serializing_if = "Option::is_none")]
    pub items: Option<Vec<crate::models::GetMealPlanWeek200ResponseDaysInnerItemsInner>>,
}

impl GetMealPlanWeek200ResponseDaysInner {
    pub fn new(date: f32, day: String) -> GetMealPlanWeek200ResponseDaysInner {
        GetMealPlanWeek200ResponseDaysInner {
            nutrition_summary: None,
            nutrition_summary_breakfast: None,
            nutrition_summary_lunch: None,
            nutrition_summary_dinner: None,
            date,
            day,
            items: None,
        }
    }
}

