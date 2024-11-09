<h1>Gerenciador de Despesas</h1>

Um aplicativo simples para gerenciar despesas, desenvolvido em Java. Este programa permite que o usuário adicione, remova, liste e calcule o total de despesas, utilizando uma interface de linha de comando (CLI).

Funcionalidades
Adicionar despesa: Adicione uma nova despesa com data, descrição e valor.
Remover despesa: Remova uma despesa existente pelo índice.
Listar despesas: Exibe todas as despesas adicionadas com detalhes.
Calcular total: Calcula o total das despesas listadas.

<hr>
<pre>
+-------------------+
|      Program      |
+-------------------+
| - despesas: List<Despesa> |
| - gerencia: Gerenciador   |
| - exit: char              |
+---------------------------+
| + main(args: String[]): void |
+---------------------------+
             |
             |
             v
+---------------------------+
|       Gerenciador         |
+---------------------------+
| - despesas: List<Despesa> |
+---------------------------+
| + Gerenciador(despesas: List<Despesa>) |
| + adicionarDespesa(despesa: Despesa): void |
| + removerDespesa(indice: int): void        |
| + listarDespesas(): void                   |
| + calcularTotal(): Double                  |
+---------------------------+
             |
             |
             v
+---------------------------+
|         Despesa           |
+---------------------------+
| - data: LocalDate         |
| - descricao: String       |
| - valor: Double           |
+---------------------------+
| + getData(): LocalDate    |
| + getDescricao(): String  |
| + getValor(): Double      |
| + toString(): String      |
+---------------------------+
</pre>
