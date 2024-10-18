# Desafio de Código - PWC

### Entrada: string de endereço com os dados concatenados.
### Saída: string da rua e string do número da rua.

1. Casos Simples:
- “Miritiba 339” -> {“Miritiba”, “339”}
- “Babaçu 500” -> { “Babaçu”, “500”}
- “Cambuí 804B” -> {“Cambuí”, “804B”}

2. Considere os casos mais complicados:
- “Rio Branco 23” -> {“Rio Branco”, “23”}
- “Quirino dos Santos 23 b” -> {“Quirino dos Santos”, ”23 b”}

3. Considere endereços de outros países (casos complexos)
- “4, Rue de la République” -> {"Rue de la République", "4"}
- “100 Broadway Av” -> {"Broadway Av", "100"}
- “Calle Sagasta, 26” -> {“Calle Sagasta”, “26”}
- “Calle 44 No 1991” -> {“Calle 44”, “No 1991”}
