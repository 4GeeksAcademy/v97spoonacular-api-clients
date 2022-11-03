#import <Foundation/Foundation.h>
#import "OAIDetectFoodInText200Response.h"
#import "OAIGetARandomFoodJoke200Response.h"
#import "OAIGetConversationSuggests200Response.h"
#import "OAIGetRandomFoodTrivia200Response.h"
#import "OAIImageAnalysisByURL200Response.h"
#import "OAIImageClassificationByURL200Response.h"
#import "OAISearchAllFood200Response.h"
#import "OAISearchCustomFoods200Response.h"
#import "OAISearchFoodVideos200Response.h"
#import "OAISearchSiteContent200Response.h"
#import "OAITalkToChatbot200Response.h"
#import "OAIApi.h"

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



@interface OAIMiscApi: NSObject <OAIApi>

extern NSString* kOAIMiscApiErrorDomain;
extern NSInteger kOAIMiscApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Detect Food in Text
/// Take any text and find all mentions of food contained within it. This task is also called Named Entity Recognition (NER). In this case, the entities are foods. Either dishes, such as pizza or cheeseburger, or ingredients, such as cucumber or almonds.
///
/// @param contentType The content type. (optional)
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return OAIDetectFoodInText200Response*
-(NSURLSessionTask*) detectFoodInTextWithContentType: (NSString*) contentType
    completionHandler: (void (^)(OAIDetectFoodInText200Response* output, NSError* error)) handler;


/// Random Food Joke
/// Get a random joke that is related to food. Caution: this is an endpoint for adults!
///
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return OAIGetARandomFoodJoke200Response*
-(NSURLSessionTask*) getARandomFoodJokeWithCompletionHandler: 
    (void (^)(OAIGetARandomFoodJoke200Response* output, NSError* error)) handler;


/// Conversation Suggests
/// This endpoint returns suggestions for things the user can say or ask the chatbot.
///
/// @param query A (partial) query from the user. The endpoint will return if it matches topics it can talk about.
/// @param number The number of suggestions to return (between 1 and 25). (optional)
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return OAIGetConversationSuggests200Response*
-(NSURLSessionTask*) getConversationSuggestsWithQuery: (NSString*) query
    number: (NSNumber*) number
    completionHandler: (void (^)(OAIGetConversationSuggests200Response* output, NSError* error)) handler;


/// Random Food Trivia
/// Returns random food trivia.
///
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return OAIGetRandomFoodTrivia200Response*
-(NSURLSessionTask*) getRandomFoodTriviaWithCompletionHandler: 
    (void (^)(OAIGetRandomFoodTrivia200Response* output, NSError* error)) handler;


/// Image Analysis by URL
/// Analyze a food image. The API tries to classify the image, guess the nutrition, and find a matching recipes.
///
/// @param imageUrl The URL of the image to be analyzed.
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return OAIImageAnalysisByURL200Response*
-(NSURLSessionTask*) imageAnalysisByURLWithImageUrl: (NSString*) imageUrl
    completionHandler: (void (^)(OAIImageAnalysisByURL200Response* output, NSError* error)) handler;


/// Image Classification by URL
/// Classify a food image.
///
/// @param imageUrl The URL of the image to be classified.
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return OAIImageClassificationByURL200Response*
-(NSURLSessionTask*) imageClassificationByURLWithImageUrl: (NSString*) imageUrl
    completionHandler: (void (^)(OAIImageClassificationByURL200Response* output, NSError* error)) handler;


/// Search All Food
/// Search all food content with one call. That includes recipes, grocery products, menu items, simple foods (ingredients), and food videos.
///
/// @param query The search query.
/// @param offset The number of results to skip (between 0 and 900). (optional)
/// @param number The maximum number of items to return (between 1 and 100). Defaults to 10. (optional) (default to @10)
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return OAISearchAllFood200Response*
-(NSURLSessionTask*) searchAllFoodWithQuery: (NSString*) query
    offset: (NSNumber*) offset
    number: (NSNumber*) number
    completionHandler: (void (^)(OAISearchAllFood200Response* output, NSError* error)) handler;


/// Search Custom Foods
/// Search custom foods in a user's account.
///
/// @param username The username.
/// @param hash The private hash for the username.
/// @param query The (natural language) search query. (optional)
/// @param offset The number of results to skip (between 0 and 900). (optional)
/// @param number The maximum number of items to return (between 1 and 100). Defaults to 10. (optional) (default to @10)
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return OAISearchCustomFoods200Response*
-(NSURLSessionTask*) searchCustomFoodsWithUsername: (NSString*) username
    hash: (NSString*) hash
    query: (NSString*) query
    offset: (NSNumber*) offset
    number: (NSNumber*) number
    completionHandler: (void (^)(OAISearchCustomFoods200Response* output, NSError* error)) handler;


/// Search Food Videos
/// Find recipe and other food related videos.
///
/// @param query The (natural language) search query. (optional)
/// @param type The type of the recipes. See a full list of supported meal types. (optional)
/// @param cuisine The cuisine(s) of the recipes. One or more, comma separated. See a full list of supported cuisines. (optional)
/// @param diet The diet for which the recipes must be suitable. See a full list of supported diets. (optional)
/// @param includeIngredients A comma-separated list of ingredients that the recipes should contain. (optional)
/// @param excludeIngredients A comma-separated list of ingredients or ingredient types that the recipes must not contain. (optional)
/// @param minLength Minimum video length in seconds. (optional)
/// @param maxLength Maximum video length in seconds. (optional)
/// @param offset The number of results to skip (between 0 and 900). (optional)
/// @param number The maximum number of items to return (between 1 and 100). Defaults to 10. (optional) (default to @10)
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return OAISearchFoodVideos200Response*
-(NSURLSessionTask*) searchFoodVideosWithQuery: (NSString*) query
    type: (NSString*) type
    cuisine: (NSString*) cuisine
    diet: (NSString*) diet
    includeIngredients: (NSString*) includeIngredients
    excludeIngredients: (NSString*) excludeIngredients
    minLength: (NSNumber*) minLength
    maxLength: (NSNumber*) maxLength
    offset: (NSNumber*) offset
    number: (NSNumber*) number
    completionHandler: (void (^)(OAISearchFoodVideos200Response* output, NSError* error)) handler;


/// Search Site Content
/// Search spoonacular's site content. You'll be able to find everything that you could also find using the search suggestions on spoonacular.com. This is a suggest API so you can send partial strings as queries.
///
/// @param query The query to search for. You can also use partial queries such as \&quot;spagh\&quot; to already find spaghetti recipes, articles, grocery products, and other content.
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return OAISearchSiteContent200Response*
-(NSURLSessionTask*) searchSiteContentWithQuery: (NSString*) query
    completionHandler: (void (^)(OAISearchSiteContent200Response* output, NSError* error)) handler;


/// Talk to Chatbot
/// This endpoint can be used to have a conversation about food with the spoonacular chatbot. Use the \"Get Conversation Suggests\" endpoint to show your user what he or she can say.
///
/// @param text The request / question / answer from the user to the chatbot.
/// @param contextId An arbitrary globally unique id for your conversation. The conversation can contain states so you should pass your context id if you want the bot to be able to remember the conversation. (optional)
/// 
///  code:200 message:"Success",
///  code:401 message:"Unauthorized",
///  code:403 message:"Forbidden",
///  code:404 message:"Not Found"
///
/// @return OAITalkToChatbot200Response*
-(NSURLSessionTask*) talkToChatbotWithText: (NSString*) text
    contextId: (NSString*) contextId
    completionHandler: (void (^)(OAITalkToChatbot200Response* output, NSError* error)) handler;



@end
