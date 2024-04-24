#é a número 4 repetida
acimaDos90kg= []
somaIdade= 0

for i in range(1,8):
    peso = int(input(f"Digite o peso da {i}º pessoa"))
    acimaDos90kg.append(peso)
    idade = int(input(f"Digite a idade da {i}º pessoa"))
    somaIdade += idade
    
total = sum(1 for peso in acimaDos90kg if peso >= 90)
print("Quantidade de pessoas com mais de 90 quilos: ", total)

media = somaIdade / 7
print("A média de idade das pessoas é ", total)