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

// GetWineDescription200Response 
type GetWineDescription200Response struct {
	WineDescription string `json:"wineDescription"`
}

// NewGetWineDescription200Response instantiates a new GetWineDescription200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetWineDescription200Response(wineDescription string) *GetWineDescription200Response {
	this := GetWineDescription200Response{}
	this.WineDescription = wineDescription
	return &this
}

// NewGetWineDescription200ResponseWithDefaults instantiates a new GetWineDescription200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetWineDescription200ResponseWithDefaults() *GetWineDescription200Response {
	this := GetWineDescription200Response{}
	return &this
}

// GetWineDescription returns the WineDescription field value
func (o *GetWineDescription200Response) GetWineDescription() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.WineDescription
}

// GetWineDescriptionOk returns a tuple with the WineDescription field value
// and a boolean to check if the value has been set.
func (o *GetWineDescription200Response) GetWineDescriptionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.WineDescription, true
}

// SetWineDescription sets field value
func (o *GetWineDescription200Response) SetWineDescription(v string) {
	o.WineDescription = v
}

func (o GetWineDescription200Response) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["wineDescription"] = o.WineDescription
	}
	return json.Marshal(toSerialize)
}

type NullableGetWineDescription200Response struct {
	value *GetWineDescription200Response
	isSet bool
}

func (v NullableGetWineDescription200Response) Get() *GetWineDescription200Response {
	return v.value
}

func (v *NullableGetWineDescription200Response) Set(val *GetWineDescription200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableGetWineDescription200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableGetWineDescription200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetWineDescription200Response(val *GetWineDescription200Response) *NullableGetWineDescription200Response {
	return &NullableGetWineDescription200Response{value: val, isSet: true}
}

func (v NullableGetWineDescription200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetWineDescription200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


