numero = int(input("Digite um número inteiro positivo para verificar se é primo: "))
    
if numero <= 1:
        print(numero, "não é um número primo.")
else:
        primo = True
        for i in range(2, int(numero**0.5) + 1):
            if numero % i == 0:
                primo = False
                break
        
        if primo:
            print(numero, "é um número primo.")
        else:
            print(numero, "não é um número primo.")