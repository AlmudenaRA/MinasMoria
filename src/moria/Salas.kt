package moria

/**
 *
 * @author Almudena
 */
open class Salas {
    //Declaración variables
    private val num_sala: Int

    //Getter & Setter
    var peligro: String? = null

    //Constructores
    constructor() {
        num_sala = 36
    }

    constructor(num_sala: Int, peligro: String?) {
        this.num_sala = 36
        this.peligro = peligro
    }

}