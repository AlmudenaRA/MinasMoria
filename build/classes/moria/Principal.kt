package moria

/**
 *
 * @author Almudena
 */
object Principal {
    @JvmStatic
    fun main(args: Array<String>) {
        //Declaración de variables  
        val gan = Gandalf()
        val lego = Legolas()
        val frodo = Frodo()
        val magi = Magica(gan)
        val accion = Accion(lego)
        val habili = Habilidad(frodo)
        var muerto = false
        var anill: Boolean
        var salas = 0
        var sala: Int
        var maligno: Int
        var flechasDesper: Int
        var enemigos: Int
        var contSalaMagi = 0
        var contSalaAcci = 0
        var contSalaHabi = 0
        var ganar: Int
        var huir: Int
        var ani: Int
        val totalSalas: Int
        do {
            sala = (Math.random() * 3).toInt() + 1
            if (sala == 1) {
                println("-------------------------")
                println("-------------------------")
                println("Esta sala es Mágica ")
                println("-------------------------")
                println("-------------------------")
                maligno = (Math.random() * 10).toInt() + 1
                magi.poderMaligno = maligno
                println("Poder maligno de la sala: " + magi.poderMaligno)
                println("Poder actual de la vara: " + gan.poderVara())
                //Preguntar si quiere recargar la vara
                println("Gándalf está recargando su vara")
                gan.recargarVara(10) //Llamada al método para recargar la vara                                
                println("Poder de la vara: " + gan.poderVara())
                if (gan.poder > magi.poderMaligno) { //Poder de la vara mayor al maligno de la sala
                    contSalaMagi++
                    println("Gándalf ha conseguido pasar de sala, porque su poder es mayor")
                } else {
                    if (gan.poder == magi.poderMaligno) { //Poder de la vara igual al maligno de la sala
                        ganar = (Math.random() * 100).toInt() + 1
                        if (ganar > 40) {
                            contSalaMagi++
                            println("Gándalf ha conseguido pasar de sala, porque ha ganado")
                        } else {
                            huir = (Math.random() * 100).toInt() + 1
                            if (huir > 20) {
                                contSalaMagi++
                                println("Gándalf ha conseguido huir de sala")
                            } else {
                                muerto = true
                            }
                        }
                    } else { //Poder de la vara menor al maligno de la sala
                        ganar = (Math.random() * 100).toInt() + 1
                        if (ganar > 70) {
                            contSalaMagi++
                            println("Gándalf ha conseguido pasar de sala, porque ha ganado")
                        } else {
                            huir = (Math.random() * 100).toInt() + 1
                            if (huir > 20) {
                                contSalaMagi++
                                println("Gándalf ha conseguido huir de sala")
                            } else {
                                muerto = true
                                println("Gándalf no ha conseguido pasar la sala")
                            }
                        }
                    }
                }
                gan.poder = 0
            } else {
                if (sala == 2) {
                    println("-------------------------")
                    println("-------------------------")
                    println("Esta sala es de Acción ")
                    println("-------------------------")
                    println("-------------------------")
                    flechasDesper = (Math.random() * 10).toInt() + 1
                    accion.flechasDesperdigadas = flechasDesper
                    println("Hay " + accion.flechasDesperdigadas + " flechas desperdigadas")
                    enemigos = (Math.random() * 10).toInt() + 1
                    accion.enemigos = enemigos
                    println("Hay " + accion.enemigos + " enemigos en la sala.")
                    if (lego.flechas <= 5) {
                        lego.recargarCarcaj(5)
                    }
                    println("Légolas tiene " + lego.flechas + " flechas.")
                    do {
                        lego.lanzarFlecha()
                        println("Légolas ha lanzado una flecha, le quedan " + lego.flechas)
                        enemigos--
                        println("Un enemigo ha muerto, quedan $enemigos")
                    } while (lego.flechas > 0 && enemigos != 0)
                    if (lego.flechas == 0) {
                        huir = (Math.random() * 100).toInt() + 1
                        if (huir > 20) {
                            contSalaAcci++
                            println("Légolas ha conseguido huir de sala")
                        } else {
                            muerto = true
                            println("Légolas no ha conseguido pasar la sala")
                        }
                    }
                    if (enemigos == 0) {
                        contSalaAcci++
                        lego.recargarCarcaj(lego.flechas)
                        println("Légolas ha conseguido pasar de sala con " + lego.flechas + " flechas")
                    }
                } else {
                    println("-------------------------")
                    println("-------------------------")
                    println("Esta sala es de Habilidad ")
                    println("-------------------------")
                    println("-------------------------")
                    ani = (Math.random() * 100).toInt() + 1
                    if (ani < 50) {
                        anill = habili.frodo.ponerseAnillo()
                        println("Frodo se ha puesto el anillo")
                    } else {
                        anill = habili.frodo.quitarseAnillo()
                        println("Frodo se ha quitado el anillo")
                    }
                    if (anill == true) {
                        ganar = (Math.random() * 100).toInt() + 1
                        if (ganar > 10) {
                            contSalaHabi++
                            println("y ha conseguido pasar de sala")
                        } else {
                            huir = (Math.random() * 100).toInt() + 1
                            if (huir > 20) {
                                contSalaHabi++
                                println("y ha conseguido huir de sala")
                            } else {
                                muerto = true
                                println("pero no ha conseguido pasar la sala")
                            }
                        }
                    } else {
                        ganar = (Math.random() * 100).toInt() + 1
                        if (ganar > 80) {
                            contSalaHabi++
                            println("pero ha conseguido pasar de sala")
                        } else {
                            huir = (Math.random() * 100).toInt() + 1
                            if (huir > 20) {
                                contSalaHabi++
                                println("pero ha conseguido huir de sala")
                            } else {
                                muerto = true
                                println("y no ha conseguido pasar la sala")
                            }
                        }
                    }
                }
            }
            salas++
        } while (!muerto && salas < 36)
        println("---------------------------------------------------")
        println("\t \t RESUMEN FINAL")
        println("---------------------------------------------------")
        totalSalas = contSalaMagi + contSalaAcci + contSalaHabi
        if (muerto || salas < 36) {
            println("Gandalf, Légolas y Frodo no han conseguido superar las salas")
            println("Pero han conseguido pasar $totalSalas salas")
            println("Gandalf ha conseguido pasar $contSalaMagi salas")
            println("Légolas ha conseguido pasar $contSalaAcci salas")
            println("Frodo ha conseguido pasar $contSalaHabi salas")
        } else {
            println("Gandalf, Légolas y Frodo han conseguido superar las salas")
            println("Han conseguido pasar las $totalSalas salas")
            println("Gandalf ha conseguido pasar $contSalaMagi salas")
            println("Légolas ha conseguido pasar $contSalaAcci salas")
            println("Frodo ha conseguido pasar $contSalaHabi salas")
        }
    }
}