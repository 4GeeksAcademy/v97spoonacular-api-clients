=begin comment

spoonacular API

The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

The version of the OpenAPI document: 1.1
Contact: mail@spoonacular.com
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator
# Please update the test cases below to test the API endpoints.
# Ref: https://openapi-generator.tech
#
use Test::More tests => 1; #TODO update number of test cases
use Test::Exception;

use lib 'lib';
use strict;
use warnings;

use_ok('WWW::OpenAPIClient::ProductsApi');

my $api = WWW::OpenAPIClient::ProductsApi->new();
isa_ok($api, 'WWW::OpenAPIClient::ProductsApi');

#
# autocomplete_product_search test
#
# uncomment below and update the test
#my $autocomplete_product_search_query = undef; # replace NULL with a proper value
#my $autocomplete_product_search_number = undef; # replace NULL with a proper value
#my $autocomplete_product_search_result = $api->autocomplete_product_search(query => $autocomplete_product_search_query, number => $autocomplete_product_search_number);

#
# classify_grocery_product test
#
# uncomment below and update the test
#my $classify_grocery_product_classify_grocery_product_request = undef; # replace NULL with a proper value
#my $classify_grocery_product_locale = undef; # replace NULL with a proper value
#my $classify_grocery_product_result = $api->classify_grocery_product(classify_grocery_product_request => $classify_grocery_product_classify_grocery_product_request, locale => $classify_grocery_product_locale);

#
# classify_grocery_product_bulk test
#
# uncomment below and update the test
#my $classify_grocery_product_bulk_classify_grocery_product_bulk_request_inner = undef; # replace NULL with a proper value
#my $classify_grocery_product_bulk_locale = undef; # replace NULL with a proper value
#my $classify_grocery_product_bulk_result = $api->classify_grocery_product_bulk(classify_grocery_product_bulk_request_inner => $classify_grocery_product_bulk_classify_grocery_product_bulk_request_inner, locale => $classify_grocery_product_bulk_locale);

#
# get_comparable_products test
#
# uncomment below and update the test
#my $get_comparable_products_upc = undef; # replace NULL with a proper value
#my $get_comparable_products_result = $api->get_comparable_products(upc => $get_comparable_products_upc);

#
# get_product_information test
#
# uncomment below and update the test
#my $get_product_information_id = undef; # replace NULL with a proper value
#my $get_product_information_result = $api->get_product_information(id => $get_product_information_id);

#
# product_nutrition_by_id_image test
#
# uncomment below and update the test
#my $product_nutrition_by_id_image_id = undef; # replace NULL with a proper value
#my $product_nutrition_by_id_image_result = $api->product_nutrition_by_id_image(id => $product_nutrition_by_id_image_id);

#
# product_nutrition_label_image test
#
# uncomment below and update the test
#my $product_nutrition_label_image_id = undef; # replace NULL with a proper value
#my $product_nutrition_label_image_show_optional_nutrients = undef; # replace NULL with a proper value
#my $product_nutrition_label_image_show_zero_values = undef; # replace NULL with a proper value
#my $product_nutrition_label_image_show_ingredients = undef; # replace NULL with a proper value
#my $product_nutrition_label_image_result = $api->product_nutrition_label_image(id => $product_nutrition_label_image_id, show_optional_nutrients => $product_nutrition_label_image_show_optional_nutrients, show_zero_values => $product_nutrition_label_image_show_zero_values, show_ingredients => $product_nutrition_label_image_show_ingredients);

#
# product_nutrition_label_widget test
#
# uncomment below and update the test
#my $product_nutrition_label_widget_id = undef; # replace NULL with a proper value
#my $product_nutrition_label_widget_default_css = undef; # replace NULL with a proper value
#my $product_nutrition_label_widget_show_optional_nutrients = undef; # replace NULL with a proper value
#my $product_nutrition_label_widget_show_zero_values = undef; # replace NULL with a proper value
#my $product_nutrition_label_widget_show_ingredients = undef; # replace NULL with a proper value
#my $product_nutrition_label_widget_result = $api->product_nutrition_label_widget(id => $product_nutrition_label_widget_id, default_css => $product_nutrition_label_widget_default_css, show_optional_nutrients => $product_nutrition_label_widget_show_optional_nutrients, show_zero_values => $product_nutrition_label_widget_show_zero_values, show_ingredients => $product_nutrition_label_widget_show_ingredients);

#
# search_grocery_products test
#
# uncomment below and update the test
#my $search_grocery_products_query = undef; # replace NULL with a proper value
#my $search_grocery_products_min_calories = undef; # replace NULL with a proper value
#my $search_grocery_products_max_calories = undef; # replace NULL with a proper value
#my $search_grocery_products_min_carbs = undef; # replace NULL with a proper value
#my $search_grocery_products_max_carbs = undef; # replace NULL with a proper value
#my $search_grocery_products_min_protein = undef; # replace NULL with a proper value
#my $search_grocery_products_max_protein = undef; # replace NULL with a proper value
#my $search_grocery_products_min_fat = undef; # replace NULL with a proper value
#my $search_grocery_products_max_fat = undef; # replace NULL with a proper value
#my $search_grocery_products_add_product_information = undef; # replace NULL with a proper value
#my $search_grocery_products_offset = undef; # replace NULL with a proper value
#my $search_grocery_products_number = undef; # replace NULL with a proper value
#my $search_grocery_products_result = $api->search_grocery_products(query => $search_grocery_products_query, min_calories => $search_grocery_products_min_calories, max_calories => $search_grocery_products_max_calories, min_carbs => $search_grocery_products_min_carbs, max_carbs => $search_grocery_products_max_carbs, min_protein => $search_grocery_products_min_protein, max_protein => $search_grocery_products_max_protein, min_fat => $search_grocery_products_min_fat, max_fat => $search_grocery_products_max_fat, add_product_information => $search_grocery_products_add_product_information, offset => $search_grocery_products_offset, number => $search_grocery_products_number);

#
# search_grocery_products_by_upc test
#
# uncomment below and update the test
#my $search_grocery_products_by_upc_upc = undef; # replace NULL with a proper value
#my $search_grocery_products_by_upc_result = $api->search_grocery_products_by_upc(upc => $search_grocery_products_by_upc_upc);

#
# visualize_product_nutrition_by_id test
#
# uncomment below and update the test
#my $visualize_product_nutrition_by_id_id = undef; # replace NULL with a proper value
#my $visualize_product_nutrition_by_id_default_css = undef; # replace NULL with a proper value
#my $visualize_product_nutrition_by_id_accept = undef; # replace NULL with a proper value
#my $visualize_product_nutrition_by_id_result = $api->visualize_product_nutrition_by_id(id => $visualize_product_nutrition_by_id_id, default_css => $visualize_product_nutrition_by_id_default_css, accept => $visualize_product_nutrition_by_id_accept);

