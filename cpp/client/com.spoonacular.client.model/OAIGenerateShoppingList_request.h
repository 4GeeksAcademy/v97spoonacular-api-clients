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
 * OAIGenerateShoppingList_request.h
 *
 * 
 */

#ifndef OAIGenerateShoppingList_request_H
#define OAIGenerateShoppingList_request_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGenerateShoppingList_request : public OAIObject {
public:
    OAIGenerateShoppingList_request();
    OAIGenerateShoppingList_request(QString json);
    ~OAIGenerateShoppingList_request() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getUsername() const;
    void setUsername(const QString &username);
    bool is_username_Set() const;
    bool is_username_Valid() const;

    QString getStartDate() const;
    void setStartDate(const QString &start_date);
    bool is_start_date_Set() const;
    bool is_start_date_Valid() const;

    QString getEndDate() const;
    void setEndDate(const QString &end_date);
    bool is_end_date_Set() const;
    bool is_end_date_Valid() const;

    QString getHash() const;
    void setHash(const QString &hash);
    bool is_hash_Set() const;
    bool is_hash_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString username;
    bool m_username_isSet;
    bool m_username_isValid;

    QString start_date;
    bool m_start_date_isSet;
    bool m_start_date_isValid;

    QString end_date;
    bool m_end_date_isSet;
    bool m_end_date_isValid;

    QString hash;
    bool m_hash_isSet;
    bool m_hash_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGenerateShoppingList_request)

#endif // OAIGenerateShoppingList_request_H
