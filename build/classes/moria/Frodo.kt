package moria

/**
 *
 * @author Almudena
 */
class Frodo : Personajes {
    //Getter & Setter
    //Declaración de variables
    var isAnillo = false

    //Constructores
    constructor() {}
    constructor(nombre: String?, raza: String?, estado: Boolean, anillo: Boolean) : super(nombre, raza, estado) {
        isAnillo = anillo
    }

    /**
     * Método para que Frodo se ponga el anillo
     * @return true
     */
    fun ponerseAnillo(): Boolean {
        isAnillo = true
        return isAnillo
    }

    /**
     * Método para que Frodo se quite el anillo
     * @return true
     */
    fun quitarseAnillo(): Boolean {
        isAnillo = false
        return isAnillo
    }
}