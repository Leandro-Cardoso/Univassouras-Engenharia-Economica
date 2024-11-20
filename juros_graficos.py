import matplotlib.pyplot as plt
import numpy as np

# DADOS:
valor_inicial = 5000
taxa = 0.1
periodo = 10
nome_periodo = 'Anos'

# JUROS COMPOSTOS:
valores_compostos_acumulados = []
valor_atual = valor_inicial
for _ in range(periodo):
    valor_atual *= 1 + taxa
    valores_compostos_acumulados.append(valor_atual)

plt.figure(figsize=(10, 6))
plt.plot(range(1, periodo + 1), valores_compostos_acumulados)
plt.xlabel(nome_periodo)
plt.ylabel('Valor Acumulado (R$)')
plt.title('Juros Compostos')
plt.grid(True)

plt.savefig('juros_compostos.png')
plt.close()

# JUROS SIMPLES X JUROS COMPOSTOS:
valores_simples_acumulados = []
valor_atual = valor_inicial
juros = valor_inicial * taxa
for _ in range(periodo):
    valor_atual += juros
    valores_simples_acumulados.append(valor_atual)

plt.figure(figsize=(10, 6))
plt.plot(range(1, periodo + 1), valores_compostos_acumulados, label='Juros Compostos')
plt.plot(range(1, periodo + 1), valores_simples_acumulados, label='Juros Simples')
plt.xlabel(nome_periodo)
plt.ylabel('Valor Acumulado (R$)')
plt.title('Juros Simples x Juros Compostos')
plt.grid(True)

plt.savefig('juros_simples_x_compostos.png')
plt.close()
