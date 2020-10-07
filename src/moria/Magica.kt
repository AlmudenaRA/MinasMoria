package moria

/**
 *
 * @author Almudena
 */
class Magica : Salas {
    var gan = Gandalf()

    //Getter & Setter
    var poderMaligno = 0

    //Constructores
    constructor(gan: Gandalf) {
        this.gan = gan
    }

    constructor(num_sala: Int, peligro: String?, poderMaligno: Int, gan: Gandalf) : super(num_sala, peligro) {
        this.poderMaligno = poderMaligno
        this.gan = gan
    }

}