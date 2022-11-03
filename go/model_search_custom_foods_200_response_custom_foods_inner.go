/*
spoonacular API

The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

API version: 1.1
Contact: mail@spoonacular.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// SearchCustomFoods200ResponseCustomFoodsInner struct for SearchCustomFoods200ResponseCustomFoodsInner
type SearchCustomFoods200ResponseCustomFoodsInner struct {
	Id int32 `json:"id"`
	Title string `json:"title"`
	Servings float32 `json:"servings"`
	ImageUrl string `json:"imageUrl"`
	Price float32 `json:"price"`
}

// NewSearchCustomFoods200ResponseCustomFoodsInner instantiates a new SearchCustomFoods200ResponseCustomFoodsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSearchCustomFoods200ResponseCustomFoodsInner(id int32, title string, servings float32, imageUrl string, price float32) *SearchCustomFoods200ResponseCustomFoodsInner {
	this := SearchCustomFoods200ResponseCustomFoodsInner{}
	this.Id = id
	this.Title = title
	this.Servings = servings
	this.ImageUrl = imageUrl
	this.Price = price
	return &this
}

// NewSearchCustomFoods200ResponseCustomFoodsInnerWithDefaults instantiates a new SearchCustomFoods200ResponseCustomFoodsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSearchCustomFoods200ResponseCustomFoodsInnerWithDefaults() *SearchCustomFoods200ResponseCustomFoodsInner {
	this := SearchCustomFoods200ResponseCustomFoodsInner{}
	return &this
}

// GetId returns the Id field value
func (o *SearchCustomFoods200ResponseCustomFoodsInner) GetId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *SearchCustomFoods200ResponseCustomFoodsInner) GetIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *SearchCustomFoods200ResponseCustomFoodsInner) SetId(v int32) {
	o.Id = v
}

// GetTitle returns the Title field value
func (o *SearchCustomFoods200ResponseCustomFoodsInner) GetTitle() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Title
}

// GetTitleOk returns a tuple with the Title field value
// and a boolean to check if the value has been set.
func (o *SearchCustomFoods200ResponseCustomFoodsInner) GetTitleOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Title, true
}

// SetTitle sets field value
func (o *SearchCustomFoods200ResponseCustomFoodsInner) SetTitle(v string) {
	o.Title = v
}

// GetServings returns the Servings field value
func (o *SearchCustomFoods200ResponseCustomFoodsInner) GetServings() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Servings
}

// GetServingsOk returns a tuple with the Servings field value
// and a boolean to check if the value has been set.
func (o *SearchCustomFoods200ResponseCustomFoodsInner) GetServingsOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Servings, true
}

// SetServings sets field value
func (o *SearchCustomFoods200ResponseCustomFoodsInner) SetServings(v float32) {
	o.Servings = v
}

// GetImageUrl returns the ImageUrl field value
func (o *SearchCustomFoods200ResponseCustomFoodsInner) GetImageUrl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ImageUrl
}

// GetImageUrlOk returns a tuple with the ImageUrl field value
// and a boolean to check if the value has been set.
func (o *SearchCustomFoods200ResponseCustomFoodsInner) GetImageUrlOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ImageUrl, true
}

// SetImageUrl sets field value
func (o *SearchCustomFoods200ResponseCustomFoodsInner) SetImageUrl(v string) {
	o.ImageUrl = v
}

// GetPrice returns the Price field value
func (o *SearchCustomFoods200ResponseCustomFoodsInner) GetPrice() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Price
}

// GetPriceOk returns a tuple with the Price field value
// and a boolean to check if the value has been set.
func (o *SearchCustomFoods200ResponseCustomFoodsInner) GetPriceOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Price, true
}

// SetPrice sets field value
func (o *SearchCustomFoods200ResponseCustomFoodsInner) SetPrice(v float32) {
	o.Price = v
}

func (o SearchCustomFoods200ResponseCustomFoodsInner) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["id"] = o.Id
	}
	if true {
		toSerialize["title"] = o.Title
	}
	if true {
		toSerialize["servings"] = o.Servings
	}
	if true {
		toSerialize["imageUrl"] = o.ImageUrl
	}
	if true {
		toSerialize["price"] = o.Price
	}
	return json.Marshal(toSerialize)
}

type NullableSearchCustomFoods200ResponseCustomFoodsInner struct {
	value *SearchCustomFoods200ResponseCustomFoodsInner
	isSet bool
}

func (v NullableSearchCustomFoods200ResponseCustomFoodsInner) Get() *SearchCustomFoods200ResponseCustomFoodsInner {
	return v.value
}

func (v *NullableSearchCustomFoods200ResponseCustomFoodsInner) Set(val *SearchCustomFoods200ResponseCustomFoodsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableSearchCustomFoods200ResponseCustomFoodsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableSearchCustomFoods200ResponseCustomFoodsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSearchCustomFoods200ResponseCustomFoodsInner(val *SearchCustomFoods200ResponseCustomFoodsInner) *NullableSearchCustomFoods200ResponseCustomFoodsInner {
	return &NullableSearchCustomFoods200ResponseCustomFoodsInner{value: val, isSet: true}
}

func (v NullableSearchCustomFoods200ResponseCustomFoodsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSearchCustomFoods200ResponseCustomFoodsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


