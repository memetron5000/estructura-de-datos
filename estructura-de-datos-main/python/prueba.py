def control_acceso(usuario, contraseña):
    lista_usuario = ["Juan1223", "Maria2345", "Pablo1459", "Ana3456"]
    lista_pass = ["J12an", "M23a", "P14o", "A34a"]
    ingreso = lista_usuario.index(usuario)
    if usuario in lista_usuario:
        if contraseña == lista_pass[ingreso]:
            print("Acceso permitido")
        else:
            print("Datos incorrectos")

    

prueba_usuario = input("")
prueba_pass = input("")

control_acceso(prueba_usuario, prueba_pass)
