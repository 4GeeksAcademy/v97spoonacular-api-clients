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

/*
 * OAIGetComparableProducts_200_response_comparableProducts.h
 *
 * 
 */

#ifndef OAIGetComparableProducts_200_response_comparableProducts_H
#define OAIGetComparableProducts_200_response_comparableProducts_H

#include <QJsonObject>

#include "com.spoonacular.client.model\OAIGetComparableProducts_200_response_comparableProducts_protein_inner.h"
#include "com.spoonacular.client.model\OAIObject.h"
#include <QList>
#include <QSet>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIGetComparableProducts_200_response_comparableProducts_protein_inner;

class OAIGetComparableProducts_200_response_comparableProducts : public OAIObject {
public:
    OAIGetComparableProducts_200_response_comparableProducts();
    OAIGetComparableProducts_200_response_comparableProducts(QString json);
    ~OAIGetComparableProducts_200_response_comparableProducts() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAIObject> getCalories() const;
    void setCalories(const QList<OAIObject> &calories);
    bool is_calories_Set() const;
    bool is_calories_Valid() const;

    QList<OAIObject> getLikes() const;
    void setLikes(const QList<OAIObject> &likes);
    bool is_likes_Set() const;
    bool is_likes_Valid() const;

    QList<OAIObject> getPrice() const;
    void setPrice(const QList<OAIObject> &price);
    bool is_price_Set() const;
    bool is_price_Valid() const;

    QSet<OAIGetComparableProducts_200_response_comparableProducts_protein_inner> getProtein() const;
    void setProtein(const QSet<OAIGetComparableProducts_200_response_comparableProducts_protein_inner> &protein);
    bool is_protein_Set() const;
    bool is_protein_Valid() const;

    QSet<OAIGetComparableProducts_200_response_comparableProducts_protein_inner> getSpoonacularScore() const;
    void setSpoonacularScore(const QSet<OAIGetComparableProducts_200_response_comparableProducts_protein_inner> &spoonacular_score);
    bool is_spoonacular_score_Set() const;
    bool is_spoonacular_score_Valid() const;

    QList<OAIObject> getSugar() const;
    void setSugar(const QList<OAIObject> &sugar);
    bool is_sugar_Set() const;
    bool is_sugar_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAIObject> calories;
    bool m_calories_isSet;
    bool m_calories_isValid;

    QList<OAIObject> likes;
    bool m_likes_isSet;
    bool m_likes_isValid;

    QList<OAIObject> price;
    bool m_price_isSet;
    bool m_price_isValid;

    QSet<OAIGetComparableProducts_200_response_comparableProducts_protein_inner> protein;
    bool m_protein_isSet;
    bool m_protein_isValid;

    QSet<OAIGetComparableProducts_200_response_comparableProducts_protein_inner> spoonacular_score;
    bool m_spoonacular_score_isSet;
    bool m_spoonacular_score_isValid;

    QList<OAIObject> sugar;
    bool m_sugar_isSet;
    bool m_sugar_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetComparableProducts_200_response_comparableProducts)

#endif // OAIGetComparableProducts_200_response_comparableProducts_H
