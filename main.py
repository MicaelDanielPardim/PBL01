import random
numeros = []
def gerador_numeros(quantidade):
    for a in range(quantidade):
        i= random.randrange(0, 9)
        numeros.append(i)
    print(numeros)
    return numeros
    

quantidade = int(input("Digite um valor para o tamanho da lista:"))
x=gerador_numeros(quantidade)

print("------------------RESULTADO----------------------")
for numero in range(len(numeros)):
    if (numeros[numero] % 2 == 0 ):
        print('{} é um numero par'.format(numeros[numero]))

    if (numeros[numero] % 2 == 1):
        print('{} é um numero impar'.format(numeros[numero]))

    if (numeros[numero] % 3 == 0):
        print('{} é multiplo de 3'.format(numeros[numero]))
