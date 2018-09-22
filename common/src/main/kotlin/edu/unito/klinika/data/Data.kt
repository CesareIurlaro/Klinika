package edu.unito.klinika.data

import edu.unito.klinika.annotations.Entity
import edu.unito.klinika.annotations.GeneratedValue
import edu.unito.klinika.annotations.Id

@Entity
class User(@Id @GeneratedValue val id: Long, val name: String)