package moria

/**
 *
 * @author Almudena
 */
class Habilidad : Salas {
    var frodo = Frodo()

    //Constructor
    constructor(frodo: Frodo) {
        this.frodo = frodo
    }

    constructor(num_sala: Int, peligro: String?, frodo: Frodo) : super(num_sala, peligro) {
        this.frodo = frodo
    }
}