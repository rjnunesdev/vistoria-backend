package br.com.megavistoria.vistoriabackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VistoriaBackendApplication

fun main(args: Array<String>) {
	runApplication<VistoriaBackendApplication>(*args)
}
