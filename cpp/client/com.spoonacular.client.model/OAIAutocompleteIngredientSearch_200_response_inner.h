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
 * OAIAutocompleteIngredientSearch_200_response_inner.h
 *
 * 
 */

#ifndef OAIAutocompleteIngredientSearch_200_response_inner_H
#define OAIAutocompleteIngredientSearch_200_response_inner_H

#include <QJsonObject>

#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIAutocompleteIngredientSearch_200_response_inner : public OAIObject {
public:
    OAIAutocompleteIngredientSearch_200_response_inner();
    OAIAutocompleteIngredientSearch_200_response_inner(QString json);
    ~OAIAutocompleteIngredientSearch_200_response_inner() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    QString getImage() const;
    void setImage(const QString &image);
    bool is_image_Set() const;
    bool is_image_Valid() const;

    qint32 getId() const;
    void setId(const qint32 &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QString getAisle() const;
    void setAisle(const QString &aisle);
    bool is_aisle_Set() const;
    bool is_aisle_Valid() const;

    QList<QString> getPossibleUnits() const;
    void setPossibleUnits(const QList<QString> &possible_units);
    bool is_possible_units_Set() const;
    bool is_possible_units_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString name;
    bool m_name_isSet;
    bool m_name_isValid;

    QString image;
    bool m_image_isSet;
    bool m_image_isValid;

    qint32 id;
    bool m_id_isSet;
    bool m_id_isValid;

    QString aisle;
    bool m_aisle_isSet;
    bool m_aisle_isValid;

    QList<QString> possible_units;
    bool m_possible_units_isSet;
    bool m_possible_units_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIAutocompleteIngredientSearch_200_response_inner)

#endif // OAIAutocompleteIngredientSearch_200_response_inner_H
