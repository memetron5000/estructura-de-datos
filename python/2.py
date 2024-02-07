cont=0 #contador de veces que aparece la palabra en
archivo=open("test_pr2.txt","r")
for i in archivo:
    j=i.split(" ")
    num=j.count("en")
    cont=cont+num
print('la palabra "en" aparece',cont, 'veces en total')   