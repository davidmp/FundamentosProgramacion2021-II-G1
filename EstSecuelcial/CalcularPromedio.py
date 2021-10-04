def calcularPromedioNotasDMP():
  print("Calcular Promedio final de FP")
  #Datos de Entrada
  nota1=int(input("ingrese nota de evaluacion 1:"))
  nota2=int(input("ingrese nota de evaluacion 2:"))
  nota3=int(input("ingrese nota de evaluacion 3:"))
  nota4=int(input("ingrese nota de evaluacion 4:"))
  nota5=int(input("ingrese nota de evaluacion 5:"))
  nota6=int(input("ingrese nota de evaluacion 6:"))
  nota7=int(input("ingrese nota de evaluacion 7:"))
  #Prceso
  proFin=(0.15*nota1)+(0.15*nota2)+(0.10*nota3)+(0.15*nota4)+(0.05*nota5)+(0.10*nota6)+(0.30*nota7)
  #Datos de Salida
  print(type(proFin))
  print("El promedio Final es:", round(proFin,2))

def saludoDMP():
  print("Hola Mundo")

#calcularPromedioNotasDMP()
saludoDMP()

