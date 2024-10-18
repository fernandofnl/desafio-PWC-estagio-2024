def separar_endereco(endereco_completo):

    # separa o endereco_completo e armazena em uma lista
    lista = endereco_completo.split()

    # compara se a lista possui 2 elementos
    if len(lista) == 2:
        endereco = lista[0]
        numero = lista[1]

    else:
        # verifica se o último elemento é um dígito
        if lista[-1].isdigit():
            # concatenar os elementos da lista fornecida em uma única string, inserindo um espaço (' ') 
            endereco = ' '.join(lista[:-1])
            numero = lista[-1]  

        # verifica se o penúltimo elemento da lista é um dígito 
        elif lista[-2].isdigit():
            endereco = ' '.join(lista[:-2])
            numero = ' '.join(lista[-2:])

        # verifica se o primeiro elemento da lista é um dígito    
        elif lista[0].isdigit():
            endereco = ' '.join(lista[1:])
            numero = lista[0]

        # verifica se no endereco fornecido na entrada contém ', '    
        if ', ' in endereco_completo:
            lista = endereco_completo.split(', ')
            
            # verifica se o segundo elemento da lista é maior que o primeiro elemento
            if len(lista[1]) > len(lista[0]):
                endereco = lista[1]
                numero = lista[0]
            else:
                endereco = lista[0]
                numero = lista[1]

        # verifica se o texto 'No ' está contido no endereco fornecido
        elif 'No' in endereco_completo:
            indice = lista.index('No')
            endereco = ' '.join(lista[:indice])
            numero = ' '.join(lista[indice:]) 

    return (endereco, numero)

def exibir(lista_de_enderecos):
    for endereco in lista_de_enderecos:
        print('\n')
        resultado = separar_endereco(endereco)
        print(resultado)

def main():

    lista_de_casos = [['Miritiba 339','Babaçu 500','Cambuí 804B'],
    ['Rio Branco 23','Quirino dos Santos 23 b'],
    ['4, Rue de la République','100 Broadway Av','Calle Sagasta, 26','Calle 44 No 1991']]

    for caso in lista_de_casos:
        exibir(caso)
        print()


main()