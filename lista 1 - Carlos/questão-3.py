pares= []
for i in range(1,11):
    numero = int(input(f"Digite o {i}º número"))
    pares.append(numero)
total = sum(1 for numero in pares if numero % 2 == 0)
print("Total de pares é", total)