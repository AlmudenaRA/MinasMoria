package moria

/**
 *
 * @author Almudena
 */
open class Personajes {
    //Getter & Setter
    //Declaración de variables
    var nombre: String? = null
    var raza: String? = null
    var isEstado = false

    //Constructores
    constructor() {}
    constructor(nombre: String?, raza: String?, estado: Boolean) {
        this.nombre = nombre
        this.raza = raza
        isEstado = estado
    }

}