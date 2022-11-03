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

# Unit tests for OpenapiClient::ProductsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'ProductsApi' do
  before do
    # run before each test
    @api_instance = OpenapiClient::ProductsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ProductsApi' do
    it 'should create an instance of ProductsApi' do
      expect(@api_instance).to be_instance_of(OpenapiClient::ProductsApi)
    end
  end

  # unit tests for autocomplete_product_search
  # Autocomplete Product Search
  # Generate suggestions for grocery products based on a (partial) query. The matches will be found by looking in the title only.
  # @param query The (partial) search query.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :number The number of results to return (between 1 and 25).
  # @return [AutocompleteProductSearch200Response]
  describe 'autocomplete_product_search test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for classify_grocery_product
  # Classify Grocery Product
  # This endpoint allows you to match a packaged food to a basic category, e.g. a specific brand of milk to the category milk.
  # @param classify_grocery_product_request 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :locale The display name of the returned category, supported is en_US (for American English) and en_GB (for British English).
  # @return [ClassifyGroceryProduct200Response]
  describe 'classify_grocery_product test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for classify_grocery_product_bulk
  # Classify Grocery Product Bulk
  # Provide a set of product jsons, get back classified products.
  # @param classify_grocery_product_bulk_request_inner 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :locale The display name of the returned category, supported is en_US (for American English) and en_GB (for British English).
  # @return [Array<ClassifyGroceryProductBulk200ResponseInner>]
  describe 'classify_grocery_product_bulk test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_comparable_products
  # Get Comparable Products
  # Find comparable products to the given one.
  # @param upc The UPC of the product for which you want to find comparable products.
  # @param [Hash] opts the optional parameters
  # @return [GetComparableProducts200Response]
  describe 'get_comparable_products test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_product_information
  # Get Product Information
  # Use a product id to get full information about a product, such as ingredients, nutrition, etc. The nutritional information is per serving.
  # @param id The item&#39;s id.
  # @param [Hash] opts the optional parameters
  # @return [GetProductInformation200Response]
  describe 'get_product_information test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for product_nutrition_by_id_image
  # Product Nutrition by ID Image
  # Visualize a product&#39;s nutritional information as an image.
  # @param id The id of the product.
  # @param [Hash] opts the optional parameters
  # @return [Object]
  describe 'product_nutrition_by_id_image test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for product_nutrition_label_image
  # Product Nutrition Label Image
  # Get a product&#39;s nutrition label as an image.
  # @param id The product id.
  # @param [Hash] opts the optional parameters
  # @option opts [Boolean] :show_optional_nutrients Whether to show optional nutrients.
  # @option opts [Boolean] :show_zero_values Whether to show zero values.
  # @option opts [Boolean] :show_ingredients Whether to show a list of ingredients.
  # @return [Object]
  describe 'product_nutrition_label_image test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for product_nutrition_label_widget
  # Product Nutrition Label Widget
  # Get a product&#39;s nutrition label as an HTML widget.
  # @param id The product id.
  # @param [Hash] opts the optional parameters
  # @option opts [Boolean] :default_css Whether the default CSS should be added to the response.
  # @option opts [Boolean] :show_optional_nutrients Whether to show optional nutrients.
  # @option opts [Boolean] :show_zero_values Whether to show zero values.
  # @option opts [Boolean] :show_ingredients Whether to show a list of ingredients.
  # @return [String]
  describe 'product_nutrition_label_widget test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for search_grocery_products
  # Search Grocery Products
  # Search packaged food products, such as frozen pizza or Greek yogurt.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :query The (natural language) search query.
  # @option opts [Float] :min_calories The minimum amount of calories the product must have.
  # @option opts [Float] :max_calories The maximum amount of calories the product can have.
  # @option opts [Float] :min_carbs The minimum amount of carbohydrates in grams the product must have.
  # @option opts [Float] :max_carbs The maximum amount of carbohydrates in grams the product can have.
  # @option opts [Float] :min_protein The minimum amount of protein in grams the product must have.
  # @option opts [Float] :max_protein The maximum amount of protein in grams the product can have.
  # @option opts [Float] :min_fat The minimum amount of fat in grams the product must have.
  # @option opts [Float] :max_fat The maximum amount of fat in grams the product can have.
  # @option opts [Boolean] :add_product_information If set to true, you get more information about the products returned.
  # @option opts [Integer] :offset The number of results to skip (between 0 and 900).
  # @option opts [Integer] :number The maximum number of items to return (between 1 and 100). Defaults to 10.
  # @return [SearchGroceryProducts200Response]
  describe 'search_grocery_products test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for search_grocery_products_by_upc
  # Search Grocery Products by UPC
  # Get information about a packaged food using its UPC.
  # @param upc The product&#39;s UPC.
  # @param [Hash] opts the optional parameters
  # @return [SearchGroceryProductsByUPC200Response]
  describe 'search_grocery_products_by_upc test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for visualize_product_nutrition_by_id
  # Product Nutrition by ID Widget
  # Visualize a product&#39;s nutritional information as HTML including CSS.
  # @param id The item&#39;s id.
  # @param [Hash] opts the optional parameters
  # @option opts [Boolean] :default_css Whether the default CSS should be added to the response.
  # @option opts [String] :accept Accept header.
  # @return [String]
  describe 'visualize_product_nutrition_by_id test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
