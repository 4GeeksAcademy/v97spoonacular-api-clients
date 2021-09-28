# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.spoonacular.client.Model.InlineResponse20010 do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"ingredients",
    :"totalCost",
    :"totalCostPerServing"
  ]

  @type t :: %__MODULE__{
    :"ingredients" => [InlineResponse20010Ingredients],
    :"totalCost" => float(),
    :"totalCostPerServing" => float()
  }
end

defimpl Poison.Decoder, for: com.spoonacular.client.Model.InlineResponse20010 do
  import com.spoonacular.client.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"ingredients", :list, com.spoonacular.client.Model.InlineResponse20010Ingredients, options)
  end
end
