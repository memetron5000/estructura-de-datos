informacion = { "Juan1223" : "J12an*", "Maria2345" : "M23a*", "Pablo1459" : "P14o*" , "Ana3456" : "A34a*"}
intentos= 0
while intentos < 3:    
    usuario = input("Ingrese el usuario: ")
    if usuario in informacion:
        contra = input("Ingrese la contraseña: ")
        if contra == informacion[usuario]:
            print("Acceso permitido\n")
        else:
            intentos+=1
            print("Datos incorrectos\n")
    else:
        print("usuario no registrado\n")
        intentos+=1
    if intentos==3:
        print("Lo siento, su acceso no es permitido\n")
        break



