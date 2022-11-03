=begin
#spoonacular API

#The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

The version of the OpenAPI document: 1.1
Contact: mail@spoonacular.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.0.1

=end

require 'spec_helper'
require 'json'

# Unit tests for OpenapiClient::MiscApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'MiscApi' do
  before do
    # run before each test
    @api_instance = OpenapiClient::MiscApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of MiscApi' do
    it 'should create an instance of MiscApi' do
      expect(@api_instance).to be_instance_of(OpenapiClient::MiscApi)
    end
  end

  # unit tests for detect_food_in_text
  # Detect Food in Text
  # Take any text and find all mentions of food contained within it. This task is also called Named Entity Recognition (NER). In this case, the entities are foods. Either dishes, such as pizza or cheeseburger, or ingredients, such as cucumber or almonds.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :content_type The content type.
  # @return [DetectFoodInText200Response]
  describe 'detect_food_in_text test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_a_random_food_joke
  # Random Food Joke
  # Get a random joke that is related to food. Caution: this is an endpoint for adults!
  # @param [Hash] opts the optional parameters
  # @return [GetARandomFoodJoke200Response]
  describe 'get_a_random_food_joke test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_conversation_suggests
  # Conversation Suggests
  # This endpoint returns suggestions for things the user can say or ask the chatbot.
  # @param query A (partial) query from the user. The endpoint will return if it matches topics it can talk about.
  # @param [Hash] opts the optional parameters
  # @option opts [Float] :number The number of suggestions to return (between 1 and 25).
  # @return [GetConversationSuggests200Response]
  describe 'get_conversation_suggests test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_random_food_trivia
  # Random Food Trivia
  # Returns random food trivia.
  # @param [Hash] opts the optional parameters
  # @return [GetRandomFoodTrivia200Response]
  describe 'get_random_food_trivia test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for image_analysis_by_url
  # Image Analysis by URL
  # Analyze a food image. The API tries to classify the image, guess the nutrition, and find a matching recipes.
  # @param image_url The URL of the image to be analyzed.
  # @param [Hash] opts the optional parameters
  # @return [ImageAnalysisByURL200Response]
  describe 'image_analysis_by_url test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for image_classification_by_url
  # Image Classification by URL
  # Classify a food image.
  # @param image_url The URL of the image to be classified.
  # @param [Hash] opts the optional parameters
  # @return [ImageClassificationByURL200Response]
  describe 'image_classification_by_url test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for search_all_food
  # Search All Food
  # Search all food content with one call. That includes recipes, grocery products, menu items, simple foods (ingredients), and food videos.
  # @param query The search query.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :offset The number of results to skip (between 0 and 900).
  # @option opts [Integer] :number The maximum number of items to return (between 1 and 100). Defaults to 10.
  # @return [SearchAllFood200Response]
  describe 'search_all_food test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for search_custom_foods
  # Search Custom Foods
  # Search custom foods in a user&#39;s account.
  # @param username The username.
  # @param hash The private hash for the username.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :query The (natural language) search query.
  # @option opts [Integer] :offset The number of results to skip (between 0 and 900).
  # @option opts [Integer] :number The maximum number of items to return (between 1 and 100). Defaults to 10.
  # @return [SearchCustomFoods200Response]
  describe 'search_custom_foods test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for search_food_videos
  # Search Food Videos
  # Find recipe and other food related videos.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :query The (natural language) search query.
  # @option opts [String] :type The type of the recipes. See a full list of supported meal types.
  # @option opts [String] :cuisine The cuisine(s) of the recipes. One or more, comma separated. See a full list of supported cuisines.
  # @option opts [String] :diet The diet for which the recipes must be suitable. See a full list of supported diets.
  # @option opts [String] :include_ingredients A comma-separated list of ingredients that the recipes should contain.
  # @option opts [String] :exclude_ingredients A comma-separated list of ingredients or ingredient types that the recipes must not contain.
  # @option opts [Float] :min_length Minimum video length in seconds.
  # @option opts [Float] :max_length Maximum video length in seconds.
  # @option opts [Integer] :offset The number of results to skip (between 0 and 900).
  # @option opts [Integer] :number The maximum number of items to return (between 1 and 100). Defaults to 10.
  # @return [SearchFoodVideos200Response]
  describe 'search_food_videos test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for search_site_content
  # Search Site Content
  # Search spoonacular&#39;s site content. You&#39;ll be able to find everything that you could also find using the search suggestions on spoonacular.com. This is a suggest API so you can send partial strings as queries.
  # @param query The query to search for. You can also use partial queries such as \&quot;spagh\&quot; to already find spaghetti recipes, articles, grocery products, and other content.
  # @param [Hash] opts the optional parameters
  # @return [SearchSiteContent200Response]
  describe 'search_site_content test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for talk_to_chatbot
  # Talk to Chatbot
  # This endpoint can be used to have a conversation about food with the spoonacular chatbot. Use the \&quot;Get Conversation Suggests\&quot; endpoint to show your user what he or she can say.
  # @param text The request / question / answer from the user to the chatbot.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :context_id An arbitrary globally unique id for your conversation. The conversation can contain states so you should pass your context id if you want the bot to be able to remember the conversation.
  # @return [TalkToChatbot200Response]
  describe 'talk_to_chatbot test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
