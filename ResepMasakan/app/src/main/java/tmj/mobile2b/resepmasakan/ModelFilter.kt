package tmj.mobile2b.resepmasakan

import java.io.Serializable

class ModelFilter : Serializable {
    var idMeal: String? = null

    @JvmField
    var strMeal: String? = null

    @JvmField
    var strMealThumb: String? = null
}