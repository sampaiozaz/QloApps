Google Internet LTDA 
Rua, 123
Cidade, Estado, 00000-000
(55) 000-0000
QloApps
27 de agosto de 2026
Dicas de Instalação
Sigam o tutorial https://drive.google.com/file/d/1tAMtuuT7kDGl3n1ksoLA8f_5DMZVuvKz/view?usp=sharing 
e quando chegar na parte de http://qloapps.local, sigam as instruções de https://docs.google.com/document/d/1j-kIOa9FBWo5kfjQd-DW4ZwMnUXk5Wet9rTI-_SIUs0/edit?tab=t.0, da solução 2
Padrão de commits
Vamos usar o padrão de commits chamado Conventional Commits, popularizado pelas convenções do projeto Angular. A sintaxe dele é da seguinte maneira:

<tipo>[escopo opcional]: <descrição>
[corpo opcional]
[rodapé opcional]

A descrição dos commits deve ser feita impreterivelmente em língua portuguesa.

Tags de commit e suas funções:
feat: Adiciona uma nova funcionalidade (feature) ao código.
fix: Corrige um bug no sistema.
docs: Alterações exclusivas na documentação (ex: atualizar o README).
style: Mudanças de formatação que não afetam a lógica do código (espaços em branco, ponto e vírgula, indentação).
refactor: Uma alteração de código que não corrige um bug nem adiciona uma nova funcionalidade (ex: renomear variáveis ou reorganizar pastas).
perf: Uma alteração focada em melhorar o desempenho do código.
test: Adição ou correção de testes automatizados.
chore: Atualizações em tarefas de build, configurações de pacotes, dependências ou ferramentas auxiliares que não modificam o código-fonte principal.
build: Alterações que afetam o sistema de build (construção) do projeto ou dependências externas (ex: configurações do Webpack, NPM, Maven, Gradle).
ci: Alterações nos arquivos e scripts de configuração de Integração Contínua (CI) e Entrega Contínua (CD) (ex: GitHub Actions, GitLab CI, Jenkins, Kokoro).
Padrão de nomenclatura de branches
Rafael Sant'Ana Gabriella de Lima favor atualizar com o padrao que voces estao usando
Ciclo de implementação de uma feature
Criar uma nova branch: siga o padrão ensino pelo Romildo (gitHub Flow): exemplo feature/RFC-00X-localizacao-chegada-traslado (kebab-case) PT-BR (essa será a sua branch principal da sua tarefa)
Crie branchs temporárias para cada coisa específica que você fizer e mande pra essa branch principal da sua feature pra ficar mais organizado.
Dê commits todos os dias seguindo o padrão Conventional Commits.
Dê pull Request seguindo o mesmo padrão de commits.
Quando terminar a feature, dê o merge com a branch main.
Obs: talvez futuramente possamos automatizar isso!!!

1. Padrão para Títulos
2. Padrão para o Conteúdo (Corpo do PR)
Um bom PR deve responder a três perguntas básicas para o revisor: Por que isso foi feito? O que foi feito? Como eu testo?
O que COLOCAR ✅
Contexto (O Porquê): Uma breve explicação do problema que o PR resolve ou da funcionalidade que está entregando.
Resumo das Mudanças (O Quê): Uma lista em tópicos do que foi alterado no código.
Passo a passo para testar: Instruções claras de como o revisor pode rodar a aplicação e validar a sua mudança.
Evidências Visuais: Se houver mudança na interface (UI), adicione Screenshots ou GIFs do "Antes e Depois". Se for backend, adicione exemplos de Requests/Responses ou logs.
Checklist: Uma lista de verificações (testes passaram, linting rodou, documentação atualizada).
O que NÃO COLOCAR ❌
Títulos vagos: Evite títulos como arruma bug, update final, wip (se for Work in Progress, use o recurso de Draft PR do GitHub).
Mudanças não relacionadas (Efeito Frankenstein): Não aproveite um PR de "correção de botão" para refatorar o banco de dados. Um PR deve ter apenas um escopo/foco principal.
Dados sensíveis: Jamais inclua senhas, tokens de API reais ou dados de clientes nas descrições, imagens ou logs do PR.
Textões sem formatação: Não escreva um bloco de texto gigante. Use o Markdown do GitHub (negrito, listas, blocos de código) para facilitar a leitura.
Ataques pessoais ou passivo-agressividade: Se o PR corrige o erro de outro desenvolvedor, foque no problema técnico ("corrige falha na lógica X") e não na pessoa ("arruma o código ruim do fulano").
Exemplo de template

## 📝 Descrição
<!-- Descreva brevemente o que este PR faz e qual problema ele resolve. -->
Resolve: #[Número da Issue/Card]

## 🛠️ O que foi feito
<!-- Liste de forma sucinta as principais mudanças no código -->
- Adicionada a rota `/api/v1/usuarios`
- Criado o componente de botão primário
- Atualizada a query de busca no banco de dados

## 🧪 Como testar
<!-- Explique passo a passo como o revisor pode testar sua mudança -->
1. Faça o checkout para esta branch: `git checkout feat/nome-da-branch`
2. Rode o comando de setup: `npm install`
3. Inicie o servidor: `npm run dev`
4. Acesse a rota `/login` e insira as credenciais de teste (admin / admin).
5. Verifique se o redirecionamento ocorre corretamente.

## 📸 Evidências (Screenshots ou Logs)
<!-- Adicione imagens do Antes e Depois se houver mudanças visuais, ou logs de sucesso -->
| Antes | Depois |
| --- | --- |
| [Imagem Antiga] | [Imagem Nova] |

## ✅ Checklist
- [ ] Meu código segue os padrões do projeto.
- [ ] Adicionei/atualizei os testes necessários.
- [ ] A documentação foi atualizada (se aplicável).
- [ ] Verifiquei se não há dados sensíveis expostos (Senhas, Tokens, etc).
Padrão de logs e mensagens
Fazer logs de mensagens em português-br
