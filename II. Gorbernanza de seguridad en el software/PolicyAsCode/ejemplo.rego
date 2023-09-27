package ejemplo 
default permitido = false                       # default: sin permiso 
#Politica para cumpliento ISO 27001 contro 11.1
permitido = true {                       	    # permitir si:    
	input.ruta = ["obtenerSalario", persona]    
	input.usuario == persona             	    # input usuario es quien consulta el salario
} 

permitido = true {                       	    # permitir si:    
	input.ruta = ["obtenerSalario", persona]    
	jefes := input.jefes[input.usuario][_]   
	contains(jefes, persona)                    # quien consulta es el jefe de la persona
}