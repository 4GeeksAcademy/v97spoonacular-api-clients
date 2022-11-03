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

// GetRecipeIngredientsByID200ResponseIngredientsInner struct for GetRecipeIngredientsByID200ResponseIngredientsInner
type GetRecipeIngredientsByID200ResponseIngredientsInner struct {
	Amount *GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmount `json:"amount,omitempty"`
	Image string `json:"image"`
	Name string `json:"name"`
}

// NewGetRecipeIngredientsByID200ResponseIngredientsInner instantiates a new GetRecipeIngredientsByID200ResponseIngredientsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetRecipeIngredientsByID200ResponseIngredientsInner(image string, name string) *GetRecipeIngredientsByID200ResponseIngredientsInner {
	this := GetRecipeIngredientsByID200ResponseIngredientsInner{}
	this.Image = image
	this.Name = name
	return &this
}

// NewGetRecipeIngredientsByID200ResponseIngredientsInnerWithDefaults instantiates a new GetRecipeIngredientsByID200ResponseIngredientsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetRecipeIngredientsByID200ResponseIngredientsInnerWithDefaults() *GetRecipeIngredientsByID200ResponseIngredientsInner {
	this := GetRecipeIngredientsByID200ResponseIngredientsInner{}
	return &this
}

// GetAmount returns the Amount field value if set, zero value otherwise.
func (o *GetRecipeIngredientsByID200ResponseIngredientsInner) GetAmount() GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmount {
	if o == nil || o.Amount == nil {
		var ret GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmount
		return ret
	}
	return *o.Amount
}

// GetAmountOk returns a tuple with the Amount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetRecipeIngredientsByID200ResponseIngredientsInner) GetAmountOk() (*GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmount, bool) {
	if o == nil || o.Amount == nil {
		return nil, false
	}
	return o.Amount, true
}

// HasAmount returns a boolean if a field has been set.
func (o *GetRecipeIngredientsByID200ResponseIngredientsInner) HasAmount() bool {
	if o != nil && o.Amount != nil {
		return true
	}

	return false
}

// SetAmount gets a reference to the given GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmount and assigns it to the Amount field.
func (o *GetRecipeIngredientsByID200ResponseIngredientsInner) SetAmount(v GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmount) {
	o.Amount = &v
}

// GetImage returns the Image field value
func (o *GetRecipeIngredientsByID200ResponseIngredientsInner) GetImage() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Image
}

// GetImageOk returns a tuple with the Image field value
// and a boolean to check if the value has been set.
func (o *GetRecipeIngredientsByID200ResponseIngredientsInner) GetImageOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Image, true
}

// SetImage sets field value
func (o *GetRecipeIngredientsByID200ResponseIngredientsInner) SetImage(v string) {
	o.Image = v
}

// GetName returns the Name field value
func (o *GetRecipeIngredientsByID200ResponseIngredientsInner) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *GetRecipeIngredientsByID200ResponseIngredientsInner) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *GetRecipeIngredientsByID200ResponseIngredientsInner) SetName(v string) {
	o.Name = v
}

func (o GetRecipeIngredientsByID200ResponseIngredientsInner) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Amount != nil {
		toSerialize["amount"] = o.Amount
	}
	if true {
		toSerialize["image"] = o.Image
	}
	if true {
		toSerialize["name"] = o.Name
	}
	return json.Marshal(toSerialize)
}

type NullableGetRecipeIngredientsByID200ResponseIngredientsInner struct {
	value *GetRecipeIngredientsByID200ResponseIngredientsInner
	isSet bool
}

func (v NullableGetRecipeIngredientsByID200ResponseIngredientsInner) Get() *GetRecipeIngredientsByID200ResponseIngredientsInner {
	return v.value
}

func (v *NullableGetRecipeIngredientsByID200ResponseIngredientsInner) Set(val *GetRecipeIngredientsByID200ResponseIngredientsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableGetRecipeIngredientsByID200ResponseIngredientsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableGetRecipeIngredientsByID200ResponseIngredientsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetRecipeIngredientsByID200ResponseIngredientsInner(val *GetRecipeIngredientsByID200ResponseIngredientsInner) *NullableGetRecipeIngredientsByID200ResponseIngredientsInner {
	return &NullableGetRecipeIngredientsByID200ResponseIngredientsInner{value: val, isSet: true}
}

func (v NullableGetRecipeIngredientsByID200ResponseIngredientsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetRecipeIngredientsByID200ResponseIngredientsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


