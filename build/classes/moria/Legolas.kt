package moria

/**
 *
 * @author Almudena
 */
class Legolas : Personajes {
    //Getter & Setter
    //Declaración de variables
    var flechas = 0

    //Constructores
    constructor() {}
    constructor(nombre: String?, raza: String?, estado: Boolean, flechas: Int) : super(nombre, raza, estado) {
        this.flechas = flechas
    }

    /**
     * Método que lanza una flecha y se resta del carcaj
     *
     */
    fun lanzarFlecha() {
        flechas = flechas - 1
    }

    /**
     * Método que aumenta las flechas con una cantidad indicada
     * @param flechas
     */
    fun recargarCarcaj(flechas: Int) {
        this.flechas = this.flechas + flechas
    }
}