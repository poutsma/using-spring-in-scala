package org.springframework.scala.demo.scalaconfig

/**
 * @author Arjen Poutsma
 */
class InitializablePerson(firstName: String, lastName: String)
		extends Person(firstName, lastName) {

	var initialised = false

	def initialize() {
		initialised = true
	}

	def destroy() {
		initialised = false
	}
}
