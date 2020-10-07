package moria

/**
 *
 * @author Almudena
 */
class Accion : Salas {
    var lego = Legolas()

    //Getter & Setter
    var flechasDesperdigadas = 0
    var enemigos = 0

    //Constructores
    constructor(lego: Legolas) {
        this.lego = lego
    }

    constructor(num_sala: Int, peligro: String?, flechasDesperdigadas: Int, enemigos: Int, lego: Legolas) : super(num_sala, peligro) {
        this.flechasDesperdigadas = flechasDesperdigadas
        this.enemigos = enemigos
        this.lego = lego
    }

}