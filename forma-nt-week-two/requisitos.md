EXERCICIOS
1 - Implemente um método que receba um número e imprima o resultado do fatorial deste número.
2 - Implemente a cifra de César para criptografar e descriptografar uma mensagem.
    A aplicação deve:
        
COLETAR DADOS:
          • Receber um texto
          • Receber um número
OFERECER OPÇÕES:
        1 - para criptografar
        2- para descriptografar
REALIZAR A AÇÃO SELECIONADA E IMPRIMIR O RESULTADO NA TELA:

3 -  Implemente a cifra de Vigenère para criptografar e descriptografar uma mensagem.
    A aplicação deve:
        
COLETAR DADOS:
          • Receber um texto
          • Receber uma palavra chave
OFERECER OPÇÕES:
        1 - para criptografar
        2- para descriptografar
REALIZAR A AÇÃO SELECIONADA E IMPRIMIR O RESULTADO NA TELA:
4 - Crie uma interface chamada usuário, ela deve possuir os seguintes métodos:
        
METODOS DA INTERFACE

            + Double getValorDesconto(double valorProduto)

            + String getTipoUsuario()

            + Double getValorFreteDesconto(double valorValorFrete, double valorProduto)

    Agora crie 3 classes que implemente esta interface
USUARIO BASE
  getValorDesconto = ganha 5% se o valorProduto for maior que 300 reais
  getTipoUsuario = retorna que é base
  getValorFreteDesconto = ganha 5% se o valorProduto for maior que 300 reais

USUARIO STANDART
  getValorDesconto = ganha 15% se o valorProduto for maior que 200 reais
  getTipoUsuario = retorna que é standart
  getValorFreteDesconto = ganha 10% se o valorProduto for maior que 200 reais
  
USUARIO PREMIUM
  getValorDesconto = ganha 30% se o valorProduto for maior que 200 reais
  getTipoUsuario = retorna que é premium
  getValorFreteDesconto = ganha frete grátis se o valorProduto for maior que 100 reais

    Crie um menu que instancie 3 usuário, cada um implementado com um tipo diferente, passe o mesmo valor de produto e frete para todos    Apresente a diferença no console 
