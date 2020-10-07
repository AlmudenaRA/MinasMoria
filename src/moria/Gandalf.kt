package moria

/**
 *
 * @author Almudena
 */
class Gandalf : Personajes {
    //Getter & Setter
    //Declaración de variables
    var poder = 0

    //Constructores
    constructor() {}
    constructor(nombre: String?, raza: String?, estado: Boolean, poder: Int) : super(nombre, raza, estado) {
        this.poder = poder
    }

    /**
     * Método para recargar la vara con la energía que le pasemos
     * @param energia
     */
    fun recargarVara(energia: Int) {
        poder = poder + energia
    }

    /**
     * Método que devuelve el nivel actual de energía de la vara
     * @return energía de la vara
     */
    fun poderVara(): Int {
        return poder
    }
}