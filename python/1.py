def ingresar_numeros(usuario):
    lista_numeros = []
    suma_numeros = 0
    for i in range(usuario):
        aux = int(input(""))
        lista_numeros.append(aux)
        suma_numeros += aux
    lista_numeros.sort()
    
    print("valor maximo:", lista_numeros[-1]) 
    print("valor minimo:", lista_numeros[0]) 
    print("suma numeros:", suma_numeros)
    print("valor promedio:", suma_numeros / usuario)



usuario = int(input(""))
ingresar_numeros(usuario)