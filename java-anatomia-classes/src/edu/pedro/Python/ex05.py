from datetime import date
atual = date.today().year
print('=' * 11)
print('ALISTAMENTO MILITAR')
print('=' * 11)
nome = str(input('Digite o seu nome:'))
sexo = str(input('Qual e o seu sexo ?:')).upper()
if sexo == 'FEMININO':
    print('Você Não precisa se alistar.')
    exit()
nasc = int(input('Ano de nascimento:'))
idade = atual - nasc
print('{} você nasceu em {} é tem {} em {}'.format(nome,nasc, idade, atual))
if idade == 18 or nasc == 2007:
    print('Você tem que se alistar imediatamente')
    print('Você se alista esse ano fica esperto')
elif idade < 18:
    saldo = 18 - idade
    print('Você ainda não tem 18 anos. ainda faltam {} anos para o alistamento'.format(saldo))
    ano = atual + saldo
    print('Você se alistara em {}'.format(ano))
elif idade > 18:
    saldo = idade - 18
    print('Você ja devia ter se alistado há {} ano'.format(saldo))
    ano = atual - saldo
    print('Você se alistou em {}'.format(ano))