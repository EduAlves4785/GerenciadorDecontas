<h1>Gerenciador de Despesas</h1>

Um aplicativo simples para gerenciar despesas, desenvolvido em Java. Este programa permite que o usuário adicione, remova, liste e calcule o total de despesas, utilizando uma interface de linha de comando (CLI).

Funcionalidades
Adicionar despesa: Adicione uma nova despesa com data, descrição e valor.
Remover despesa: Remova uma despesa existente pelo índice.
Listar despesas: Exibe todas as despesas adicionadas com detalhes.
Calcular total: Calcula o total das despesas listadas.

<hr>
<pre>
+--------------------------------+
|           Inventario           |
+--------------------------------+
| - produtos: List<Produto>      |
+--------------------------------+
| - reescreveId(): int           |
| + adicionarProduto(produto: Produto): void |
| + removerProduto(produtoId: int): void     |
| + listarProdutos(): void       |
| + buscarProduto(produtoId: int): Produto   |
| + calcularValorTotal(): double |
+--------------------------------+

                    |
                    |
                    |
                    ▼

+--------------------------------+
|            Produto             |
+--------------------------------+
| - id: int                      |
| - nome: String                 |
| - preco: double                |
| - quantidade: int              |
+--------------------------------+
| + getId(): int                 |
| + getNome(): String            |
| + getPreco(): double           |
| + getQuantidade(): int         |
| + setId(id: int): void         |
| + setQuantidade(quantidade: int): void |
| + calcularValorTotal(): double |
+--------------------------------+

                    |
                    |
                    |
                    ▼

+--------------------------------+
|           Categoria            |
+--------------------------------+
| - nome: String                 |
| - descricao: String            |
+--------------------------------+
| + getNome(): String            |
| + getDescricao(): String       |
| + setDescricao(descricao: String): void |
+--------------------------------+

</pre>
